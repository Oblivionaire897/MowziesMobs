package com.bobmowzie.mowziesmobs.server.item;

import net.minecraft.potion.Effects;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;

/**
 * Created by Josh on 7/30/2018.
 */

public class ItemGlowingJelly extends Item {
    public static Food GLOWING_JELLY_FOOD = (new Food.Builder().hunger(1).saturation(0.1f).effect(new EffectInstance(Effects.NIGHT_VISION, 1200, 0), 1.0f)).build();

    public ItemGlowingJelly(Item.Properties properties) {
        super(properties);
    }
}
