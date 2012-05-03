package player;

import java.io.File;
import javax.swing.filechooser.*;

// The filter used to filter MP3 files with an open dialog.
public class MediaFileFilter extends FileFilter {

    @Override
  public String getDescription() {
    return "Mp3 Files";
  }
  
    @Override
  public boolean accept(File f) {
    return ( f.isDirectory() ) ? true : ( f.getName().endsWith(".mp3") );
  }
  
}
