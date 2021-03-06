package com.cgessinger.creaturesandbeasts.common.init;

import com.cgessinger.creaturesandbeasts.CreaturesAndBeasts;
import com.cgessinger.creaturesandbeasts.common.blocks.LizardEggBlock;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Effects;
import net.minecraft.state.IntegerProperty;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockRegistry
{
    public static final IntegerProperty EGGS_1_6 = IntegerProperty.create("eggs", 1, 6);
    
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreaturesAndBeasts.MOD_ID);

	public static final RegistryObject<Block> LILYTAD_FLOWER = BLOCKS.register("lilytad_flower_block", () ->
			new FlowerBlock(Effects.INSTANT_HEALTH, 5,
			AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));

	public static final RegistryObject<Block> POTTED_LILYTAD_FLOWER = BLOCKS.register("potted_lilytad_flower", () -> new FlowerPotBlock(LILYTAD_FLOWER.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));
    
    public static RegistryObject<Block> LIZARD_EGGS = BLOCKS.register("lizard_egg_block", LizardEggBlock::new);
}
