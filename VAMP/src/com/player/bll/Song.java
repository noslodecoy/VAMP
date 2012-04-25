package com.player.bll;

import java.io.File;
import java.sql.Time;
import java.util.Comparator;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

public class Song {

  boolean isEmpty;

  //song info from database
  public int id;
  String title;
  String artist;
  public String album;
  public String genre;
  public int track;
  public String filename;
  public Time length;

  public Song() {
    isEmpty = true;
  }
  
  public Song( File inFile ) {
    // TODO: add code to load mp3 tag information from a filename and set
    // Song class variables to match
  }

  public Song( int inSongId ) {
    // TODO: add code to load song information from database record.
  }

  public Song( String newTitle, String newArtist ) {
    isEmpty = false;
    title = newTitle;
    artist = newArtist;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getArtist() {
    return artist;
  }

  public boolean equals( Song songToCompare ) {
    if ( this == songToCompare ) {
      return true;
    }
    return (
      this.getTitle().equals( songToCompare.getTitle() ) &&
      this.getArtist().equals( songToCompare.getArtist() )
    );
  }

  public boolean isEmpty() {
    return isEmpty;
  }

  public static Comparator<Song> CompareByTitle = new Comparator<Song>() {

    @Override
    public int compare(Song song1, Song song2) {
      String songName1 = song1.getTitle().toUpperCase();
      String songName2 = song2.getTitle().toUpperCase();
      return songName1.compareTo( songName2 );
    }

  };

  public static Comparator<Song> CompareByArtist = new Comparator<Song>() {
    @Override
    public int compare(Song song1, Song song2) {
      String songName1 = song1.getArtist().toUpperCase();
      String songName2 = song2.getArtist().toUpperCase();
      return songName1.compareTo( songName2 );
    }
  };

}
