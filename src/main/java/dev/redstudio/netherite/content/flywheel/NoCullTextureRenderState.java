
package dev.redstudio.netherite.content.flywheel;

import com.jozufozu.flywheel.backend.gl.GlTextureUnit;
import com.jozufozu.flywheel.backend.state.IRenderState;
import com.jozufozu.flywheel.backend.state.TextureRenderState;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.util.ResourceLocation;

public class NoCullTextureRenderState implements IRenderState {

    private final TextureRenderState textureState;

    public NoCullTextureRenderState(ResourceLocation texture) {
        this.textureState = TextureRenderState.get(texture);
    }

    @Override
    public void bind() {
        textureState.bind();
        RenderSystem.disableCull();
    }

    @Override
    public void unbind() {
        RenderSystem.enableCull();
        textureState.unbind();
    }

    @Override
    public ResourceLocation getTexture(GlTextureUnit textureUnit) {
        return textureState.getTexture(textureUnit);
    }
}
