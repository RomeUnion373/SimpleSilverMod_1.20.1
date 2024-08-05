package com.gmail.RomeUnion373.simplesilvermod.datagen.client;

import com.gmail.RomeUnion373.simplesilvermod.SimpleSilverMod;
import com.gmail.RomeUnion373.simplesilvermod.item.SimpleSilverModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SimpleSilverModItemModelProvider extends ItemModelProvider {
    public SimpleSilverModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SimpleSilverMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(SimpleSilverModItems.RAW_SILVER.get());
        basicItem(SimpleSilverModItems.SILVER_INGOT.get());
        basicItem(SimpleSilverModItems.SILVER_NUGGET.get());
    }
}
