package pl.supercraft.create.cryo_alchemy;

import com.simibubi.create.Create;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.supercraft.create.cryo_alchemy.registry.Registrate;

public class Mod implements ModInitializer {
	public static final String ID = "create_cryo_alchemy";
	public static final String NAME = "Create: Cryo-Alchemy";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		Registrate.register();

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
	}

	public static Identifier id(String path) {
		return new Identifier(ID, path);
	}
}
