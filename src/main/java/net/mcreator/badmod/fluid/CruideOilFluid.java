
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

public abstract class CruideOilFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> BadModModFluidTypes.CRUIDE_OIL_TYPE.get(), () -> BadModModFluids.CRUIDE_OIL.get(), () -> BadModModFluids.FLOWING_CRUIDE_OIL.get())
			.explosionResistance(100f).bucket(() -> BadModModItems.CRUIDE_OIL_BUCKET.get()).block(() -> (LiquidBlock) BadModModBlocks.CRUIDE_OIL.get());

	private CruideOilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CruideOilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CruideOilFluid {
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
