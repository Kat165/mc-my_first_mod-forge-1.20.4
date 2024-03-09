package com.fox.tutorialmod.item;

import com.fox.tutorialmod.TutorialMod;
import com.fox.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("gems",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Zircon.get()))
                    .title(Component.translatable("creativetab.gems"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Zircon.get());
                        pOutput.accept(ModItems.Raw_Zircon.get());
                        pOutput.accept(ModItems.Black_Opal.get());
                        pOutput.accept(ModItems.Raw_Black_Opal.get());
                        pOutput.accept(ModItems.Sapphire.get());
                        pOutput.accept(ModItems.Raw_Sapphire.get());

                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(Items.QUARTZ);
                        pOutput.accept(Items.EMERALD);
                        pOutput.accept(Items.AMETHYST_SHARD);
                        pOutput.accept(Items.AMETHYST_BLOCK);
                        pOutput.accept(Items.AMETHYST_CLUSTER);

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEP_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.END_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.NET_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.ZIRCON_BLOCK.get());

                        pOutput.accept(ModBlocks.ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.BLACK_OPAL_BLOCK.get());
                        pOutput.accept(ModBlocks.BLACK_OPAL_ORE.get());
                        pOutput.accept(ModBlocks.DEEP_BLACK_OPAL_ORE.get());
                        pOutput.accept(ModBlocks.END_BLACK_OPAL.get());
                        pOutput.accept(ModBlocks.NET_BLACK_OPAL.get());

                        pOutput.accept(ModBlocks.DEEP_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_SAPPHIRE.get());
                        pOutput.accept(ModBlocks.NET_SAPPHIRE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());

                        pOutput.accept(ModItems.Ruby.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
