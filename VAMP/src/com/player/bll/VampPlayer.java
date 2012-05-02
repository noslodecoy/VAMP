package com.player.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class VampPlayer {

    private Playlist playlist;
    private int playlistIndex;
    private boolean isPlaying;
    private Mp3Task mp3Task;
    
    private long startTime;

    public VampPlayer(Playlist playlistToUse) {
        playlist = playlistToUse;
        playlistIndex = 0;
        isPlaying = false;
        startTime = 0;
        getTask();
    }
    
    public Mp3Task getTask() {
      if ( mp3Task == null && playlist.size() > 0 ) {
        mp3Task = new Mp3Task( this, this.getCurrentSong() );
      }
      return mp3Task;
    }

    public Song getCurrentSong() {
      if ( playlist.size() > 0 && playlistIndex < playlist.size() ) {
        return playlist.get(playlistIndex);
      }
      return null;
    }
    
    public String getSongTitleOfCurrentTrack() {
        String songTitle = getCurrentSong().getTitle();        
        return songTitle; 
    }
    
    public void play() {
      if ( getTask() != null && isPlaying == false ) {
        getTask().setSong( getCurrentSong() );
        getTask().setStartTime( startTime );
        getTask().createThread();
        isPlaying = true;
      }
    }
    public void stop() {
        startTime = 0;
        getTask().setStartTime( startTime );
        if (getTask() != null) {
            getTask().closeThread();
            isPlaying = false;
        }
    }

    public boolean isPlaying() {
        return ( getTask().isAlive() && isPlaying );
    }

    public void skipForward() {
      boolean wasPlaying = isPlaying();
      stop();
      if ((playlistIndex + 1) < playlist.size()) {
          ++playlistIndex;
      }
      if ( wasPlaying ) {
        play();
      }
    }

    public void skipBackward() {
      boolean wasPlaying = isPlaying();
      stop();
      if ((playlistIndex - 1) >= 0) {
          --playlistIndex;
      }
      if ( wasPlaying ) {
        play();
      }
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void pause() {
      if ( getTask() != null ) {
        long resumeTime = getTime();
        stop();
        startTime = resumeTime;
        mp3Task.setStartTime( resumeTime );
      }
    }

    public void seekToPosition(double percent)
            throws javazoom.jl.decoder.JavaLayerException {
      if ( getTask() != null ) {
        double length = getCurrentSong().getHeader().getTrackLength() * 1000;
        long time = (long)(length * percent);
        seekToTime( time );
      }
    }

    public void seekToTime( long time )
            throws javazoom.jl.decoder.JavaLayerException {
      if ( getTask() != null ) {
        boolean wasPlaying = isPlaying;
        getTask().setStartTime( startTime );
        startTime = time;
        if ( wasPlaying ) {
          getTask().closeThread();
          getTask().setSong( getCurrentSong() );
          getTask().setStartTime( startTime );
          getTask().createThread();
          isPlaying = true;
          //play();
        } else {
          getTask().setStartTime( startTime );
        }
      }
    }
    
    
    public int getTime() {
      if ( getTask() != null ) {
        return mp3Task.getTime();
      }
      return 0;
    }
    
    public double getProgressPercent() {
      double percent = ( Double.valueOf( getTime() ) / Double.valueOf( getCurrentSong().getLength() * 1000 ) );
      return percent;
    }
}
