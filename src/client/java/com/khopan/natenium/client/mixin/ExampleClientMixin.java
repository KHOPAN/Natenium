package com.khopan.natenium.client.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.Minecraft;

@Mixin(Minecraft.class)
public class ExampleClientMixin {
	@Inject(at=@At("HEAD"), method="run")
	private void run(CallbackInfo info) {

	}
}
