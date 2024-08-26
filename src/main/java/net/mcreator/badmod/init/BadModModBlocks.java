
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.badmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.badmod.block.PetroleumBlock;
import net.mcreator.badmod.block.OilySandBlock;
import net.mcreator.badmod.block.HotAggregateBlock;
import net.mcreator.badmod.block.CruideOilBlock;
import net.mcreator.badmod.block.BituminousBinderBlock;
import net.mcreator.badmod.block.AsphaltCementBlock;
import net.mcreator.badmod.block.AsphaltBlock;
import net.mcreator.badmod.block.AggregateBlock;
import net.mcreator.badmod.BadModMod;

public class BadModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BadModMod.MODID);
	public static final DeferredHolder<Block, Block> ASPHALT = REGISTRY.register("asphalt", AsphaltBlock::new);
	public static final DeferredHolder<Block, Block> AGGREGATE = REGISTRY.register("aggregate", AggregateBlock::new);
	public static final DeferredHolder<Block, Block> OILY_SAND = REGISTRY.register("oily_sand", OilySandBlock::new);
	public static final DeferredHolder<Block, Block> ASPHALT_CEMENT = REGISTRY.register("asphalt_cement", AsphaltCementBlock::new);
	public static final DeferredHolder<Block, Block> CRUIDE_OIL = REGISTRY.register("cruide_oil", CruideOilBlock::new);
	public static final DeferredHolder<Block, Block> PETROLEUM = REGISTRY.register("petroleum", PetroleumBlock::new);
	public static final DeferredHolder<Block, Block> HOT_AGGREGATE = REGISTRY.register("hot_aggregate", HotAggregateBlock::new);
	public static final DeferredHolder<Block, Block> BITUMINOUS_BINDER = REGISTRY.register("bituminous_binder", BituminousBinderBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
