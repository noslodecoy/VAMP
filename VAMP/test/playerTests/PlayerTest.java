package playerTests;

import com.player.bll.VampPlayer;
import com.player.bll.Playlist;
import com.player.bll.Song;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class PlayerTest {
  
  Playlist playlist;
  VampPlayer player;
  List<Song> songs;
    
  public PlayerTest() {
  }

  @Before
  public void setUp() {
    songs = new ArrayList<Song>();
    songs.add( new Song( new File( "test/testResources/The Black Keys - El Camino - 04 - Little Black Submarines.mp3" ) ) );
    songs.add( new Song( new File( "test/testResources/Dr. Dog - Be The Void - 03 - These Days.mp3" ) ) );
    songs.add( new Song( new File( "test/testResources/Wye Oak - Civilian - 05 - Civilian.mp3" ) ) );
    playlist = new Playlist( "untitled" );
    playlist.addAll( songs );
    player = new VampPlayer( playlist );
  }
  
  @After
  public void setDown() {
    player.stop();
  }

  @Test
  public void getCurrentSongTest() {
    Song song = player.getCurrentSong();
    assertEquals( songs.get(0), song );
  }
  
  @Test
  public void playSongTest() {
    System.out.println( "starting track" );
    player.play();
    // sleep main thread for a 2 seconds (2000 nanoseconds) so song can play to test
    try {
      Thread.sleep(2000);
    } catch( Exception e ) { }
    System.out.println( "stopping track." );
    assertTrue( player.isPlaying() );
  }

  
  
  @Test
  public void playingFirstSongTest() {
    player.play();
    Song song = player.getCurrentSong();
    assertTrue( song.equals( songs.get(0) ) );
  }

  @Test
  public void skipSongTest() {
    player.skipForward();
    Song song = player.getCurrentSong();
    assertEquals( songs.get(1), song );
  }

  @Test
  public void skipBackTest() {
    player.skipForward();
    player.skipForward();
    player.skipBackward();
    Song song = player.getCurrentSong();
    assertEquals( songs.get(1), song );
  }

  @Test
  public void skipBackPastBeginningTest() {
    player.skipBackward();
    player.skipBackward();
    player.skipBackward();
    player.skipBackward();
    Song song = player.getCurrentSong();
    assertEquals( songs.get(0), song );
  }
  
  @Test
  public void continuePlayingAfterSkipTest() {
    player.play();
    player.skipForward();
    assertTrue( player.isPlaying() );
  }

  @Test
  public void skipWithoutPlayingTest() {
    player.skipForward();
    assertFalse( player.isPlaying() );
  }
  
  @Test
  public void skipPastEndOfListTest() {
    player.skipForward();
    player.skipForward();
    player.skipForward();
    Song song = player.getCurrentSong();
    assertEquals( songs.get(2), song );
  }

  @Test
  public void stopSongAfterPlayingTest() {
    player.play();
    player.stop();
    System.out.println( "started playing track and stopped.  You should NOT hear anything at this point." );
    try {
      Thread.sleep(5000);
    } catch( Exception e ) { }
    assertFalse( player.isPlaying() );
  }
  
  @Test
  public void QueueNewlyAddedSongInPlaylistTest() {
    player.play();
    Song testSong = new Song( "New Title", "New Artist" );
    playlist.add( 1, testSong );
    player.skipForward();
    Song song = player.getCurrentSong();
    assertEquals( song, testSong );
  }
  
  @Test
  public void pauseTest() {
    System.out.println( "starting pauseTest" );
    System.out.println( "playing track for 2 seconds and then pausing" );
    player.play();
    try {
      Thread.sleep(1000);
    } catch( Exception e ) { }

    System.out.println( "pausing track" );
    player.pause();
    try {
      Thread.sleep(1000);
    } catch( Exception e ) { }

    System.out.println( "resuming track. Did it pick up?" );
    player.play();
    try {
      Thread.sleep(1000);
    } catch( Exception e ) { }
    System.out.println( "finished pauseTest" );
  }

  @Test
  public void pausePositionTest() {
    player.play();
    player.skipForward();
    player.pause();
    assertEquals( songs.get(1), player.getCurrentSong() );
  }

  @Test
  public void seekTest() {
    System.out.println( "Playing track 50 seconds in" );
    player.seekToTimePosition( 50000 );
    player.play();
    try {
      Thread.sleep(2000);
    } catch( Exception e ) { }
    System.out.println( "finished with seek test." );
  }
}
