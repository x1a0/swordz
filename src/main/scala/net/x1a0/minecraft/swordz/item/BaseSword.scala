package net.x1a0.minecraft.swordz.item

import net.minecraft.item.{Item, ItemSword}

import net.x1a0.minecraft.swordz.CreativeTab

/** @author x1a0 */


class BaseSword(name: String) extends ItemSword(Item.ToolMaterial.WOOD) {
  setUnlocalizedName(name)
  setCreativeTab(CreativeTab)

  override def getUnlocalizedName: String = name
}
