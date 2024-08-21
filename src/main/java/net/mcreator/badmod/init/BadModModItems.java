
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.badmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.badmod.item.PetroleumItem;
import net.mcreator.badmod.item.EmptydrillItem;
import net.mcreator.badmod.item.DrillcableredItem;
import net.mcreator.badmod.item.DrillcablegreenItem;
import net.mcreator.badmod.item.DrillcableblueItem;
import net.mcreator.badmod.item.DrillMk1TopItem;
import net.mcreator.badmod.item.DrillMk1Item;
import net.mcreator.badmod.item.CruideOilItem;
import net.mcreator.badmod.item.AsphaltCementItem;
import net.mcreator.badmod.BadModMod;

public class BadModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BadModMod.MODID);
	public static final DeferredHolder<Item, Item> ASPHALT = block(BadModModBlocks.ASPHALT);
	public static final DeferredHolder<Item, Item> AGGREGATE = block(BadModModBlocks.AGGREGATE);
	public static final DeferredHolder<Item, Item> OILY_SAND = block(BadModModBlocks.OILY_SAND);
	public static final DeferredHolder<Item, Item> ASPHALT_CEMENT_BUCKET = REGISTRY.register("asphalt_cement_bucket", AsphaltCementItem::new);
	public static final DeferredHolder<Item, Item> DRILL_MK_1 = REGISTRY.register("drill_mk_1", DrillMk1Item::new);
	public static final DeferredHolder<Item, Item> EMPTYDRILL = REGISTRY.register("emptydrill", EmptydrillItem::new);
	public static final DeferredHolder<Item, Item> DRILL_MK_1_TOP = REGISTRY.register("drill_mk_1_top", DrillMk1TopItem::new);
	public static final DeferredHolder<Item, Item> DRILLCABLERED = REGISTRY.register("drillcablered", DrillcableredItem::new);
	public static final DeferredHolder<Item, Item> DRILLCABLEBLUE = REGISTRY.register("drillcableblue", DrillcableblueItem::new);
	public static final DeferredHolder<Item, Item> DRILLCABLEGREEN = REGISTRY.register("drillcablegreen", DrillcablegreenItem::new);
	public static final DeferredHolder<Item, Item> CRUIDE_OIL_BUCKET = REGISTRY.register("cruide_oil_bucket", CruideOilItem::new);
	public static final DeferredHolder<Item, Item> PETROLEUM_BUCKET = REGISTRY.register("petroleum_bucket", PetroleumItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
