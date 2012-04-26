package com.player.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class VampPlayer {

  private Playlist playlist;
  private int playlistIndex;
  private boolean isPlaying;
  private Mp3Task mp3Task;
  private Thread mp3Thread;

  public VampPlayer( Playlist playlistToUse ) {
    playlist = playlistToUse;
    playlistIndex = 0;
    isPlaying = false;
  }

  public Song getCurrentSong() {
    return playlist.get( playlistIndex );
  }

  public void play() {
    mp3Task = new Mp3Task( this.getCurrentSong() );
    mp3Thread = mp3Task.play();
  }

  public void stop() {
    //TODO: add code to check if thread is active.  If so, stop thread.
    isPlaying = false;
    playlistIndex = 0;
  }
  
  public boolean isPlaying() {
    return isPlaying;
  }
  
  public void skipForward() {
    if ( ( playlistIndex + 1 ) < playlist.size() ) {
      ++playlistIndex;
    }
  }

  public void skipBackward() {
    if ( ( playlistIndex - 1 ) >= 0 ) {
      --playlistIndex;
    }
  }

  public Playlist getPlaylist() {
    return playlist;
  }

  public void pause() {
    isPlaying = false;
  }
  
  public void seekToTimePosition( int time ) {
  }

}
