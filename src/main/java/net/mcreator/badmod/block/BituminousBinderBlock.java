
package net.mcreator.badmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BituminousBinderBlock extends LiquidBlock {
	public BituminousBinderBlock() {
		super(BadModModFluids.BITUMINOUS_BINDER.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 13;
	}
}