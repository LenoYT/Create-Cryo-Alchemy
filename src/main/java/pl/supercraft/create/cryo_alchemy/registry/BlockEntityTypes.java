package pl.supercraft.create.cryo_alchemy.registry;

import com.simibubi.create.AllBlocks;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import pl.supercraft.create.cryo_alchemy.block.entity.PotionPipeBlockEntity;

import static com.simibubi.create.Create.REGISTRATE;
import static pl.supercraft.create.cryo_alchemy.Mod.LOGGER;

public class BlockEntityTypes {
	public static final BlockEntityEntry<PotionPipeBlockEntity> POTION_PIPE = REGISTRATE
			.blockEntity("potion_pipe", PotionPipeBlockEntity::new)
			.validBlocks(AllBlocks.FLUID_PIPE)
			.register();

	public static void register() { LOGGER.info("Block Entity Types are here!"); }
}
