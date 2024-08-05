package com.gmail.RomeUnion373.simplesilvermod.datagen.sever;

import com.gmail.RomeUnion373.simplesilvermod.SimpleSilverMod;
import com.gmail.RomeUnion373.simplesilvermod.block.SimpleSilverModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SimpleSilverModBlockTagsProvider extends BlockTagsProvider {

    public SimpleSilverModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                            @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SimpleSilverMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                   .add(SimpleSilverModBlocks.SILVER_BLOCK.get(),
                        SimpleSilverModBlocks.RAW_SILVER_BLOCK.get()
                        );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(SimpleSilverModBlocks.SILVER_BLOCK.get(),
                        SimpleSilverModBlocks.RAW_SILVER_BLOCK.get()
                );

    }
}
