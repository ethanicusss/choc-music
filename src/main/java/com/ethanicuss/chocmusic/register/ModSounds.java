package com.ethanicuss.chocmusic.register;

import com.ethanicuss.chocmusic.ChocMusic;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    private static RegistryObject<SoundEvent> register(String id) {
        return SOUNDS.register(id, () -> new SoundEvent(new ResourceLocation(ChocMusic.MOD_ID, id)));
    }
    private static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChocMusic.MOD_ID);
    public static final RegistryObject<SoundEvent> MUSIC_MOON = register("music_moon");//music_moon references our sounds.json file "music_moon".
    public static final RegistryObject<SoundEvent> MUSIC_POST_MOON = register("music_post_moon");
    public static final RegistryObject<SoundEvent> MUSIC_DAY = register("music_day");
    public static final RegistryObject<SoundEvent> MUSIC_OW_CAVE = register("music_ow_cave");
    public static final RegistryObject<SoundEvent> MUSIC_OW_SCARY = register("music_ow_scary");
    public static final RegistryObject<SoundEvent> MUSIC_OW_DAY = register("music_ow_day");
    public static final RegistryObject<SoundEvent> MUSIC_OW_NIGHT = register("music_ow_night");
    public static final RegistryObject<SoundEvent> MUSIC_NIGHT = register("music_night");
    public static final RegistryObject<SoundEvent> MUSIC_END = register("music_end");
    public static final RegistryObject<SoundEvent> MUSIC_END_BOSS = register("music_end_boss");
    public static final RegistryObject<SoundEvent> MUSIC_WITHER = register("music_wither");
    public static final RegistryObject<SoundEvent> MUSIC_WITHER_PHASE2 = register("music_wither_phase2");
    public static final RegistryObject<SoundEvent> MUSIC_WITHER_SPAWN = register("music_wither_spawn");
    public static final RegistryObject<SoundEvent> MUSIC_WITHER_DEATH = register("music_wither_death");
    public static final RegistryObject<SoundEvent> MUSIC_COMBAT = register("music_combat");
    public static final RegistryObject<SoundEvent> MUSIC_COMBAT_END = register("music_combat_end");


    public static void registerSounds(){
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
