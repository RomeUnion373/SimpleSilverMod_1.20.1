package com.gmail.RomeUnion373.simplesilvermod.item;

import com.gmail.RomeUnion373.simplesilvermod.SimpleSilverMod;
import com.gmail.RomeUnion373.simplesilvermod.block.SimpleSilverModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SimpleSilverModTabs {
    // レジストリ作成
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            SimpleSilverMod.MOD_ID);

    // レジストリにタブを登録
    public static final RegistryObject<CreativeModeTab> SIMPLESILVERMOD_TAB = TABS.register("simplesilvermod_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetabs.simplesilvermod_tab"))
                    .icon(SimpleSilverModItems.SILVER_INGOT.get()::getDefaultInstance)
                    .displayItems(((pParameters, pOutput) -> {
                        // アイテムをタブに表示
                        pOutput.accept(SimpleSilverModItems.RAW_SILVER.get());
                        pOutput.accept(SimpleSilverModItems.SILVER_INGOT.get());
                        pOutput.accept(SimpleSilverModItems.SILVER_NUGGET.get());
                        pOutput.accept(SimpleSilverModBlocks.SILVER_BLOCK.get());
                        pOutput.accept(SimpleSilverModBlocks.RAW_SILVER_BLOCK.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}