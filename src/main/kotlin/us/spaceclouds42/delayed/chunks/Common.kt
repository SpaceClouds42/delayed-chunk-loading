package us.spaceclouds42.delayed.chunks

import net.fabricmc.api.ModInitializer

object Common : ModInitializer {
    val CONFIG = DelayedChunksConfig()

    override fun onInitialize() {
        println("Initializing Delayed Chunks")
        CONFIG.load()
    }
}
