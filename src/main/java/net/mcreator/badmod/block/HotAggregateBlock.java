
package net.mcreator.badmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HotAggregateBlock extends Block {
	public HotAggregateBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}