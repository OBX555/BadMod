
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.badmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.badmod.BadModMod;

public class BadModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BadModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BAD_MOD = REGISTRY.register("bad_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bad_mod.bad_mod")).icon(() -> new ItemStack(BadModModItems.DRILL_MK_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BadModModBlocks.ASPHALT.get().asItem());
				tabData.accept(BadModModBlocks.AGGREGATE.get().asItem());
				tabData.accept(BadModModBlocks.OILY_SAND.get().asItem());
				tabData.accept(BadModModItems.ASPHALT_CEMENT_BUCKET.get());
				tabData.accept(BadModModItems.DRILL_MK_1.get());
				tabData.accept(BadModModItems.EMPTYDRILL.get());
				tabData.accept(BadModModItems.DRILL_MK_1_TOP.get());
				tabData.accept(BadModModItems.DRILLCABLERED.get());
				tabData.accept(BadModModItems.DRILLCABLEBLUE.get());
				tabData.accept(BadModModItems.DRILLCABLEGREEN.get());
				tabData.accept(BadModModItems.CRUIDE_OIL_BUCKET.get());
				tabData.accept(BadModModItems.PETROLEUM_BUCKET.get());
				tabData.accept(BadModModBlocks.HOT_AGGREGATE.get().asItem());
				tabData.accept(BadModModItems.BITUMINOUS_BINDER_BUCKET.get());
			})

					.build());
}
