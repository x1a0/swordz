package net.x1a0.minecraft.swordz.proxy

import net.minecraftforge.fml.common.registry.GameRegistry

import net.x1a0.minecraft.swordz.Mod

/** @author x1a0 */


class CommonProxy {
  def init(): Unit = {}

  def preInit(): Unit = {
    Mod.swords.foreach { sword =>
      GameRegistry.registerItem(sword, sword.getUnlocalizedName, Mod.ID)
    }
  }
}
