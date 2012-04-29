package com.player.bll;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Library {

  TreeSet<Song> library;
  UserAccount user;
  SessionFactory sessionFactory;
  Session session;

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

  public Library( UserAccount user ) {
    this.user = user;
    sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    session = sessionFactory.openSession();
    library = new TreeSet();
    
    Query query = session.createQuery( "FROM Song WHERE user_id = :user" );
    query.setParameter( "user", user.getId() );
    List<Song> libraryList = query.list();
    Set<Song> library = new HashSet<Song>(libraryList);
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
    s.setUser( user );
    Transaction tx = session.beginTransaction();
    session.save( s );
    tx.commit();
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

}