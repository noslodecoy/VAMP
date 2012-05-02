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

  public Mp3Task() {
    startFrame = 0;
  }

  public Mp3Task(Song inSong) {
    startFrame = 0;
    setSong( inSong );
  }
  
  public void setSong( Song inSong ) {
    this.song = inSong;
    //totalFrames = song.getHeader().num
    if ( song.getFileName() != null ) {
      audioDevice = new JavaSoundAudioDevice();
      
      try {
        //bytes = seconds * sample rate * channels * (bits per sample / 8)
        //bytes = seconds * sample rate * frame size
        
//		AudioFormat playbackFormat = new AudioFormat(44100, 16, 2, true, false);
//
//		AudioInputStream source = AudioSystem.getAudioInputStream(new File(
//				"test.mp3"));
//		source = AudioSystem.getAudioInputStream(playbackFormat, source);
//
//		player = new Player(source);
        
        
        fis = new FileInputStream( song.getFile() );// Takes a JLayer Player object in as a parameter.
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
    System.out.println( "Time: " + audioDevice.getPosition() + ( startFrame * 26 ) );
    return audioDevice.getPosition() + ( startFrame * 26 );
  }
}
