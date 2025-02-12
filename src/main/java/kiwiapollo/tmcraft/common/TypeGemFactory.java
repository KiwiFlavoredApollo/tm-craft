package kiwiapollo.tmcraft.common;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.api.types.ElementalTypes;
import net.minecraft.item.Item;

import java.util.Map;

public class TypeGemFactory {
    private static final Map<ElementalType, Item> TO_TYPE_GEM = Map.ofEntries(
            Map.entry(ElementalTypes.INSTANCE.getNORMAL(), CobblemonItems.NORMAL_GEM),
            Map.entry(ElementalTypes.INSTANCE.getFIRE(), CobblemonItems.FIRE_GEM),
            Map.entry(ElementalTypes.INSTANCE.getWATER(), CobblemonItems.WATER_GEM),
            Map.entry(ElementalTypes.INSTANCE.getELECTRIC(), CobblemonItems.ELECTRIC_GEM),
            Map.entry(ElementalTypes.INSTANCE.getGRASS(), CobblemonItems.GRASS_GEM),
            Map.entry(ElementalTypes.INSTANCE.getICE(), CobblemonItems.ICE_GEM),
            Map.entry(ElementalTypes.INSTANCE.getFIGHTING(), CobblemonItems.FIGHTING_GEM),
            Map.entry(ElementalTypes.INSTANCE.getPOISON(), CobblemonItems.POISON_GEM),
            Map.entry(ElementalTypes.INSTANCE.getGROUND(), CobblemonItems.GROUND_GEM),
            Map.entry(ElementalTypes.INSTANCE.getFLYING(), CobblemonItems.FLYING_GEM),
            Map.entry(ElementalTypes.INSTANCE.getPSYCHIC(), CobblemonItems.PSYCHIC_GEM),
            Map.entry(ElementalTypes.INSTANCE.getBUG(), CobblemonItems.BUG_GEM),
            Map.entry(ElementalTypes.INSTANCE.getROCK(), CobblemonItems.ROCK_GEM),
            Map.entry(ElementalTypes.INSTANCE.getGHOST(), CobblemonItems.GHOST_GEM),
            Map.entry(ElementalTypes.INSTANCE.getDRAGON(), CobblemonItems.DRAGON_GEM),
            Map.entry(ElementalTypes.INSTANCE.getDARK(), CobblemonItems.DARK_GEM),
            Map.entry(ElementalTypes.INSTANCE.getSTEEL(), CobblemonItems.STEEL_GEM),
            Map.entry(ElementalTypes.INSTANCE.getFAIRY(), CobblemonItems.FAIRY_GEM)
    );

    public Item create(ElementalType type) {
        return TO_TYPE_GEM.get(type);
    }
}
