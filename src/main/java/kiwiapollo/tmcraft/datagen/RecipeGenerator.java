package kiwiapollo.tmcraft.datagen;

import net.minecraft.data.server.recipe.RecipeExporter;

public interface RecipeGenerator {
    void generate(RecipeExporter exporter);
}
