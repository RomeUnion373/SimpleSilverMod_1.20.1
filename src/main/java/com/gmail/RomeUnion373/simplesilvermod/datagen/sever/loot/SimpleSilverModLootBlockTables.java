package com.gmail.RomeUnion373.simplesilvermod.datagen.sever.loot;

import com.gmail.RomeUnion373.simplesilvermod.block.SimpleSilverModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class SimpleSilverModLootBlockTables extends BlockLootSubProvider {
    protected SimpleSilverModLootBlockTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(SimpleSilverModBlocks.SILVER_BLOCK.get());
        this.dropSelf(SimpleSilverModBlocks.RAW_SILVER_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SimpleSilverModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
