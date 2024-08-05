package com.gmail.RomeUnion373.simplesilvermod;
// gitのテスト
import com.gmail.RomeUnion373.simplesilvermod.block.SimpleSilverModBlocks;
import com.gmail.RomeUnion373.simplesilvermod.item.SimpleSilverModItems;
import com.gmail.RomeUnion373.simplesilvermod.item.SimpleSilverModTabs;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SimpleSilverMod.MOD_ID)
public class SimpleSilverMod {
    public static final String MOD_ID = "simplesilvermod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SimpleSilverMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        // アイテムレジストリをイベントバスに登録
        SimpleSilverModItems.register(modEventBus);

        // クリエイティブタブレジストリをイベントバスに登録
        SimpleSilverModTabs.register(modEventBus);

        // ブロックレジストリをイベントバスに登録
        SimpleSilverModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
