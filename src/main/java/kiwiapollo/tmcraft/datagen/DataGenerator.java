package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.item.*;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItems;
import kiwiapollo.tmcraft.item.misc.BlankBookItems;
import kiwiapollo.tmcraft.item.misc.BlankDiscItems;
import kiwiapollo.tmcraft.item.misc.BlankEggItems;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItems;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(RecipeProvider::new);
        pack.addProvider(ItemTagProvider::new);
        pack.addProvider(PoiTagProvider::new);
        pack.addProvider(BlockTagProvider::new);
        pack.addProvider(LootTableProvider::new);
    }

    private static class RecipeProvider extends FabricRecipeProvider {
        public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        public void generate(RecipeExporter exporter) {
            new TMRecipeGenerator().generate(exporter);
            new BlankDiscRecipeGenerator().generate(exporter);
            new SmithingTemplateRecipeGenerator().generate(exporter);
            new MoveTutorTableRecipeGenerator().generate(exporter);
        }
    }

    private static class ItemTagProvider extends FabricTagProvider<Item> {
        public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, RegistryKeys.ITEM, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {
            Arrays.stream(TMMoveItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.TM_MOVES).add(item.getItem()));
            Arrays.stream(EggMoveItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.EGG_MOVES).add(item.getItem()));
            Arrays.stream(TutorMoveItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.TUTOR_MOVES).add(item.getItem()));

            Arrays.stream(BlankDiscItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.BLANK_DISCS).add(item.getItem()));
            Arrays.stream(BlankEggItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.BLANK_EGGS).add(item.getItem()));
            Arrays.stream(BlankBookItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.BLANK_BOOKS).add(item.getItem()));
        }
    }
}
