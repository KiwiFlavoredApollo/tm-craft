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

public class EmeraldTMRecipeGenerator implements RecipeGenerator {
    @Override
    public void generate(RecipeExporter exporter) {
        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_AGILITY.getItem())
                .input(Items.FIREWORK_ROCKET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_STEALTHROCK.getItem())
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_RAINDANCE.getItem())
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SUNNYDAY.getItem())
                .input(CobblemonItems.SUN_STONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SCARYFACE.getItem())
                .input(Items.SOUL_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_BULKUP.getItem())
                .input(Items.GOLDEN_APPLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HONECLAWS.getItem())
                .input(CobblemonItems.RAZOR_CLAW)
                .input(Items.GRINDSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TOXIC.getItem())
                .input(CobblemonItems.BLACK_SLUDGE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TRICKROOM.getItem())
                .input(Items.ENDER_CHEST)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_LIGHTSCREEN.getItem())
                .input(Items.GLASS_PANE)
                .input(Items.ENCHANTED_BOOK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_REFLECT.getItem())
                .input(Items.GLASS_PANE)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PSYCHUP.getItem())
                .input(CobblemonItems.MIRROR_HERB)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SWORDSDANCE.getItem())
                .input(Items.IRON_SWORD)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ROCKPOLISH.getItem())
                .input(Items.GRINDSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FAKETEARS.getItem())
                .input(Items.GHAST_TEAR)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ATTRACT.getItem())
                .input(CobblemonItems.LOVE_SWEET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SANDSTORM.getItem())
                .input(CobblemonItems.SOFT_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FLASH.getItem())
                .input(Items.LANTERN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WILLOWISP.getItem())
                .input(Items.SOUL_LANTERN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CALMMIND.getItem())
                .input(Items.TARGET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_REST.getItem())
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DOUBLETEAM.getItem())
                .input(CobblemonItems.X_ACCURACY)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MIMIC.getItem())
                .input(Items.GLASS_PANE)
                .input(Items.IRON_INGOT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SKILLSWAP.getItem())
                .input(Items.ENCHANTED_BOOK)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_GUARDSWAP.getItem())
                .input(CobblemonItems.X_DEFENSE)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_POWERSWAP.getItem())
                .input(CobblemonItems.X_ATTACK)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SPEEDSWAP.getItem())
                .input(CobblemonItems.X_SPEED)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SNATCH.getItem())
                .input(Items.DIAMOND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_THUNDERWAVE.getItem())
                .input(Items.REPEATER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TORMENT.getItem())
                .input(CobblemonItemTags.MINTS)
                .input(Items.COCOA_BEANS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ROOST.getItem())
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SAFEGUARD.getItem())
                .input(Items.IRON_HELMET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SUBSTITUTE.getItem())
                .input(Items.ARMOR_STAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_LOWSWEEP.getItem())
                .input(Items.COBWEB)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CONFUSERAY.getItem())
                .input(Items.SHROOMLIGHT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ENDURE.getItem())
                .input(CobblemonItems.FOCUS_BAND)
                .offerTo(exporter);

        // Snowscape (Japanese: ゆきげしき Snowscape) is a non-damaging Ice-type move introduced in Generation IX,
        // replacing Hail from earlier generations. It is TM052 in Generation IX.
        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HAIL.getItem())
                .input(CobblemonItems.IRON_BALL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SNOWSCAPE.getItem())
                .input(CobblemonItems.IRON_BALL)
                .input(CobblemonItems.PROTECTOR)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_FEATHERDANCE.getItem())
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_METALSOUND.getItem())
                .input(Items.PRISMARINE_SHARD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SLEEPTALK.getItem())
                .input(Items.PHANTOM_MEMBRANE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PROTECT.getItem())
                .input(Items.SHIELD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SPIKES.getItem())
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TOXICSPIKES.getItem())
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_IMPRISON.getItem())
                .input(Items.IRON_BARS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_EERIEIMPULSE.getItem())
                .input(Items.SUSPICIOUS_STEW)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ELECTRICTERRAIN.getItem())
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_GRASSYTERRAIN.getItem())
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PSYCHICTERRAIN.getItem())
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MISTYTERRAIN.getItem())
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_NASTYPLOT.getItem())
                .input(Items.WARPED_ROOTS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CURSE.getItem())
                .input(Items.WITHER_ROSE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRAGONCHEER.getItem())
                .input(CobblemonItems.DIRE_HIT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DRAGONDANCE.getItem())
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_COACHING.getItem())
                .input(CobblemonItems.POWER_BRACER)
                .input(CobblemonItems.POWER_BELT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ENCORE.getItem())
                .input(Items.REPEATER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_BATONPASS.getItem())
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_AMNESIA.getItem())
                .input(CobblemonItems.ENIGMA_BERRY)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HELPINGHAND.getItem())
                .input(Items.BRUSH)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ROAR.getItem())
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CHARGE.getItem())
                .input(CobblemonItems.CELL_BATTERY)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_HAZE.getItem())
                .input(Items.MILK_BUCKET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SPITE.getItem())
                .input(CobblemonItems.ETHER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_GRAVITY.getItem())
                .input(Items.SOUL_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_PAINSPLIT.getItem())
                .input(Items.CACTUS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_IRONDEFENSE.getItem())
                .input(Items.SHIELD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TRICK.getItem())
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TAILWIND.getItem())
                .input(Items.ELYTRA)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TAUNT.getItem())
                .input(CobblemonItems.MAGNET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CHARM.getItem())
                .input(CobblemonItems.WHIPPED_DREAM)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WONDERROOM.getItem())
                .input(Items.MAGENTA_GLAZED_TERRACOTTA)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_MAGICROOM.getItem())
                .input(Items.BLACK_GLAZED_TERRACOTTA)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SCREECH.getItem())
                .input(Items.SCULK_SHRIEKER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_EMBARGO.getItem())
                .input(Items.CHAIN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CONFIDE.getItem())
                .input(Items.WRITTEN_BOOK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_QUASH.getItem())
                .input(Items.SOUL_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_AURORAVEIL.getItem())
                .input(Items.SHIELD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WORKUP.getItem())
                .input(CobblemonItems.X_ATTACK)
                .input(CobblemonItems.X_SP_ATK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_RECYCLE.getItem())
                .input(Items.BUCKET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_CAPTIVATE.getItem())
                .input(Items.LEAD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TELEPORT.getItem())
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_TELEKINESIS.getItem())
                .input(Items.SHULKER_SHELL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DEFOG.getItem())
                .input(Items.GOLDEN_CARROT)
                .input(Items.NETHER_WART)
                .input(Items.POTION)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_ALLYSWITCH.getItem())
                .input(Items.LEVER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SWAGGER.getItem())
                .input(CobblemonItems.FIGY_BERRY)
                .input(CobblemonItems.X_ATTACK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_NIGHTMARE.getItem())
                .input(ItemTags.BEDS)
                .input(Items.PHANTOM_MEMBRANE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SOFTBOILED.getItem())
                .input(Items.EGG)
                .input(CobblemonItems.HYPER_POTION)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DEFENSECURL.getItem())
                .input(CobblemonItems.X_DEFENSE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_DETECT.getItem())
                .input(Items.SPYGLASS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_WHIRLWIND.getItem())
                .input(Items.FEATHER, 3)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveItem) TMMoveItems.TM_SWEETSCENT.getItem())
                .input(ItemTags.SMALL_FLOWERS)
                .input(Items.HONEY_BOTTLE)
                .offerTo(exporter);
    }

    static class EmeraldTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private EmeraldTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static EmeraldTMRecipeJsonBuilder create(TMMoveItem item) {
            return (EmeraldTMRecipeJsonBuilder) new EmeraldTMRecipeJsonBuilder(item)
                    .input(BlankDiscItems.EMERALD_BLANK_DISC.getItem())
                    .input(new TypeGemFactory().create(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItems.EMERALD_BLANK_DISC.getItem()), FabricRecipeProvider.conditionsFromItem(BlankDiscItems.EMERALD_BLANK_DISC.getItem()));
        }
    }
}
