package com.gmail.RomeUnion373.simplesilvermod.datagen;

import com.gmail.RomeUnion373.simplesilvermod.SimpleSilverMod;
import com.gmail.RomeUnion373.simplesilvermod.datagen.client.ENUSLanguageProvider;
import com.gmail.RomeUnion373.simplesilvermod.datagen.client.JAJPLanguageProvider;
import com.gmail.RomeUnion373.simplesilvermod.datagen.client.SimpleSilverModBlockStateProvider;
import com.gmail.RomeUnion373.simplesilvermod.datagen.client.SimpleSilverModItemModelProvider;
import com.gmail.RomeUnion373.simplesilvermod.datagen.sever.SimpleSilverModBlockTagsProvider;
import com.gmail.RomeUnion373.simplesilvermod.datagen.sever.SimpleSilverModRecipeProvider;
import com.gmail.RomeUnion373.simplesilvermod.datagen.sever.loot.SimpleSilverModLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SimpleSilverMod.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class SimpleSilverModDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider>lookUpProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new SimpleSilverModItemModelProvider(packOutput,existingFileHelper));
        generator.addProvider(event.includeClient(), new SimpleSilverModBlockStateProvider(packOutput,existingFileHelper));
        generator.addProvider(event.includeClient(), new ENUSLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new JAJPLanguageProvider(packOutput));
        generator.addProvider(event.includeServer(), new SimpleSilverModRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), SimpleSilverModLootTables.create(packOutput));
        generator.addProvider(event.includeServer(), new SimpleSilverModBlockTagsProvider(packOutput,lookUpProvider,existingFileHelper));
    }
}
