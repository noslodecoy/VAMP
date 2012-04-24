package com.player.bll;

import java.util.*;

public class Playlist {
  
  LinkedList<Song> playlist;
  private String name;

  public Playlist( String nameToUse ) {
    playlist = new LinkedList();
    name = nameToUse;
  }

  public void setName( String newName ) {
    name = newName;
  }
  
  public String getName() {
    return name;
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

}
