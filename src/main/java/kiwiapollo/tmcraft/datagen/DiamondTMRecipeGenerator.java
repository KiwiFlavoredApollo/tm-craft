package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import kiwiapollo.tmcraft.item.BlankDiscItems;
import kiwiapollo.tmcraft.item.TMItem;
import kiwiapollo.tmcraft.item.TMItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class DiamondTMRecipeGenerator implements RecipeGenerator {
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        DiamondTMRecipeJsonBuilder.create((TMItem) TMItems.TM_THUNDERBOLT.getItem())
                .input(Items.LIGHTNING_ROD)
                .input(Items.REPEATER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMItem) TMItems.TM_BLIZZARD.getItem())
                .input(Items.POWDER_SNOW_BUCKET, 3)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMItem) TMItems.TM_DREAMEATER.getItem())
                .input(ItemTags.BEDS)
                .input(Items.GOLDEN_APPLE)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMItem) TMItems.TM_SOLARBEAM.getItem())
                .input(CobblemonItems.SUN_STONE)
                .input(CobblemonItems.LEAF_STONE)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMItem) TMItems.TM_FIREBLAST.getItem())
                .input(CobblemonItems.MAGMARIZER)
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMItem) TMItems.TM_FLAMETHROWER.getItem())
                .input(Items.LAVA_BUCKET)
                .input(Items.DISPENSER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMItem) TMItems.TM_IRONTAIL.getItem())
                .input(CobblemonItems.METAL_COAT)
                .input(Items.EMERALD)
                .input(Items.SWEET_BERRIES)
                .offerTo(exporter);
    }

    static class DiamondTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private DiamondTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static DiamondTMRecipeJsonBuilder create(TMItem item) {
            return (DiamondTMRecipeJsonBuilder) new DiamondTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.DIAMOND_BLANK_DISC.getItem())
                    .input(TMRecipeGenerator.toTypeGem(item))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.DIAMOND_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.DIAMOND_BLANK_DISC.getItem()));
        }
    }
}
