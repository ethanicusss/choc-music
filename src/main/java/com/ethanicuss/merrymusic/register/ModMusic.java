package com.ethanicuss.merrymusic.register;

import net.minecraft.sounds.Music;

public class ModMusic {
    private static final int GAME_MIN_DELAY = 0;//12000;//Default values are 12000 and 24000. Changed for testing.
    private static final int GAME_MAX_DELAY = 200;//24000;//game chooses random value between min_delay and max_delay and plays music after that time has passed.
    public static final Music MOON = new Music(ModSounds.MUSIC_MOON.get(), GAME_MIN_DELAY, GAME_MAX_DELAY, false);//Register the sound in ModSounds first before making a new Music entry here.
    public static final Music POST_MOON = new Music(ModSounds.MUSIC_POST_MOON.get(), 0, 0, true);//0 min/max game delay and last value = true, this music will replace any currently playing music immediately. Use for important event music.
    public static final Music DAY = new Music(ModSounds.MUSIC_DAY.get(), GAME_MIN_DELAY, GAME_MAX_DELAY, false);
    public static final Music NIGHT = new Music(ModSounds.MUSIC_NIGHT.get(), GAME_MIN_DELAY, GAME_MAX_DELAY, false);
    public static final Music OW_DAY = new Music(ModSounds.MUSIC_OW_DAY.get(), GAME_MIN_DELAY, GAME_MAX_DELAY, false);
    public static final Music OW_NIGHT = new Music(ModSounds.MUSIC_OW_NIGHT.get(), GAME_MIN_DELAY, GAME_MAX_DELAY, false);
    public static final Music OW_CAVE = new Music(ModSounds.MUSIC_OW_CAVE.get(), GAME_MIN_DELAY, GAME_MAX_DELAY, false);
    public static final Music OW_SCARY = new Music(ModSounds.MUSIC_OW_SCARY.get(), GAME_MIN_DELAY, GAME_MAX_DELAY, false);
    public static final Music END = new Music(ModSounds.MUSIC_END.get(), GAME_MIN_DELAY, GAME_MAX_DELAY, false);
    public static final Music END_BOSS = new Music(ModSounds.MUSIC_END_BOSS.get(), 0, 0, true);
    public static final Music WITHER = new Music(ModSounds.MUSIC_WITHER.get(), 0, 0, true);
    public static final Music WITHER_PHASE2 = new Music(ModSounds.MUSIC_WITHER_PHASE2.get(), 0, 0, true);
    public static final Music WITHER_SPAWN = new Music(ModSounds.MUSIC_WITHER_SPAWN.get(), 0, 0, true);
    public static final Music WITHER_DEATH = new Music(ModSounds.MUSIC_WITHER_DEATH.get(), 0, 0, true);
    public static final Music COMBAT = new Music(ModSounds.MUSIC_COMBAT.get(), 0, 0, true);
    public static final Music COMBAT_END = new Music(ModSounds.MUSIC_COMBAT_END.get(), 0, 0, true);
}
