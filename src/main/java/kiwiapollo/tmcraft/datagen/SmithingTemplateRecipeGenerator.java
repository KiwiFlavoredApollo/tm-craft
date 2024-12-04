package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.misc.SmithingTemplateItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class SmithingTemplateRecipeGenerator implements RecipeGenerator {
    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, SmithingTemplateItems.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem())
                .pattern("GBG")
                .pattern("GDG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT)
                .input('D', Items.COBBLED_DEEPSLATE)
                .input('B', Items.BLAZE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of(TMCraft.MOD_ID, String.format("%s_from_blaze_powder", SmithingTemplateItems.MOVE_UPGRADE_SMITHING_TEMPLATE.getIdentifier().getPath())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, SmithingTemplateItems.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem(), 2)
                .pattern("GTG")
                .pattern("GDG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT)
                .input('D', Items.COBBLED_DEEPSLATE)
                .input('T', SmithingTemplateItems.MOVE_UPGRADE_SMITHING_TEMPLATE.getItem())
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
    }
}
