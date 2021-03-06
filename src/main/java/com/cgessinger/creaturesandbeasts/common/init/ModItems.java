package com.cgessinger.creaturesandbeasts.common.init;

import com.cgessinger.creaturesandbeasts.CreaturesAndBeasts;
import com.cgessinger.creaturesandbeasts.common.items.*;

import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreaturesAndBeasts.MOD_ID);

	public static RegistryObject<ModSpawnEggItem> GREBE_SPAWN_EGG = ITEMS.register("little_grebe_spawn_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.LITTLE_GREBE,0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(CreaturesAndBeasts.TAB)));

    public static final RegistryObject<ModEntityBucket> CINDERSHELL_BUCKET = ITEMS.register("cindershell_bucket", 
            () -> new ModEntityBucket(ModEntityTypes.CINDERSHELL, Fluids.LAVA, new Item.Properties().group(CreaturesAndBeasts.TAB)));

	public static RegistryObject<ModSpawnEggItem> CINDERSHELL_SPAWN_EGG = ITEMS.register("cindershell_spawn_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.CINDERSHELL, 0x0D0403, 0xC64500, new Item.Properties().group(CreaturesAndBeasts.TAB)));

	public static RegistryObject<ModSpawnEggItem> LILYTAD_SPAWN_EGG = ITEMS.register("lilytad_spawn_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.LILYTAD,0x37702E, 0x102417, new Item.Properties().group(CreaturesAndBeasts.TAB)));

	public static RegistryObject<ModSpawnEggItem> YETI_SPAWN_EGG = ITEMS.register("yeti_spawn_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.YETI,0xD7E1E7, 0x887E96, new Item.Properties().group(CreaturesAndBeasts.TAB)));

	// Lizards
	public static RegistryObject<ModSpawnEggItem> LIZARD_SPAWN_EGG = ITEMS.register("lizard_spawn_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.LIZARD,0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(CreaturesAndBeasts.TAB)));

	public static RegistryObject<ModSpawnEggItem> LIZARD_ITEM_0 = ITEMS.register("lizard_item_0",
			() -> new ModSpawnEggItem(ModEntityTypes.LIZARD,0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(0));

	public static RegistryObject<ModSpawnEggItem> LIZARD_ITEM_1 = ITEMS.register("lizard_item_1",
			() -> new ModSpawnEggItem(ModEntityTypes.LIZARD,0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(1));

	public static RegistryObject<ModSpawnEggItem> LIZARD_ITEM_2 = ITEMS.register("lizard_item_2",
			() -> new ModSpawnEggItem(ModEntityTypes.LIZARD,0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(2));

	public static RegistryObject<ModSpawnEggItem> LIZARD_ITEM_3 = ITEMS.register("lizard_item_3",
			() -> new ModSpawnEggItem(ModEntityTypes.LIZARD,0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(3));

	// Sporelings
	public static RegistryObject<ModSpawnEggItem> SPORELING_OVERWORLD_BROWN_EGG = ITEMS.register("sporeling_overworld_brown_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.FRIENDLY_SPORELING,0xF2DDD3, 0xCD9777, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(0));

	public static RegistryObject<ModSpawnEggItem> SPORELING_OVERWORLD_RED_EGG = ITEMS.register("sporeling_overworld_red_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.FRIENDLY_SPORELING,0xCB1A1A, 0xF2DDD3, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(1));

	public static RegistryObject<ModSpawnEggItem> SPORELING_NETHER_BROWN_EGG = ITEMS.register("sporeling_nether_brown_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.HOSTILE_SPORELING,0xC68F70, 0x7C533F, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(2));

	public static RegistryObject<ModSpawnEggItem> SPORELING_NETHER_RED_EGG = ITEMS.register("sporeling_nether_red_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.HOSTILE_SPORELING,0xCC9575, 0xB31A1A, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(3));

	public static RegistryObject<ModSpawnEggItem> SPORELING_WARPED_FUNGI_EGG = ITEMS.register("sporeling_warped_fungi_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.NEUTRAL_SPORELING,0x139A88, 0xD66818, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(4));

	public static RegistryObject<ModSpawnEggItem> SPORELING_CRIMSON_FUNGUS_EGG = ITEMS.register("sporeling_crimson_fungus_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.NEUTRAL_SPORELING,0x9E1104, 0xF88539, new Item.Properties().group(CreaturesAndBeasts.TAB)).spawnsVariant(5));

	public static final RegistryObject<AppleSliceItem> APPLE_SLICE = ITEMS.register("apple_slice", AppleSliceItem::new);
	public static final RegistryObject<LizardEgg> LIZARD_EGG = ITEMS.register("lizard_egg", LizardEgg::new);
	public static final RegistryObject<EntityNetItem> ENTITY_NET = ITEMS.register("entity_net", EntityNetItem::new);
	public static final RegistryObject<CindershellShellShardItem> CINDERSHELL_SHELL_SHARD = ITEMS.register("cindershell_shell_shard", CindershellShellShardItem::new);
	public static final RegistryObject<LilytadFlowerItem> LILYTAD_FLOWER = ITEMS.register("lilytad_flower", LilytadFlowerItem::new);
	public static final RegistryObject<Item> YETI_ANTLER = ITEMS.register("yeti_antler", () -> new Item(new Item.Properties().group(CreaturesAndBeasts.TAB)));
	public static final RegistryObject<Item> YETI_HIDE = ITEMS.register("yeti_hide", () -> new Item(new Item.Properties().group(CreaturesAndBeasts.TAB)));
}
