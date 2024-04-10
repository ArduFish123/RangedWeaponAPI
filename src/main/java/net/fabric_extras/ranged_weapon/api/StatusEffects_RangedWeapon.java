package net.fabric_extras.ranged_weapon.api;

import net.fabric_extras.ranged_weapon.internal.CustomStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class StatusEffects_RangedWeapon {
    public static final String NAMESPACE = "ranged_weapon";
    public static class Entry {
        public final Identifier id;
        public final StatusEffect effect;

        public Entry(String name, int color) {
            this.id = new Identifier(NAMESPACE, name);
            this.effect = new CustomStatusEffect(StatusEffectCategory.BENEFICIAL, color);
        }
    }

    public static final ArrayList<Entry> all = new ArrayList<>();
    private static Entry entry(String name, int color) {
        var entry = new Entry(name, color);
        all.add(entry);
        return entry;
    }

    public static final Entry DAMAGE = entry("damage", 0xAAFFDD);
    public static final Entry HASTE = entry("haste", 0xB30000);
}
