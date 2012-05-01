package com.player.bll;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

public class Song {

  private boolean isEmpty;
  private File file;

  //song info from database
  private Long id;
  private String title;
  private String artist;
  private String album;
  private String genre;
  private int track;
  private String filename;
  private int songLength;
  private long bitrate;
  private long mp3StartByte;
  
  private UserAccount user;

  public Song() {
    isEmpty = true;
  }
  
  public Song( File inFile ) {
    try {
      AudioFile f = AudioFileIO.read( inFile );

      isEmpty = false;
      this.file = inFile;

      Tag tag = f.getTag();
      AudioHeader header = f.getAudioHeader();
      this.artist = tag.getFirst(FieldKey.ARTIST);
      this.album = tag.getFirst(FieldKey.ALBUM);
      this.title = tag.getFirst(FieldKey.TITLE);
      this.track = Integer.parseInt( tag.getFirst(FieldKey.TRACK) );
      this.songLength = header.getTrackLength();
      //tag.getFirst(FieldKey.COMMENT);
      //tag.getFirst(FieldKey.YEAR);
    } catch ( Exception e ) {
    }
  }

  public Song( String newTitle, String newArtist ) {
    isEmpty = false;
    title = newTitle;
    artist = newArtist;
  }

  public void setId( Long id ) {
    this.id = id;
  }
  
  public Long getId() {
    return id;
  }

  public void setArtist( String artist ) {
    this.artist = artist;
  }

  public String getArtist() {
    return artist;
  }  

  public String getAlbum() {
    return album;
  }
  
  public void setAlbum( String album ) {
    this.album = album;
  }
  
  public int getTrack() {
    return track;
  }
  
  public void setTrack( int track ) {
    this.track = track;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle( String title ) {
    this.title = title;
  }
  
  public int getLength() {
    return songLength;
  }

  public void setLength( int length ) {
    this.songLength = length;
  }

  public String getFileName() {
    return filename;
  }
  
  public void setFileName( String filename ) {
    this.filename = filename;
  }
  
  public void setUser( UserAccount user ) {
    this.user = user;
  }
  
  public UserAccount getUser() {
    return user;
  }
  
  public File getFile() {
    return file;
  }

  public boolean equals( Song songToCompare ) {
    if ( this == songToCompare ) {
      return true;
    }
    return (
      this.getTitle().equals( songToCompare.getFileName() ) &&
      this.getArtist().equals( songToCompare.getFileName() )
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