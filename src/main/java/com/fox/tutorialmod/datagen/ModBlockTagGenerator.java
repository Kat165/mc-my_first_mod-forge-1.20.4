package com.fox.tutorialmod.datagen;

import com.fox.tutorialmod.TutorialMod;
import com.fox.tutorialmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.BLACK_OPAL_ORE.get(),
                        ModBlocks.BLACK_OPAL_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.DEEP_BLACK_OPAL_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.ZIRCON_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.END_BLACK_OPAL.get(),
                        ModBlocks.NET_BLACK_OPAL.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEP_SAPPHIRE_ORE.get(),
                        ModBlocks.END_SAPPHIRE.get(),
                        ModBlocks.NET_SAPPHIRE.get(),
                        ModBlocks.ZIRCON_ORE.get(),
                        ModBlocks.DEEP_ZIRCON_ORE.get(),
                        ModBlocks.END_ZIRCON_ORE.get(),
                        ModBlocks.NET_ZIRCON_ORE.get(),
                        ModBlocks.RUBY_ORE.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.BLACK_OPAL_ORE.get(),
                        ModBlocks.BLACK_OPAL_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.DEEP_BLACK_OPAL_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.ZIRCON_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.END_BLACK_OPAL.get(),
                        ModBlocks.NET_BLACK_OPAL.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEP_SAPPHIRE_ORE.get(),
                        ModBlocks.END_SAPPHIRE.get(),
                        ModBlocks.NET_SAPPHIRE.get(),
                        ModBlocks.ZIRCON_ORE.get(),
                        ModBlocks.DEEP_ZIRCON_ORE.get(),
                        ModBlocks.END_ZIRCON_ORE.get(),
                        ModBlocks.NET_ZIRCON_ORE.get(),
                        ModBlocks.RUBY_ORE.get()
                );

    }
}
