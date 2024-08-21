
package net.mcreator.badmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.badmod.init.BadModModFluids;

public class CruideOilItem extends BucketItem {
	public CruideOilItem() {
		super(BadModModFluids.CRUIDE_OIL.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
