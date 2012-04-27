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

    public Mp3Task(Song inSong) {
        this.song = inSong;
        try {
            fis = new FileInputStream(inSong.getFile());// Takes a JLayer Player object in as a parameter.
            bis = new BufferedInputStream(fis);
            player = new Player(bis);

        } 
        
        catch (Exception e) {
            //TODO: ERROR Message(POP UP)
        }

    }

    public Thread createThread() {
        Thread thread = new Thread(this);
        thread.start();
        return thread;
    }
    
    public void closeThread() {
        player.close();
    }
    
    public void run() {
        try {
            player.play();
        } 
        catch (JavaLayerException ex) {
            //TODO: ERROR Message(POP UP)
        }
    }
}
