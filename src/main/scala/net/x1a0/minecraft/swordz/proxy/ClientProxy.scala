package net.x1a0.minecraft.swordz.proxy

import net.minecraft.client.Minecraft
import net.minecraft.client.resources.model.ModelResourceLocation

import net.x1a0.minecraft.swordz.item.Aether

/** @author x1a0 */


class ClientProxy extends CommonProxy {
  override def init(): Unit = {
    super.init()

    val resource = new ModelResourceLocation("swordz:aether", "inventory")
    Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(Aether, 0, resource)
  }
}
