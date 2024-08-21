
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

public abstract class PetroleumFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> BadModModFluidTypes.PETROLEUM_TYPE.get(), () -> BadModModFluids.PETROLEUM.get(), () -> BadModModFluids.FLOWING_PETROLEUM.get())
			.explosionResistance(100f).bucket(() -> BadModModItems.PETROLEUM_BUCKET.get()).block(() -> (LiquidBlock) BadModModBlocks.PETROLEUM.get());

	private PetroleumFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PetroleumFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PetroleumFluid {
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
