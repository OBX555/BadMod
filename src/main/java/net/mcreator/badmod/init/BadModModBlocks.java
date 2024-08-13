
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.badmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.badmod.block.AsphaltBlock;
import net.mcreator.badmod.BadModMod;

public class BadModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BadModMod.MODID);
	public static final DeferredHolder<Block, Block> ASPHALT = REGISTRY.register("asphalt", AsphaltBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
