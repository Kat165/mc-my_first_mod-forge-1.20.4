package com.fox.tutorialmod.datagen;

import com.fox.tutorialmod.block.ModBlocks;
import com.fox.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_OPAL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Black_Opal.get())
                .unlockedBy(getHasName(ModItems.Black_Opal.get()),has(ModItems.Black_Opal.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Raw_Sapphire.get())
                .unlockedBy(getHasName(ModItems.Raw_Sapphire.get()),has(ModItems.Raw_Sapphire.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Ruby.get())
                .unlockedBy(getHasName(ModItems.Ruby.get()),has(ModItems.Ruby.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Sapphire.get())
                .unlockedBy(getHasName(ModItems.Sapphire.get()),has(ModItems.Sapphire.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Zircon.get())
                .unlockedBy(getHasName(ModItems.Zircon.get()),has(ModItems.Zircon.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Black_Opal.get(),9)
                .requires(ModBlocks.BLACK_OPAL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_OPAL_BLOCK.get()),has(ModBlocks.BLACK_OPAL_BLOCK.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Sapphire.get(),9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()),has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Raw_Sapphire.get(),9)
                .requires(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SAPPHIRE_BLOCK.get()),has(ModBlocks.RAW_SAPPHIRE_BLOCK.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Ruby.get(),9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()),has(ModBlocks.RUBY_BLOCK.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Zircon.get(),9)
                .requires(ModBlocks.ZIRCON_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ZIRCON_BLOCK.get()),has(ModBlocks.ZIRCON_BLOCK.get()))
                .save(pRecipeOutput);
    }


}
