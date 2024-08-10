package net.fabric_extras.ranged_weapon.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class RangedWeaponAPIClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, tooltipContext, tooltipType, lines) -> {
            TooltipHelper.updateTooltipText(stack, lines);
        });
        // Calling these from MinecraftClient run, so all mod registrations are done
//        for (var bow: CustomBow.instances) {
//            ModelPredicateHelper.registerBowModelPredicates(bow);
//        }
//        for (var crossbow: CustomCrossbow.instances) {
//            ModelPredicateHelper.registerCrossbowModelPredicates(crossbow);
//        }
    }
}
