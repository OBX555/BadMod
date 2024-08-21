
package net.mcreator.badmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptydrillItem extends Item {
	public EmptydrillItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
