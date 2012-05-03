package com.player.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.JavaSoundAudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;

// TODO: add code to play an MP3 thread
public class Mp3Task implements Runnable {

  FileInputStream fis;
  BufferedInputStream bis;
  AdvancedPlayer player;
  AudioDevice audioDevice;
  private Song song;
  Thread thread;
  
  int startFrame;
  int totalFrames;
  
  VampPlayer playerControl;

  public Mp3Task( VampPlayer playerControl ) {
    this.playerControl = playerControl;
    startFrame = 0;
  }

  public Mp3Task(VampPlayer playerControl, Song inSong) {
    this.playerControl = playerControl;
    startFrame = 0;
    setSong( inSong );
  }
  
  public void setSong( Song inSong ) {
    this.song = inSong;
    if ( song.getFilename() != null ) {
      audioDevice = new JavaSoundAudioDevice();
      try {
        fis = new FileInputStream( song.getFile() );
        bis = new BufferedInputStream(fis);
        player = new AdvancedPlayer( bis, audioDevice );
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
    if ( thread != null ) {
      thread.isAlive();
    }
    return false;
  }

  public void createThread() {
    thread = new Thread(this);
    thread.start();
  }

  public void closeThread() {
    player.close();
  }

  public void run() {
    try {
      player.play( startFrame, 9999999 );
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
  
  public void setStartTime( long startTime ) {
    startFrame = (int)(startTime / 26);
  }
  
  public int getTime() {
    return audioDevice.getPosition() + ( startFrame * 26 );
  }
}