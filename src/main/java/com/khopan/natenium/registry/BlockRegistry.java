package com.khopan.natenium.registry;

import com.khopan.natenium.NateniumMod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class BlockRegistry {
	private BlockRegistry() {}

	public static final Block NATENIUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK));

	public static void register() {
		NateniumMod.LOGGER.info("Registering Blocks");
		Registry.register(BuiltInRegistries.BLOCK, NateniumMod.location("natenium_block"), BlockRegistry.NATENIUM_BLOCK);
	}
}
