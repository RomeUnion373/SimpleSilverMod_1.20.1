package com.gmail.RomeUnion373.simplesilvermod.datagen.sever;

import com.gmail.RomeUnion373.simplesilvermod.block.SimpleSilverModBlocks;
import com.gmail.RomeUnion373.simplesilvermod.item.SimpleSilverModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class SimpleSilverModRecipeProvider extends RecipeProvider {
    public SimpleSilverModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    //TODO silver_ingot.jsonの重複を無くすためにファイル名を別々にしたい

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        nineBlockStorageRecipes(consumer,RecipeCategory.MISC,
                SimpleSilverModItems.SILVER_INGOT.get(),
                RecipeCategory.BUILDING_BLOCKS, SimpleSilverModBlocks.SILVER_BLOCK.get());
        nineBlockStorageRecipes(consumer,RecipeCategory.MISC,
                SimpleSilverModItems.RAW_SILVER.get(),
                RecipeCategory.BUILDING_BLOCKS, SimpleSilverModBlocks.RAW_SILVER_BLOCK.get());

        // 問題のやつ
//        nineBlockStorageRecipesWithCustomPacking(consumer,RecipeCategory.MISC,
//                SimpleSilverModItems.SILVER_NUGGET.get(),
//                RecipeCategory.MISC, SimpleSilverModItems.SILVER_INGOT.get());
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                                  RecipeCategory pUnpackedCategory,
                                                  ItemLike pUnpacked,
                                                  RecipeCategory pPackedCategory,
                                                  ItemLike pPacked) {
        ShapelessRecipeBuilder.shapeless(pUnpackedCategory, pUnpacked, 9)
                .requires(pPacked).unlockedBy(getHasName(pPacked), has(pPacked)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pPackedCategory, pPacked).define('#', pUnpacked)
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy(getHasName(pUnpacked), has(pUnpacked)).save(pFinishedRecipeConsumer);

    }
    // 問題のやつ
//    protected static void nineBlockStorageRecipesWithCustomPacking(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
//                                                  RecipeCategory pUnpackedCategory,
//                                                  ItemLike pUnpacked,
//                                                  RecipeCategory pPackedCategory,
//                                                  ItemLike pPacked) {
//        ShapelessRecipeBuilder.shapeless(pUnpackedCategory, pUnpacked, 9)
//                .requires(pPacked).unlockedBy(getHasName(pPacked), has(pPacked)).save(pFinishedRecipeConsumer);
//        ShapedRecipeBuilder.shaped(pPackedCategory, pPacked).define('#', pUnpacked)
//                .pattern("###").pattern("###").pattern("###")
//                .unlockedBy(getHasName(pUnpacked), has(pUnpacked)).save(pFinishedRecipeConsumer);
//    }

}