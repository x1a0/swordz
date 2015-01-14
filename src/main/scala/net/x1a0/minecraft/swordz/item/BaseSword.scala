package net.x1a0.minecraft.swordz.item

import net.minecraft.item.{Item, ItemSword}

import net.x1a0.minecraft.swordz.CreativeTab

/** @author x1a0 */


class BaseSword(val id: Int) extends ItemSword(Item.ToolMaterial.IRON) {
  val name = s"swordz_${id.toString}"

  setUnlocalizedName(name)
  setCreativeTab(CreativeTab)

  override def getUnlocalizedName: String = name
}
