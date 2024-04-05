# Choc Music

Adds conditional custom music to Minecraft: Chocolate Edition to complement the many biomes, battles and bosses.

## Conditional custom music

:3\
someone add a list of all the music and the artists here ty

## Adding music

 - Drop a new .ogg (preferably mono) into src/main/resources/assets/chocmusic/sounds
 - Edit the sounds.json in src/main/resources/assets/chocmusic with a new sound object like so:
"music_day" is a collection of music that can be configured to play under a condition. It will choose randomly from the "sounds" array.
There can be only one sound in the "sounds" array. Do this for boss music
```json
"music_day": {
    "subtitle": "subtitles.chocmusic.xh",
    "sounds": [
        {
            "name": "chocmusic:newsong",
            "stream": true
        },
        {
            "name": "chocmusic:newsong2",
            "stream": true
        }
    ]
}
```
 - In an IDE, navigate to src/main/java/com/ethanicuss/chocmusic/register/ModSounds and duplicate a line to add a new SoundEvent. The register id must match the name of the music object in Sounds.json e.g "music_day".
 - Open ModMusic from the same folder and duplicate a line to add a new Music. Enter the SoundEvent that was just created and the delay. For ambient music, the delay should be GAME_MIN_DELAY and GAME_MAX_DELAY. For boss or other 'event' music, the delay should be 0 and 0.

## The Music Player

Now that a sound is added, it needs to play under X condition.
 - Next is to add a condition for the music to play. Navigate to src/main/java/com/ethanicuss/chocmusic/musicplayer/MusicPlayer.
 - The findMusic() function is called each tick to override Minecraft's default method of playing music.
