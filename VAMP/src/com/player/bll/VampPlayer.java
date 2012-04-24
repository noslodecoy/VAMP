package com.player.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class VampPlayer {

  private Playlist playlist;
  private int playlistIndex;
  private boolean isPlaying;
  private Player player;
  private Thread thread;
  
  public VampPlayer( Playlist playlistToUse ) {
    playlist = playlistToUse;
    playlistIndex = 0;
    isPlaying = false;
  }

  public Song getCurrentSong() {
    return playlist.get( playlistIndex );
  }
  
  public void play() {
    isPlaying = true;
    // TODO: run mp3 player thread
    String filename = this.getCurrentSong().filename;
    if ( filename != null ) { 
      try {
        FileInputStream fis = new FileInputStream( filename );
        BufferedInputStream bis = new BufferedInputStream( fis );
        player = new Player( bis );
        thread = new MP3Thread( player );
        thread.start();
      } catch ( Exception e ) {
        //TODO: file cannot play error.
        System.out.println( "Problem playing file " + filename );
        System.out.println(e);
      }
    } else {
      //TODO: no file loaded error.
    }
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

}
