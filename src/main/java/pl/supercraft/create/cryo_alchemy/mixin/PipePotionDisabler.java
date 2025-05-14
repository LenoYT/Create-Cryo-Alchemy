package pl.supercraft.create.cryo_alchemy.mixin;

import com.simibubi.create.content.fluids.FluidTransportBehaviour;

import io.github.fabricators_of_create.porting_lib.fluids.FluidStack;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import pl.supercraft.create.cryo_alchemy.registry.ModBlocks;

@Mixin(FluidTransportBehaviour.class)
public class PipePotionDisabler {

	@Inject(method = "canPullFluidFrom", at = @At("HEAD"), cancellable = true)
	private void blockPotionTransport(FluidStack fluid, BlockState state, Direction direction, CallbackInfoReturnable<Boolean> cir) {
		Fluid fluidType = fluid.getFluid();
		Identifier fluidId = Registries.FLUID.getId(fluidType);

		if (fluidId != null && fluidId.equals(new Identifier("create", "potion"))) {
			Block block = state.getBlock();
			System.out.println("[DEBUG] Blocking potion in: " + block.toString());
			if (block != ModBlocks.POTION_PIPE_BLOCK) cir.setReturnValue(false);
		}
	}
}
