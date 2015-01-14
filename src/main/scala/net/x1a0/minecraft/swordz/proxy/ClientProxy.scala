package net.x1a0.minecraft.swordz.proxy

import net.minecraft.client.Minecraft
import net.minecraft.client.resources.model.ModelResourceLocation

import net.x1a0.minecraft.swordz.Mod

/** @author x1a0 */


class ClientProxy extends CommonProxy {
  override def init(): Unit = {
    super.init()

    Mod.swords foreach { sword =>
      val resource = new ModelResourceLocation(s"swordz:${sword.name}", "inventory")
      Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(sword, 0, resource)
    }
  }
}
