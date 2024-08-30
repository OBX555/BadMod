
package net.mcreator.badmod.item;

import net.minecraft.network.chat.Component;

public class BituminousBinderItem extends BucketItem {

	public BituminousBinderItem() {
		super(BadModModFluids.BITUMINOUS_BINDER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

}
