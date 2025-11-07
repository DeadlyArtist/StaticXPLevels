package staticxp.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import staticxp.ModConfig;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

    @Inject(method = "getNextLevelExperience", at = @At("HEAD"), cancellable = true)
    private void changeXPRequirement(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(ModConfig.get().xpRequired);
    }
}
