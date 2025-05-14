package pl.supercraft.create.cryo_alchemy.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static pl.supercraft.create.cryo_alchemy.Mod.LOGGER;
import static pl.supercraft.create.cryo_alchemy.Mod.ID;

public class Registrate {
	public static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(ID, name), block);
	}

	public static Block registerBlockNBI(String name, Block block) {
		return Registry.register(Registries.BLOCK, new Identifier(ID, name), block);
	}

	public static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(ID, name),
				new BlockItem(block, new FabricItemSettings()));
	}

	public static void register() {
		LOGGER.info("Loading!");
		ModBlocks.register();
		BlockEntityTypes.register();
		LOGGER.info("Loaded!");
	}
}
