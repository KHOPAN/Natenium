package com.khopan.natenium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khopan.natenium.registry.BlockItemRegistry;
import com.khopan.natenium.registry.BlockRegistry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class NateniumMod implements ModInitializer {
	public static final String MOD_IDENTIFIER = "natenium";
	public static final String MOD_NAME = "Natenium";

	public static final Logger LOGGER = LoggerFactory.getLogger(NateniumMod.MOD_NAME);

	@Override
	public void onInitialize() {
		NateniumMod.LOGGER.info("Initializing {}", NateniumMod.MOD_NAME);
		BlockRegistry.register();
		BlockItemRegistry.register();
	}

	public static ResourceLocation location(String path) {
		return new ResourceLocation(NateniumMod.MOD_IDENTIFIER, path);
	}
}
