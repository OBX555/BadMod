
package net.mcreator.badmod.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.badmod.init.BadModModItems;
import net.mcreator.badmod.init.BadModModFluids;
import net.mcreator.badmod.init.BadModModFluidTypes;
import net.mcreator.badmod.init.BadModModBlocks;

public abstract class BituminousBinderFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> BadModModFluidTypes.BITUMINOUS_BINDER_TYPE.get(), () -> BadModModFluids.BITUMINOUS_BINDER.get(),
			() -> BadModModFluids.FLOWING_BITUMINOUS_BINDER.get()).explosionResistance(100f).tickRate(2).bucket(() -> BadModModItems.BITUMINOUS_BINDER_BUCKET.get()).block(() -> (LiquidBlock) BadModModBlocks.BITUMINOUS_BINDER.get());

	private BituminousBinderFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BituminousBinderFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BituminousBinderFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
