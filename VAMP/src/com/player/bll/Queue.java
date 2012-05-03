package com.player.bll;

import java.util.*;

public class Queue implements VampMediaCollection {
  
  ArrayList<Song> playlist;
  
  public Queue(  ) {
    playlist = new ArrayList();
  }
  
  public Song get( int i ) {
    return playlist.get( i );
  }
  
  public int size() {
    return playlist.size();
  }
  
  public void add( Song songToAdd ) {
    playlist.add( songToAdd );
  }

  public void add( int i, Song songToAdd ) {
    playlist.add( i, songToAdd );
  }
  
  public void addAll( List listToAdd ) {
    playlist.addAll( listToAdd );
  }
  
  public boolean contains( Song songToCheck ) {
    return playlist.contains( songToCheck );
  }
  
  public void remove( Song songToRemove ) {
    playlist.remove( songToRemove );
  }

    public Object[][] getDataVector() {
    int arraySize = playlist.size();
    Object[][] objectToReturn = new Object[arraySize][5];
    for ( int i = 0; i < arraySize; i++ ) {
      Song song = playlist.get( i );
      objectToReturn[i] = new Object[]{
        song.getTitle(),
        song.getArtist(),
        String.valueOf( song.getFormatedLength() ),
        song.getAlbum(),
        String.valueOf( song.getTrack() )
      };
    }
    return objectToReturn;
  }
    
    public void clone( Playlist playlist ) {
      System.out.println( "Cloning" );
      this.playlist = playlist.getAll();
    }
}