package player;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;

// The filter used to filter MP3 files with an open dialog.
public class MediaFileFilter extends FileFilter {

  public String getDescription() {
    return "Mp3 Files";
  }
  
  public boolean accept(File f) {
    return ( f.isDirectory() ) ? true : ( f.getName().endsWith(".mp3") );
  }
  
}
