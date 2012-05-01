package com.player.bll;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Library {

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
    sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    session = sessionFactory.openSession();
    
    Query query = session.createQuery( "FROM Song WHERE user_id = :user" );
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
    Transaction tx = session.beginTransaction();
    session.save( s );
    tx.commit();
    library.add( s );
  }

  public void remove( Song s ) {
    library.remove( s );
    session.delete( s );
    Transaction tx = session.beginTransaction();
    tx.commit();
  }
  
  public void remove( int i ) {
    remove( library.get( i ) );
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
        String.valueOf( song.getLength() ),
        song.getAlbum(),
        String.valueOf( song.getTrack() )
      };
    }
    return objectToReturn;
  }

}