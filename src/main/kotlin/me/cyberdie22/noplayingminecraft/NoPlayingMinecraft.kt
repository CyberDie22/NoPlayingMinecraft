package me.cyberdie22.noplayingminecraft

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
import kotlin.system.exitProcess

@Suppress("UNUSED")
object NoPlayingMinecraft : PreLaunchEntrypoint {
    private const val MOD_ID = "noplayingminecraft"
    override fun onPreLaunch() {
        println("great mod initialization time\n".repeat(1000))
        exitProcess(0)
    }
}