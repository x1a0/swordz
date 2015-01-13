package net.x1a0.minecraft.swordz.proxy

import net.minecraftforge.fml.common.registry.GameRegistry

import net.x1a0.minecraft.swordz.Mod
import net.x1a0.minecraft.swordz.item.Aether

/** @author x1a0 */


class CommonProxy {
  def init(): Unit = {

  }

  def preInit(): Unit = {
    println("@@@" * 19)
    println(Aether.getUnlocalizedName)
    println("@@@" * 19)
    GameRegistry.registerItem(Aether, Aether.getUnlocalizedName, Mod.ID)
  }
}
