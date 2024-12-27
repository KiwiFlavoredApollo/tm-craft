package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.item.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(RecipeProvider::new);
        pack.addProvider(TagProvider::new);
    }

    private static class RecipeProvider extends FabricRecipeProvider {
        public RecipeProvider(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generate(Consumer<RecipeJsonProvider> exporter) {
            new TMRecipeGenerator().generate(exporter);
            new BlankDiscRecipeGenerator().generate(exporter);
        }
    }

    private static class TagProvider extends FabricTagProvider<Item> {
        public TagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, RegistryKeys.ITEM, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {
            Arrays.stream(TMItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.TMS).add(item.getItem()));
            Arrays.stream(EggMoveItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.EGG_MOVES).add(item.getItem()));
            Arrays.stream(MoveTutorItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.MOVE_TUTORS).add(item.getItem()));

            Arrays.stream(BlankDiscItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.BLANK_DISCS).add(item.getItem()));
            Arrays.stream(BlankEggItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.BLANK_EGGS).add(item.getItem()));
            Arrays.stream(BlankBookItems.values()).forEach(item -> getOrCreateTagBuilder(ModTagRegistry.BLANK_BOOKS).add(item.getItem()));
        }
    }
}
