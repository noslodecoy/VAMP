package playerTests;

import com.player.bll.Library;
import com.player.bll.Song;
import com.player.bll.UserAccount;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class LibraryTest {
  
  Library library;
  List<Song> songs;
  UserAccount user;
    
  public LibraryTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
    user = new UserAccount( "bolson", "123456".toCharArray() );
    songs = new ArrayList<Song>();
    songs.add( new Song( new File( "test/testResources/The Black Keys - El Camino - 04 - Little Black Submarines.mp3" ) ) );
    songs.add( new Song( new File( "test/testResources/Dr. Dog - Be The Void - 03 - These Days.mp3" ) ) );
    songs.add( new Song( new File( "test/testResources/Wye Oak - Civilian - 05 - Civilian.mp3" ) ) );
    library = new Library( user );
    library.addAll( songs );
  }

  @Test
  public void isEmptyLibraryTest() {
    library = new Library();
    assertEquals( 0, library.size() );
  }

  @Test
  public void librarySizeTest() {
    assertEquals( 3, library.size() );
  }

  @Test
  public void addSongSizeTest() {
    library.add( new Song( "TestTitle4", "Test Artist4" ) );
    assertEquals( 4, library.size() );
  }

  @Test
  public void addAllSongCountTest() {
    library.addAll( songs );
    assertEquals( songs.size(), library.size() );
  }

  @Test
  public void addAllSongTest() {
    library.addAll( songs );
    for ( Song songToTest : songs ){
      assertTrue( library.contains( songToTest ) );
    }
  }

  @Test
  public void removeSongTest() {
    library.remove( songs.get(1) );
    assertEquals( 2, library.size() );
  }

  @Test
  public void removedCorrectSongTest() {
    library.remove( songs.get(1) );
    assertFalse( library.contains( songs.get(1) ) );
  }

  @Test
  public void libraryIteratorTest() {
    Collection librarySongs = library.getAll();
    Iterator libraryIterator = librarySongs.iterator();
    assertTrue( libraryIterator.hasNext() );
  }
 
  @Test
  public void sortedByTitleTest() {
    library = new Library();
    Song song1 = new Song( "aaa", "zzz" );
    Song song2 = new Song( "ccc", "bbb" );
    Song song3 = new Song( "zzz", "aaa" );
    library.add( song2 );
    library.add( song3 );
    library.add( song1 );
    library.sortByTitle();
    Collection librarySongs = library.getAll();
    Iterator iterator = librarySongs.iterator();
    assertEquals( song1, iterator.next() );
    assertEquals( song2, iterator.next() );
    assertEquals( song3, iterator.next() );
  }

  @Test
  public void sortedByArtistTest() {
    library = new Library();
    Song song1 = new Song( "zzz", "aaa" );
    Song song2 = new Song( "ddd", "ccc" );
    Song song3 = new Song( "aaa", "zzz" );
    library.add( song2 );
    library.add( song3 );
    library.add( song1 );
    library.sortByArtist();
    Collection librarySongs = library.getAll();
    Iterator iterator = librarySongs.iterator();
    assertEquals( song1, iterator.next() );
    assertEquals( song2, iterator.next() );
    assertEquals( song3, iterator.next() );
  }
  
  @Test
  public void duplicateSongsTest() {
    library = new Library();
    Song song1 = new Song( "This is a duplicate title", "this is a duplicate artist" );
    Song song2 = new Song( "This is a duplicate title", "this is a duplicate artist" );
    Song song3 = new Song( "This is a duplicate title", "this is a duplicate artist" );
    Song song4 = new Song( "This is a duplicate title", "this is a duplicate artist" );
    Song song5 = new Song( "This is a duplicate title", "this is a duplicate artist" );
    library.add( song1 );
    library.add( song2 );
    library.add( song3 );
    library.add( song4 );
    library.add( song5 );
    assertEquals( 1, library.size() );
  }


}
