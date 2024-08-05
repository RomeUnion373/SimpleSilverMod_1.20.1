package com.gmail.RomeUnion373.simplesilvermod.datagen.client;

import com.gmail.RomeUnion373.simplesilvermod.SimpleSilverMod;
import com.gmail.RomeUnion373.simplesilvermod.block.SimpleSilverModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class SimpleSilverModBlockStateProvider extends BlockStateProvider {
    public SimpleSilverModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SimpleSilverMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(SimpleSilverModBlocks.SILVER_BLOCK);
        simpleBlockWithItem(SimpleSilverModBlocks.RAW_SILVER_BLOCK);
    }

    private void simpleBlockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(),cubeAll(block.get()));
    }

}
