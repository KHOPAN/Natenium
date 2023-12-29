package com.khopan.natenium.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khopan.natenium.NateniumMod;

import net.fabricmc.api.ClientModInitializer;

public class NateniumModClient implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(NateniumMod.MOD_NAME + " Client");

	@Override
	public void onInitializeClient() {
		NateniumModClient.LOGGER.info("Initializing {} Client", NateniumMod.MOD_NAME);
	}
}
