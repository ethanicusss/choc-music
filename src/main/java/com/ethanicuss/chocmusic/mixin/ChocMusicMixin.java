package com.ethanicuss.chocmusic.mixin;

import com.ethanicuss.chocmusic.musicplayer.MusicPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.sounds.MusicManager;
import net.minecraft.sounds.Music;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;


@Mixin(Minecraft.class)
public class ChocMusicMixin {
    @Shadow @Final private MusicManager musicManager;

    @Inject(method = "getSituationalMusic", at = @At("HEAD"), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private void getSituationalMusic(CallbackInfoReturnable<Music> cir){
        if (MusicPlayer.shouldPlayMusic(musicManager)) {
            cir.setReturnValue(MusicPlayer.findMusic(musicManager));//Find music from the MusicPlayer class and send it back to the minecraft client
        }
    }
}
