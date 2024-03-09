package com.fox.tutorialmod.datagen.loot;

import com.fox.tutorialmod.block.ModBlocks;
import com.fox.tutorialmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.ZIRCON_BLOCK.get());

        this.add(ModBlocks.BLACK_OPAL_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.BLACK_OPAL_ORE.get(), ModItems.Raw_Black_Opal.get(),1.0F,2.0F));

        this.add(ModBlocks.DEEP_BLACK_OPAL_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEP_BLACK_OPAL_ORE.get(), ModItems.Raw_Black_Opal.get(),1.0F,2.0F));

        this.add(ModBlocks.NET_BLACK_OPAL.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NET_BLACK_OPAL.get(), ModItems.Raw_Black_Opal.get(),1.0F,2.0F));

        this.add(ModBlocks.END_BLACK_OPAL.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_BLACK_OPAL.get(), ModItems.Raw_Black_Opal.get(),1.0F,2.0F));


        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.Raw_Sapphire.get(),1.0F,1.0F));

        this.add(ModBlocks.DEEP_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEP_SAPPHIRE_ORE.get(), ModItems.Raw_Sapphire.get(),1.0F,2.0F));

        this.add(ModBlocks.NET_SAPPHIRE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NET_SAPPHIRE.get(), ModItems.Raw_Sapphire.get(),1.0F,1.0F));

        this.add(ModBlocks.END_SAPPHIRE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_SAPPHIRE.get(), ModItems.Raw_Sapphire.get(),2.0F,4.0F));


        this.add(ModBlocks.ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ZIRCON_ORE.get(), ModItems.Raw_Zircon.get(),1.0F,2.0F));

        this.add(ModBlocks.DEEP_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEP_ZIRCON_ORE.get(), ModItems.Raw_Zircon.get(),1.0F,2.0F));

        this.add(ModBlocks.NET_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NET_ZIRCON_ORE.get(), ModItems.Raw_Zircon.get(),2.0F,4.0F));

        this.add(ModBlocks.END_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_ZIRCON_ORE.get(), ModItems.Raw_Zircon.get(),2.0F,4.0F));


        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.Ruby.get(),1.0F,1.0F));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item, float pMin, float pMax) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(pMin, pMax))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
