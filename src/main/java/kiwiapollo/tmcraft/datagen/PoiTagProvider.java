package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.villager.MoveTutorVillager;
import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.villager.PokemonBreederVillager;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PointOfInterestTypeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;

import java.util.concurrent.CompletableFuture;

public class PoiTagProvider extends TagProvider<PointOfInterestType> {
    protected PoiTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookup) {
        super(output, RegistryKeys.POINT_OF_INTEREST_TYPE, lookup);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        this.getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE).addOptional(Identifier.of(TMCraft.MOD_ID, MoveTutorVillager.POI_ID));
        this.getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE).addOptional(Identifier.of(TMCraft.MOD_ID, PokemonBreederVillager.POI_ID));
    }
}
