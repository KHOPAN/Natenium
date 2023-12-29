package com.khopan.natenium.registry;

import com.khopan.natenium.NateniumMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;

public class BlockItemRegistry {
	private BlockItemRegistry() {}

	public static final BlockItem NATENIUM_BLOCK_ITEM = new BlockItem(BlockRegistry.NATENIUM_BLOCK, new FabricItemSettings().fireResistant());

	public static void register() {
		NateniumMod.LOGGER.info("Registering Block Items");
		Registry.register(BuiltInRegistries.ITEM, NateniumMod.location("natenium_block"), BlockItemRegistry.NATENIUM_BLOCK_ITEM);
	}
}
