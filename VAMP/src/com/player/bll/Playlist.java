package com.player.bll;

import java.util.*;

public class Playlist {
  
  LinkedList<Song> playlist;
  private String name;

  public Playlist( int userId, int playlistId ) {
    playlist = new LinkedList();
    // TODO: add code to load song information from database record.
    // It should look something like the following (the session may want to be
    // in the UserAccount class and passed to this class.
    //
    // SessionFactory sessionFactory = new Configuration().configure( "database/songs.cfg.xml" ).buildSessionFactory();
    // Session newSession = sessionFactory.openSession();
    // Transaction newTransaction = newSession.beginTransaction();
    // library = (TreeSet)newSession.createQuery( "sql query here" ).list();
  }
  
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

    public Object[][] getDataVector() {
    int arraySize = playlist.size();
    Object[][] objectToReturn = new Object[arraySize][5];
    for ( int i = 0; i < arraySize; i++ ) {
      Song song = playlist.get( i );
      objectToReturn[i] = new Object[]{
        song.getTitle(),
        song.getArtist(),
        String.valueOf( song.getLength() ),
        song.getAlbum(),
        String.valueOf( song.getTrack() )
      };
    }
    return objectToReturn;
  }
}
