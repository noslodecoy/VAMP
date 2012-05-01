package com.player.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class VampPlayer {

    private Playlist playlist;
    private int playlistIndex;
    private boolean isPlaying;
    private Mp3Task mp3Task;
    private Object bis;
    private Object song;

    public VampPlayer(Playlist playlistToUse) {
        playlist = playlistToUse;
        playlistIndex = 0;
        isPlaying = false;
        mp3Task = new Mp3Task(this.getCurrentSong());
    }

    public Song getCurrentSong() {
        return playlist.get(playlistIndex);
    }

    public void play() {
        mp3Task.createThread();
    }

    public void stop() {
        //TODO: add code to check if thread is active.  If so, stop thread.
        if (mp3Task != null) {
            mp3Task.closeThread();
        }
    }

    public boolean isPlaying() {
        return mp3Task.isAlive();
    }

    public void skipForward() {
        if ((playlistIndex + 1) < playlist.size()) {
            ++playlistIndex;
        }
    }

    public void skipBackward() {
        if ((playlistIndex - 1) >= 0) {
            --playlistIndex;
        }
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void pause() {
        mp3Task.interrupt();
    }

    public void seekToPosition(double percent)
            throws javazoom.jl.decoder.JavaLayerException {

        mp3Task.closeThread();
        getCurrentSong().getFile().length();
        long fileSize = getCurrentSong().getFile().length();
        long bufferedPosition = (long) (percent * fileSize);
        mp3Task.skipBuffered(bufferedPosition);
    }
}
