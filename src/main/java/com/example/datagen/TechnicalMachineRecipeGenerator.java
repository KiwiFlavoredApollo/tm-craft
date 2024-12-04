package com.example.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.api.types.ElementalTypes;
import com.example.BlankDiscItems;
import com.example.TechnicalMachineItem;
import com.example.TechnicalMachineItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.Map;
import java.util.function.Consumer;

public class TechnicalMachineRecipeGenerator {
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

    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, TechnicalMachineItems.TM_AGILITY.getItem())
                .input(BlankDiscItems.EMERALD_DISC.getItem())
                .input(toTypeGem((TechnicalMachineItem) TechnicalMachineItems.TM_AGILITY.getItem()))
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.EMERALD_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.EMERALD_DISC.getItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, TechnicalMachineItems.TM_AIRSLASH.getItem())
                .input(BlankDiscItems.IRON_DISC.getItem())
                .input(toTypeGem((TechnicalMachineItem) TechnicalMachineItems.TM_AIRSLASH.getItem()))
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.IRON_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.IRON_DISC.getItem()))
                .offerTo(exporter);
    }

    private ItemConvertible toTypeGem(TechnicalMachineItem item) {
        ElementalType type = item.getMoveType();
        return TO_TYPE_GEM.get(type);
    }
}
