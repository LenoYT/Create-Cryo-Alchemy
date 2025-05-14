package pl.supercraft.create.cryo_alchemy.registry;

import pl.supercraft.create.cryo_alchemy.block.PotionPipeBlock;

import static pl.supercraft.create.cryo_alchemy.Mod.LOGGER;

public class ModBlocks {
	public static final PotionPipeBlock POTION_PIPE_BLOCK = (PotionPipeBlock) Registrate.registerBlock("potion_pipe_blocks", new PotionPipeBlock());

	public static void register() { LOGGER.info("Blocks are here!"); }
}
