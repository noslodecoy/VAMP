package playerTests;

import com.player.bll.VampPlayer;
import com.player.bll.Playlist;
import com.player.bll.Song;
import java.util.ArrayList;
import java.util.List;
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
    songs.add( new Song( "Little Black Submarines", "The Black Keys" ) );
    songs.add( new Song( "These Days", "Dr. Dog" ) );
    songs.add( new Song( "Civilian", "Wye Oak" ) );
    playlist = new Playlist( "untitled" );
    playlist.addAll( songs );
    player = new VampPlayer( playlist );
  }

  @Test
  public void getCurrentSongTest() {
    Song song = player.getCurrentSong();
    assertEquals( songs.get(0), song );
  }
  
  @Test
  public void playSongTest() {
    player.play();
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
    player.play();
    player.pause();
    assertFalse( player.isPlaying() );
  }

  @Test
  public void pausePositionTest() {
    player.play();
    player.skipForward();
    player.pause();
    assertEquals( songs.get(1), player.getCurrentSong() );
  }
}
