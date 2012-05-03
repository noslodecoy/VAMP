package com.player.bll;

import java.lang.reflect.Method;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Library implements VampMediaCollection {

  List<Song> library;
  UserAccount user;
  SessionFactory sessionFactory;
  Session session;

  public Library() {
    library = new ArrayList();
    //sortByArtist();
  }

  public Library( UserAccount user ) {
    this.user = user; 
    Query query = DataAccess.getSession().createQuery( "FROM Song WHERE user_id = :user" );
    query.setParameter( "user", user.getId() );
    library = query.list();

    //library = new TreeSet();
    //library.addAll( libraryList );

    //sortByArtist();
  }

  public void sortByArtist() {
//    TreeSet<Song> oldLibrary = library;
//    library = new TreeSet( Song.CompareByArtist );
//    library.addAll( oldLibrary );
  }

  public void sortByTitle() {
//    TreeSet<Song> oldLibrary = library;
//    library = new TreeSet( Song.CompareByTitle );
//    library.addAll( oldLibrary );
  }
  
  public void add( Song s ) {
    s.setUser( user );
    Transaction tx = DataAccess.getSession().beginTransaction();
    DataAccess.getSession().save( s );
    tx.commit();
    library.add( s );
  }

  public void remove( Song s ) {
    library.remove( s );
    DataAccess.getSession().delete( s );
    Transaction tx = DataAccess.getSession().beginTransaction();
    tx.commit();
  }

  public void remove( int i ) {
    remove( library.get( i ) );
  }

  public Song get ( int i ) {
    return library.get(i);
  }

  public boolean contains( Song s ) {
    return library.contains( s );
  }
  
  public int size() {
    return library.size();
  }
  
  public void addAll( Collection<Song> collectionToAdd ) {
    for( Song s : collectionToAdd ) {
      add( s );
    }
  }

  public void addAll( List<Song> listToAdd ) {
    for( Song s : listToAdd ) {
      add( s );
    }
  }

  public Collection<Song> getAll() {
    return Collections.unmodifiableCollection( library );
  }
  
  public Object[][] getLibraryVector() {
    int arraySize = library.size();
    Object[][] objectToReturn = new Object[arraySize][5];
    for ( int i = 0; i < arraySize; i++ ) {
      Song song = library.get( i );
      objectToReturn[i] = new Object[]{
        song.getTitle(),
        song.getArtist(),
        String.valueOf( song.getFormatedLength() ),
        song.getAlbum(),
        String.valueOf( song.getTrackNumber() ),
        String.valueOf( i )
      };
    }
    return objectToReturn;
  }
  
}
