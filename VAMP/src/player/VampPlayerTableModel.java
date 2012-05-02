package player;

import com.player.bll.VampMediaCollection;
import com.player.bll.Song;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class VampPlayerTableModel implements TableModel {

  String[] columns;
  VampMediaCollection dataClass;
  
  public VampPlayerTableModel() {
    columns = new String[]{
      "Title",
      "Artist",
      "Track Length",
      "Album",
      "Track Number"
    };
  }

  public void setClass( Class className ) {
    
  }
  
  @Override
  public void removeTableModelListener( TableModelListener l ) {
  }
  
  @Override
  public void addTableModelListener(TableModelListener l) {}
  
  @Override
  public Class getColumnClass( int columnIndex ) {
    return dataClass.getClass();
  }
  
  @Override
  public int getColumnCount() {
    return columns.length;
  }
  
  @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {}
  
  @Override
  public String getColumnName( int columnIndex ) {
    return columns[ columnIndex ];
  }
  
  @Override
  public int getRowCount() {
    return dataClass.size();
  }
  
  @Override
  public Object getValueAt( int rowIndex, int columnIndex ) {
    return getDataValue( columns[ columnIndex ], rowIndex );
  }

  @Override
  public boolean isCellEditable( int rowIndex, int columnIndex ) {
    return false;
  }
  
 
//  public void setValueAt( Object aValue, int rowIndex, int ColumnIndex ) {
//  }
  
  public void setData( VampMediaCollection dataClass ) {
    this.dataClass = dataClass;
  }
  
  public Object getDataValue( String fieldName, int rowIndex ) {
    try {
      Song song = dataClass.get( rowIndex );
      Method method = song.getClass().getMethod( "get"+fieldName );
      method.invoke( song );
    } catch ( Exception e ) {}
    return new String();
  }
}
