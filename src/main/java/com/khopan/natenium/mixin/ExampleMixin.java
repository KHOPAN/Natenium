package com.khopan.natenium.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.server.MinecraftServer;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at=@At("HEAD"), method="loadLevel")
	private void init(CallbackInfo info) {

	}
}
