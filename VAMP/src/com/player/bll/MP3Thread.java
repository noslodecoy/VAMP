package com.player.bll;

import javazoom.jl.player.Player;

// TODO: add code to play an MP3 thread
public class MP3Thread extends Thread {
  
  private Player player;
  
  public MP3Thread( Player inPlayer ) {
    super();
    // Takes a JLayer Player object in as a parameter.
    this.player = inPlayer;
  }
  
  public void run() {
    // TODO: add code to run as a thread.  This is where the MP3 file
    // should be played.  This thread should be called from the Player.java
    // class.  The Player object which was passed earlier will be played here.
  }
}
