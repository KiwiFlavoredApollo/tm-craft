package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
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

public class IronTMRecipeGenerator implements RecipeGenerator {
    @Override
    public void generate(RecipeExporter exporter) {
        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FIRESPIN.getItem())
                .input(Items.IRON_BARS)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MUDSHOT.getItem())
                .input(Items.MUD)
                .input(Items.ARROW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MAGICALLEAF.getItem())
                .input(ItemTags.LEAVES)
                .input(Items.ARROW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_METALCLAW.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POWERGEM.getItem())
                .input(Items.DIAMOND)
                .input(Items.EMERALD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ROCKSMASH.getItem())
                .input(Items.IRON_PICKAXE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_STRUGGLEBUG.getItem())
                .input(Items.COBWEB)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_GYROBALL.getItem())
                .input(CobblemonItems.IRON_BALL)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POWERUPPUNCH.getItem())
                .input(CobblemonItems.BLACK_BELT)
                .input(CobblemonItems.PROTEIN)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRAININGKISS.getItem())
                .input(CobblemonItems.LOVE_SWEET)
                .input(Items.SPONGE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CHARGEBEAM.getItem())
                .input(Items.END_ROD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ECHOEDVOICE.getItem())
                .input(Items.SCULK_SENSOR)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FLING.getItem())
                .input(Items.CROSSBOW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MEGADRAIN.getItem())
                .input(Items.SPONGE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PAYDAY.getItem())
                .input(CobblemonItems.RELIC_COIN)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FLAMECHARGE.getItem())
                .input(CobblemonItems.X_SPEED)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_LOWKICK.getItem())
                .input(Items.IRON_BOOTS)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FALSESWIPE.getItem())
                .input(Items.WOODEN_SWORD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ACIDSPRAY.getItem())
                .input(Items.SPLASH_POTION)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CHILLINGWATER.getItem())
                .input(Items.ICE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ELECTROWEB.getItem())
                .input(Items.COBWEB)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WEATHERBALL.getItem())
                .input(CobblemonItems.SKY_TUMBLESTONE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TRAILBLAZE.getItem())
                .input(CobblemonItems.X_SPEED)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DISARMINGVOICE.getItem())
                .input(CobblemonItems.LOVE_SWEET)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POUNCE.getItem())
                .input(Items.IRON_AXE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ICYWIND.getItem())
                .input(Items.FEATHER)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WHIRLPOOL.getItem())
                .input(Items.NAUTILUS_SHELL)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SANDTOMB.getItem())
                .input(Items.SAND, 2)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SMACKDOWN.getItem())
                .input(Items.ANVIL)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_GRASSYGLIDE.getItem())
                .input(Items.PHANTOM_MEMBRANE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DUALWINGBEAT.getItem())
                .input(Items.PHANTOM_MEMBRANE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_VACUUMWAVE.getItem())
                .input(Items.CROSSBOW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ACROBATICS.getItem())
                .input(Items.ELYTRA)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POISONTAIL.getItem())
                .input(Items.TWISTING_VINES)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SNARL.getItem())
                .input(Items.AMETHYST_SHARD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PAYBACK.getItem())
                .input(Items.CACTUS)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SNORE.getItem())
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CUT.getItem())
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FURYCUTTER.getItem())
                .input(Items.IRON_HOE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ROLLOUT.getItem())
                .input(Items.CROSSBOW)
                .input(CobblemonItems.X_ATTACK)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WATERGUN.getItem())
                .input(Items.CROSSBOW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRAGONRAGE.getItem())
                .input(Items.DRAGON_HEAD)
                .offerTo(exporter);
    }

    static class IronTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private IronTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static IronTMRecipeJsonBuilder create(TMMoveItem item) {
            return (IronTMRecipeJsonBuilder) new IronTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.IRON_BLANK_DISC.getItem())
                    .input(new TypeGemFactory().create(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.IRON_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.IRON_BLANK_DISC.getItem()));
        }
    }
}
