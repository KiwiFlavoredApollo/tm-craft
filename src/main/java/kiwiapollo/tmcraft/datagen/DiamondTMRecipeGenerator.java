package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import kiwiapollo.tmcraft.common.TypeGemFactory;
import kiwiapollo.tmcraft.item.misc.BlankDiscItems;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItems;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

public class DiamondTMRecipeGenerator implements RecipeGenerator {
    @Override
    public void generate(RecipeExporter exporter) {
        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_BLIZZARD.getItem())
                .input(Items.POWDER_SNOW_BUCKET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FIREBLAST.getItem())
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_THUNDER.getItem())
                .input(Items.LIGHTNING_ROD)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HYDROPUMP.getItem())
                .input(Items.WATER_BUCKET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ICEBEAM.getItem())
                .input(Items.END_ROD)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FLAMETHROWER.getItem())
                .input(Items.DISPENSER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_THUNDERBOLT.getItem())
                .input(CobblemonItems.ELECTIRIZER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SURF.getItem())
                .input(ItemTags.BOATS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DREAMEATER.getItem())
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_IRONTAIL.getItem())
                .input(Items.TWISTING_VINES)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WILDCHARGE.getItem())
                .input(Items.MINECART)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ENERGYBALL.getItem())
                .input(Items.SLIME_BALL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SLUDGEBOMB.getItem())
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FOULPLAY.getItem())
                .input(Items.TRIPWIRE_HOOK)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PSYCHIC.getItem())
                .input(CobblemonItems.TWISTED_SPOON)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SUPERCELLSLAM.getItem())
                .input(Items.DAMAGED_ANVIL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_UPROAR.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MUDDYWATER.getItem())
                .input(Items.MUD)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FLY.getItem())
                .input(Items.FEATHER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_EARTHQUAKE.getItem())
                .input(Items.CRYING_OBSIDIAN)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_STONEEDGE.getItem())
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PHANTOMFORCE.getItem())
                .input(Items.PISTON)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HURRICANE.getItem())
                .input(Items.FEATHER, 3)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PETALBLIZZARD.getItem())
                .input(Items.PINK_PETALS, 3)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SLUDGEWAVE.getItem())
                .input(Items.WATER_BUCKET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HEATWAVE.getItem())
                .input(Items.FEATHER, 3)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POLLENPUFF.getItem())
                .input(ItemTags.FLOWERS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HYPERVOICE.getItem())
                .input(Items.SCULK_SHRIEKER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_EARTHPOWER.getItem())
                .input(CobblemonItems.LIFE_ORB)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PLAYROUGH.getItem())
                .input(CobblemonItems.ROCKY_HELMET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_BUGBUZZ.getItem())
                .input(Items.BELL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POLTERGEIST.getItem())
                .input(CobblemonItems.SPELL_TAG)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MISTYEXPLOSION.getItem())
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HIGHHORSEPOWER.getItem())
                .input(Items.SADDLE)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TAKEDOWN.getItem())
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ROCKCLIMB.getItem())
                .input(CobblemonItems.HEAVY_DUTY_BOOTS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_EGGBOMB.getItem())
                .input(Items.EGG)
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DYNAMICPUNCH.getItem())
                .input(Items.PUFFERFISH)
                .offerTo(exporter);
    }

    static class DiamondTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private DiamondTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static DiamondTMRecipeJsonBuilder create(TMMoveItem item) {
            return (DiamondTMRecipeJsonBuilder) new DiamondTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.DIAMOND_BLANK_DISC.getItem())
                    .input(new TypeGemFactory().create(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.DIAMOND_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.DIAMOND_BLANK_DISC.getItem()));
        }
    }
}
