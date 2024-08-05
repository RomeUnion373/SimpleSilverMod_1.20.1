package com.gmail.RomeUnion373.simplesilvermod.datagen.client;

import com.gmail.RomeUnion373.simplesilvermod.SimpleSilverMod;
import com.gmail.RomeUnion373.simplesilvermod.block.SimpleSilverModBlocks;
import com.gmail.RomeUnion373.simplesilvermod.item.SimpleSilverModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, SimpleSilverMod.MOD_ID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(SimpleSilverModItems.RAW_SILVER,"銀の原石");
        addItem(SimpleSilverModItems.SILVER_INGOT,"銀インゴット");
        addItem(SimpleSilverModItems.SILVER_NUGGET,"銀塊");

        add("creativetabs.simplesilvermod_tab","Simple Silver Mod");

        addBlock(SimpleSilverModBlocks.SILVER_BLOCK,"銀ブロック");
        addBlock(SimpleSilverModBlocks.RAW_SILVER_BLOCK,"銀の原石ブロック");
    }
}
