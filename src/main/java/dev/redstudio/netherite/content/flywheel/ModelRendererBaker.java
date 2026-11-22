package dev.redstudio.netherite.content.flywheel;

import com.jozufozu.flywheel.backend.gl.attrib.VertexFormat;
import com.jozufozu.flywheel.backend.gl.buffer.VecBuffer;
import com.jozufozu.flywheel.core.Formats;
import com.jozufozu.flywheel.core.model.IModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import java.util.ArrayList;
import java.util.List;

public class ModelRendererBaker {

    /**
     * Bakes any EntityModel into a single Flywheel IModel by capturing its rendered vertices.
     * Works with any ModelRenderer hierarchy, custom render() overrides, mirror flags, and texture sizes.
     */
    public static IModel bakeEntityModel(EntityModel<?> model) {
        VertexCollector collector = new VertexCollector();
        model.render(new MatrixStack(), collector, 0, 0, 1.0F, 1.0F, 1.0F, 1.0F);
        return new BakedFlywheelModel(collector.vertices);
    }

    /**
     * Bakes specific ModelRenderers (e.g., if splitting static vs. animated parts).
     */
    public static IModel bakeRenderers(ModelRenderer... renderers) {
        VertexCollector collector = new VertexCollector();
        MatrixStack stack = new MatrixStack();
        for (ModelRenderer renderer : renderers) {
            renderer.render(stack, collector, 0, 0, 1.0F, 1.0F, 1.0F, 1.0F);
        }
        return new BakedFlywheelModel(collector.vertices);
    }

    private static class BakedVertex {
        float x, y, z;
        float u, v;
        float nx, ny, nz;
    }

    /**
     * Captures vertices emitted by ModelRenderer.render(...)
     */
    private static class VertexCollector implements IVertexBuilder {
        final List<BakedVertex> vertices = new ArrayList<>();
        private BakedVertex current = new BakedVertex();

        @Override
        public IVertexBuilder pos(double x, double y, double z) {
            current.x = (float) x;
            current.y = (float) y;
            current.z = (float) z;
            return this;
        }

        @Override
        public IVertexBuilder color(int red, int green, int blue, int alpha) {
            return this;
        }

        @Override
        public IVertexBuilder tex(float u, float v) {
            current.u = u;
            current.v = v;
            return this;
        }

        @Override
        public IVertexBuilder overlay(int u, int v) {
            return this;
        }

        @Override
        public IVertexBuilder lightmap(int u, int v) {
            return this;
        }

        @Override
        public IVertexBuilder normal(float x, float y, float z) {
            current.nx = x;
            current.ny = y;
            current.nz = z;
            return this;
        }

        @Override
        public void endVertex() {
            vertices.add(current);
            current = new BakedVertex();
        }
    }

    private static class BakedFlywheelModel implements IModel {
        private final List<BakedVertex> vertices;

        BakedFlywheelModel(List<BakedVertex> vertices) {
            this.vertices = vertices;
        }

        @Override
        public int vertexCount() {
            return vertices.size();
        }

        @Override
        public VertexFormat format() {
            return Formats.UNLIT_MODEL;
        }

        @Override
        public void buffer(VecBuffer buffer) {
            for (BakedVertex v : vertices) {
                buffer.putVec3(v.x, v.y, v.z);
                buffer.putVec3(
                        (byte) (v.nx * 127.0F),
                        (byte) (v.ny * 127.0F),
                        (byte) (v.nz * 127.0F)
                );
                buffer.putVec2(v.u, v.v);
            }
        }
    }
}