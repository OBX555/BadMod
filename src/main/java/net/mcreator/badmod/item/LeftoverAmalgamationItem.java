
package net.mcreator.badmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LeftoverAmalgamationItem extends Item {
	public LeftoverAmalgamationItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
