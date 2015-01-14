package net.x1a0.minecraft.swordz

import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.{Mod => FmlMod, SidedProxy}

import net.x1a0.minecraft.swordz.item.BaseSword
import net.x1a0.minecraft.swordz.proxy.CommonProxy

/** @author x1a0 */


@FmlMod(modid = Mod.ID, name = Mod.NAME, version = Mod.VERSION, modLanguage = "scala")
object Mod {
  final val ID = "swordz"
  final val NAME = "Swordz"
  final val VERSION = "0.0.1"

  final val swords = (0 to 200) map { n: Int =>
    new BaseSword(n)
  }

  @SidedProxy(serverSide = "net.x1a0.minecraft.swordz.proxy.CommonProxy", clientSide = "net.x1a0.minecraft.swordz.proxy.ClientProxy")
  var proxy: CommonProxy = null

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    proxy.preInit()
  }

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    proxy.init()
  }
}
