package com.player.bll;

public interface VampMediaCollection {

  public int size();
  
  public Song get( int i );

  public void add( Song song );
  
  //public Object getDataValue( String columnName, int row );

}
