package com.player.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

// TODO: add code to play an MP3 thread
public class Mp3Task implements Runnable {

  FileInputStream fis;
  BufferedInputStream bis;
  Player player;
  private Song song;
  Thread thread;

  public Mp3Task() {
  }

  public Mp3Task(Song inSong) {
    setSong( inSong );
  }
  
  public void setSong( Song inSong ) {
    this.song = inSong;
    if ( song.getFileName() != null ) {
      try {
        fis = new FileInputStream(song.getFile());// Takes a JLayer Player object in as a parameter.
        bis = new BufferedInputStream(fis);
        player = new Player(bis);
      } 
      catch (Exception e) {
          //TODO: ERROR Message(POP UP)
      }
    }
  }
  
  public void interrupt() {
    thread.interrupt();
  }
  
  public boolean isAlive() {
    return thread.isAlive();
  }

  public void createThread() {
    System.out.println( song.getFileName() );
    thread = new Thread(this);
    thread.start();
  }

  public void closeThread() {
    player.close();
  }

  public void run() {
    System.out.println( song.getFileName() );
    try {
        player.play();
    } 
    catch (JavaLayerException ex) {
        //TODO: ERROR Message(POP UP)
    }
  }
  public void skipBuffered(Long BufferedSkip) {
    try {
      bis.skip(BufferedSkip);
    } catch (Exception e) {
    }
  }
  
  public int getTime() {
    return player.getPosition();
  }
}
