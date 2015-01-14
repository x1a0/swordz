package net.x1a0.minecraft.swordz

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

/** @author x1a0 */


object CreativeTab extends CreativeTabs(CreativeTabs.getNextID, "swordz") {
  @SideOnly(Side.CLIENT)
  override def getTabIconItem: Item = Mod.swords(0)
}
