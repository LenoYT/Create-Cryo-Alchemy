//package pl.supercraft.create.cryo_alchemy.mixin;
//
//import com.simibubi.create.content.processing.basin.BasinBlockEntity;
//import com.simibubi.create.content.processing.basin.BasinRecipe;
//
//import com.simibubi.create.foundation.blockEntity.behaviour.fluid.SmartFluidTankBehaviour;
//
//import io.github.fabricators_of_create.porting_lib.fluids.FluidStack;
//
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.PotionItem;
//import net.minecraft.recipe.Recipe;
//
//import net.minecraft.registry.Registries;
//
//import net.minecraft.util.Identifier;
//
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//
//@Mixin(BasinRecipe.class)
//public class MixingPotionDisabler {
//
//	@Inject(method = "match", at = @At("HEAD"), cancellable = true)
//	private static void blockPotionMixing(BasinBlockEntity basin, Recipe<?> recipe, CallbackInfoReturnable<Boolean> cir) {
//		// Blokowanie mikstur jako przedmiotów
//		for (int i = 0; i < basin.getInputInventory().getSlotCount(); i++) {
//			ItemStack stack = basin.getInputInventory().getStack(i);
//			if (stack.getItem() instanceof PotionItem) {
//				cir.setReturnValue(false);
//				return;
//			}
//		}
//
//		// Blokowanie mikstur jako płynów
//		SmartFluidTankBehaviour fluidBehaviour = basin.getBehaviour(SmartFluidTankBehaviour.INPUT);
//		if (fluidBehaviour != null && basin.getWorld() != null) {
//			FluidStack fluidStack = fluidBehaviour.getPrimaryTank().getTank().getFluid();
//			Identifier fluidId = basin.getWorld().getRegistryManager();
//					// .getWrapperOrThrow(Registries.FLUID.getKey());
//					// .getRegistryKey(fluidStack.getFluid());
//			if (fluidId != null && fluidId.toString().equals("minecraft:potion")) {
//				cir.setReturnValue(false);
//			}
//		}
//	}
//}
