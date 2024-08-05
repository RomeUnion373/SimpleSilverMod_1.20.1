package com.gmail.RomeUnion373.simplesilvermod.block;

import com.gmail.RomeUnion373.simplesilvermod.SimpleSilverMod;
import com.gmail.RomeUnion373.simplesilvermod.item.SimpleSilverModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SimpleSilverModBlocks {
    // レジストリ作成
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleSilverMod.MOD_ID);
    // レジストリにブロックを登録
    public static final RegistryObject<Block> SILVER_BLOCK =
            registryBlockItem("silver_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK =
            registryBlockItem("raw_silver_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    // BlockItemのレジストリを作る
    private static<T extends Block> RegistryObject<T> registryBlockItem(String name, Supplier<T> supplier) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        SimpleSilverModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
        return block;
    }

    // レジストリをイベントバスに登録する
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
