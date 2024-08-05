package com.gmail.RomeUnion373.simplesilvermod.datagen.client;

import com.gmail.RomeUnion373.simplesilvermod.SimpleSilverMod;
import com.gmail.RomeUnion373.simplesilvermod.block.SimpleSilverModBlocks;
import com.gmail.RomeUnion373.simplesilvermod.item.SimpleSilverModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class ENUSLanguageProvider extends LanguageProvider {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, SimpleSilverMod.MOD_ID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(SimpleSilverModItems.RAW_SILVER,"Raw Silver");
        addItem(SimpleSilverModItems.SILVER_INGOT,"Silver Ingot");
        addItem(SimpleSilverModItems.SILVER_NUGGET,"Silver Nugget");

        add("creativetabs.simplesilvermod_tab","Simple Silver Mod");

        addBlock(SimpleSilverModBlocks.SILVER_BLOCK,"Silver Block");
        addBlock(SimpleSilverModBlocks.RAW_SILVER_BLOCK,"Raw Silver Block");
    }
}
