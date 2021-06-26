package us.spaceclouds42.delayed.chunks

import org.spaceserve.config.IConfigure

data class DelayedChunksConfig(
    var enabled: Boolean = true,
    var delayTicks: Int = 10,
) : IConfigure
