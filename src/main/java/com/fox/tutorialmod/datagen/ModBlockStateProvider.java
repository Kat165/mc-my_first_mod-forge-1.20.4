package com.fox.tutorialmod.datagen;

import com.fox.tutorialmod.TutorialMod;
import com.fox.tutorialmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLACK_OPAL_BLOCK);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.ZIRCON_BLOCK);

        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);

        blockWithItem(ModBlocks.BLACK_OPAL_ORE);
        blockWithItem(ModBlocks.DEEP_BLACK_OPAL_ORE);
        blockWithItem(ModBlocks.END_BLACK_OPAL);
        blockWithItem(ModBlocks.NET_BLACK_OPAL);

        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEP_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_SAPPHIRE);
        blockWithItem(ModBlocks.NET_SAPPHIRE);

        blockWithItem(ModBlocks.ZIRCON_ORE);
        blockWithItem(ModBlocks.DEEP_ZIRCON_ORE);
        blockWithItem(ModBlocks.END_ZIRCON_ORE);
        blockWithItem(ModBlocks.NET_ZIRCON_ORE);

        blockWithItem(ModBlocks.RUBY_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
    }
}
