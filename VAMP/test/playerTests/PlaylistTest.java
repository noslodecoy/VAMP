package playerTests;

import com.player.bll.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlaylistTest {
  Playlist playlist;
//  VampPlayer player;
  static UserAccount user;
  static Library library;
  static ArrayList<Song> songs;

  public PlaylistTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session session = sessionFactory.openSession();
    SQLQuery query;
   
    query = session.createSQLQuery( "DELETE FROM UserAccount WHERE username = 'staticuser';" );
    query.executeUpdate();

    query = session.createSQLQuery( "DELETE FROM UserAccount WHERE username = 'testuser';" );
    query.executeUpdate();
    
    user = new UserAccount( "staticuser", "1234567890", "noslodecoy@gmail.com" );
    
    songs = new ArrayList<Song>();
    songs.add( new Song( new File( "test/testResources/The Black Keys - El Camino - 04 - Little Black Submarines.mp3" ) ) );
    songs.add( new Song( new File( "test/testResources/Dr. Dog - Be The Void - 03 - These Days.mp3" ) ) );
    songs.add( new Song( new File( "test/testResources/Wye Oak - Civilian - 05 - Civilian.mp3" ) ) );
    library = new Library( user );
    library.addAll( songs );
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
//    
//    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
//    Session session = sessionFactory.openSession();
// 
//    session.createSQLQuery( "DELETE FROM MusicLibrary WHERE user_id = '" + user.getId() + "'").executeUpdate();
//    session.createSQLQuery( "DELETE FROM MusicLibrary WHERE user_id = '" + user.getId() + "'").executeUpdate();
//        
//    session.createSQLQuery( "DELETE FROM MusicLibrary WHERE user_id = '"+user.getId()+"'").executeUpdate();
//    session.createSQLQuery( "DELETE FROM UserAccount WHERE username = 'staticuser';" ).executeUpdate();
//    session.createSQLQuery( "DELETE FROM UserAccount WHERE username = 'testuser';" ).executeUpdate();
  }

  @Before
  public void setUp() {
    playlist = new Playlist( user, "untitled" );
  }
  
  @Test
  public void createdPlaylist() {
    assertTrue( true );
  }
  
  @Test
  public void addSong() {
    playlist.add( songs.get(0) );
  }

//  @Test
//  public void emptyPlaylistTest() {
//    playlist = new Playlist( "Untitled" );
//    assertEquals( 0, playlist.size() );
//  }
//  
//  @Test
//  public void playlistNameTest() {
//    playlist.setName( "test name" );
//    assertEquals( "test name", playlist.getName() );
//  }
//
//  @Test
//  public void addSongTest() {
//    playlist.add( new Song( "TestTitle4", "Test Artist4" ) );
//    assertEquals( 4, playlist.size() );
//  }
//
//  @Test
//  public void addSongToMiddleTest() {
//    Song testSong = new Song( "TestTitle4", "Test Artist4" );
//    playlist.add( 3, testSong );
//    assertEquals( testSong, playlist.get(3) );
//  }
//
//  
//  @Test
//  public void playlistContainsTest() {
//    assertTrue( playlist.contains( songs.get(0) ) );
//  }
//
//  @Test
//  public void addAllSongCountTest() {
//    playlist = new Playlist( "untitled" );
//    playlist.addAll( songs );
//    assertEquals( songs.size(), playlist.size() );
//  }
//
//  @Test
//  public void addAllSongTest() {
//    playlist.addAll( songs );
//    for ( Song songToTest : songs ){
//      assertTrue( playlist.contains( songToTest ) );
//    }
//  }
//  
//  @Test
//  public void removeSongTest() {
//    playlist.remove( songs.get(1) );
//    assertFalse( playlist.contains( songs.get(1) ) );
//  }
//  
//  @Test
//  public void getSongByIndexTest() {
//    Song testSong = playlist.get(1);
//    assertEquals( songs.get(1), testSong );
//  }
  
}
