package net.fabric_extras.ranged_weapon;

import net.fabric_extras.ranged_weapon.api.CustomRangedWeapon;
import net.fabric_extras.ranged_weapon.api.RangedWeaponDamage;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;

public class RangedWeaponAPI implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ((CustomRangedWeapon) Items.BOW).setPullTime_RWA(20);
        ((RangedWeaponDamage) Items.BOW).setRangedWeaponDamage(6);
        ((CustomRangedWeapon) Items.CROSSBOW).setPullTime_RWA(25);
    }
}
