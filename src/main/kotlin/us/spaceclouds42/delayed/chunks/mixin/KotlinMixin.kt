package us.spaceclouds42.delayed.chunks.mixin

import net.minecraft.server.MinecraftServer
import net.minecraft.server.WorldGenerationProgressListener
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(MinecraftServer::class)
class KotlinMixin {
    @Inject(
        method = ["prepareStartRegion"],
        at = [At("HEAD")],
    )
    fun exampleMixin(listener: WorldGenerationProgressListener, ci: CallbackInfo) {
        println("Hello from a Kotlin Mixin!")
    }
}
