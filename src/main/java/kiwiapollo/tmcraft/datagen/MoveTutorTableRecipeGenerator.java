package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlocks;
import kiwiapollo.tmcraft.item.misc.BlankDiscItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

public class MoveTutorTableRecipeGenerator implements RecipeGenerator {
    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getItem())
                .pattern("II")
                .pattern("BB")
                .pattern("GG")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.BLACK_STAINED_GLASS)
                .input('G', Items.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.COPPER_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.COPPER_BLANK_DISC.getItem()))
                .offerTo(exporter, ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getIdentifier());
    }
}
