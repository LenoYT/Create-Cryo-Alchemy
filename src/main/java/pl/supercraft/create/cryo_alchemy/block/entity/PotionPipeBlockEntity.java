package pl.supercraft.create.cryo_alchemy.block.entity;

import com.simibubi.create.content.fluids.pipes.FluidPipeBlockEntity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class PotionPipeBlockEntity extends FluidPipeBlockEntity {
	public PotionPipeBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
}
