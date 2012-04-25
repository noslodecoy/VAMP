package com.player.bll;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Library {

  TreeSet<Song> library;

  public Library() {
    library = new TreeSet();
    // TODO: add code to load song information from database record.
    // It should look something like the following (the session may want to be
    // in the UserAccount class and passed to this class.
    //
    // SessionFactory sessionFactory = new Configuration().configure( "database/songs.cfg.xml" ).buildSessionFactory();
    // Session newSession = sessionFactory.openSession();
    // Transaction newTransaction = newSession.beginTransaction();
    // library = (TreeSet)newSession.createQuery( "sql query here" ).list();
    sortByArtist();
  }

  public void sortByArtist() {
    TreeSet<Song> oldLibrary = library;
    library = new TreeSet( Song.CompareByArtist );
    library.addAll( oldLibrary );
  }

  public void sortByTitle() {
    TreeSet<Song> oldLibrary = library;
    library = new TreeSet( Song.CompareByTitle );
    library.addAll( oldLibrary );
  }
  
  public void add( Song s ) {
    library.add( s );
  }
  
  public void remove( Song s ) {
    library.remove( s );
  }
  
  public boolean contains( Song s ) {
    return library.contains( s );
  }
  
  public int size() {
    return library.size();
  }
  
  public void addAll( Collection<Song> collectionToAdd ) {
    library.addAll( collectionToAdd );
  }

  public void addAll( List<Song> listToAdd ) {
    library.addAll( listToAdd );
  }

  public Collection<Song> getAll() {
    return Collections.unmodifiableCollection( library );
  }

}