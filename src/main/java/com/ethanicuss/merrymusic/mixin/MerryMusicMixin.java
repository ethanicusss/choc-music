package com.ethanicuss.merrymusic.mixin;

import com.ethanicuss.merrymusic.MerryMusic;
import com.ethanicuss.merrymusic.musicplayer.MusicPlayer;
import com.ethanicuss.merrymusic.register.ModMusic;
import com.ethanicuss.merrymusic.register.ModSounds;
import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.sounds.MusicManager;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.entity.EntityTypeTest;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;


@Mixin(Minecraft.class)
public class MerryMusicMixin {
    @Shadow @Final private MusicManager musicManager;

    @Inject(method = "getSituationalMusic", at = @At("HEAD"), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private void getSituationalMusic(CallbackInfoReturnable<Music> cir){
        Music val = ModMusic.DAY;//default value, dw about this

        cir.setReturnValue(MusicPlayer.findMusic(musicManager));//Find music from the MusicPlayer class and send it back to the minecraft client
    }
}
