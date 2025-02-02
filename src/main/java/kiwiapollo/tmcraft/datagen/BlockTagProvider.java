package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getBlock()).setReplace(false);
        this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.POKEMON_BREEDER_TABLE_BLOCK.getBlock()).setReplace(false);
    }
}
