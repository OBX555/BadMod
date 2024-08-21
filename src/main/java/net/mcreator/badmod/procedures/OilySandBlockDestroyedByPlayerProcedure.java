package net.mcreator.badmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.badmod.init.BadModModBlocks;

public class OilySandBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("bad_mod:drills")))) {
			if (Math.random() < 0.5) {
				world.setBlock(BlockPos.containing(x, y, z), BadModModBlocks.PETROLEUM.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), BadModModBlocks.CRUIDE_OIL.get().defaultBlockState(), 3);
			}
		}
	}
}
