package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookup) {
        super(output, lookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getBlock(), drops(ModBlocks.MOVE_TUTOR_TABLE_BLOCK.getItem()));
    }
}
