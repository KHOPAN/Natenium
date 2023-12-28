package com.khopan.natenium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class NateniumMod implements ModInitializer {
	public static final String MOD_IDENTIFIER = "natenium";
	public static final String MOD_NAME = "Natenium";

	public static final Logger LOGGER = LoggerFactory.getLogger(NateniumMod.MOD_NAME);

	@Override
	public void onInitialize() {
		NateniumMod.LOGGER.info("Initializing {}", NateniumMod.MOD_NAME);
	}
}