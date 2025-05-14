package pl.supercraft.create.cryo_alchemy.block;

import com.simibubi.create.content.equipment.wrench.IWrenchableWithBracket;
import com.simibubi.create.foundation.block.IBE;

import net.minecraft.block.ConnectingBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import pl.supercraft.create.cryo_alchemy.registry.BlockEntityTypes;
import pl.supercraft.create.cryo_alchemy.block.entity.PotionPipeBlockEntity;

import java.util.Optional;

public class PotionPipeBlock extends ConnectingBlock implements IWrenchableWithBracket, IBE<PotionPipeBlockEntity> {

	public PotionPipeBlock() {
		super(4 / 16f, Settings.create());
	}

	@Override
	public Optional<ItemStack> removeBracket(BlockView world, BlockPos pos, boolean inOnReplacedContext) {
		return Optional.empty();
	}

	@Override
	public Class<PotionPipeBlockEntity> getBlockEntityClass() {
		return PotionPipeBlockEntity.class;
	}

	@Override
	public BlockEntityType<? extends PotionPipeBlockEntity> getBlockEntityType() {
		return BlockEntityTypes.POTION_PIPE.get();
	}
}
