package player;

import com.player.bll.UserAccount;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;

public class VampPlayerGUI extends javax.swing.JFrame {
  
    UserAccount user;

    public VampPlayerGUI() {
        user = new UserAccount();
        initComponents();
    }
    
    public void setUserAccount( UserAccount user ) {
      this.user = user;
    }
    
    public void newUser( UserAccount user ) {
      setUserAccount( user );
      welcomeUserLabel.setText( "Welcome, " + user.getUsername() + "!" );
      setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightClickPopupMenu = new javax.swing.JPopupMenu();
        addSongRightClickMenuItem = new javax.swing.JMenuItem();
        deleteSongRightClickMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        newPlaylistRightClickMenuItem = new javax.swing.JMenuItem();
        deletePlaylistRightClickMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        addPlaylistToPlayerRightClickMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        renamePlaylistRightClickMenuItem = new javax.swing.JMenuItem();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        playerPanel = new javax.swing.JPanel();
        playerScrollPane = new javax.swing.JScrollPane();
        playerTable = new javax.swing.JTable();
        playlistPanel = new javax.swing.JPanel();
        playlistSongsScrollPanel = new javax.swing.JScrollPane();
        playlistSongsTable = new javax.swing.JTable();
        playlistNamesScrollPanel = new javax.swing.JScrollPane();
        playlistNamesTable = new javax.swing.JTable();
        libraryPanel = new javax.swing.JPanel();
        libraryScrollPanel = new javax.swing.JScrollPane();
        libraryTable = new javax.swing.JTable();
        mediaStreamPanel = new javax.swing.JPanel();
        currentTrackPlaying = new javax.swing.JLabel();
        songProgressBar = new javax.swing.JProgressBar();
        rewindButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        fastForwardButton = new javax.swing.JButton();
        volumeLabel = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        welcomeUserLabel = new javax.swing.JLabel();
        songTimeLabel = new javax.swing.JLabel();
        applicationMenuBar = new javax.swing.JMenuBar();
        fileMenuItem = new javax.swing.JMenu();
        createNewAccountMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitApplicationMenuItem = new javax.swing.JMenuItem();

        addSongRightClickMenuItem.setText("Add Song");
        addSongRightClickMenuItem.setToolTipText("");
        rightClickPopupMenu.add(addSongRightClickMenuItem);

        deleteSongRightClickMenuItem.setText("Delete Song");
        rightClickPopupMenu.add(deleteSongRightClickMenuItem);
        rightClickPopupMenu.add(jSeparator2);

        newPlaylistRightClickMenuItem.setText("New Playlist");
        rightClickPopupMenu.add(newPlaylistRightClickMenuItem);

        deletePlaylistRightClickMenuItem.setText("Delete Playlist");
        deletePlaylistRightClickMenuItem.setToolTipText("");
        rightClickPopupMenu.add(deletePlaylistRightClickMenuItem);
        rightClickPopupMenu.add(jSeparator3);

        addPlaylistToPlayerRightClickMenuItem.setText("Load Playlist");
        rightClickPopupMenu.add(addPlaylistToPlayerRightClickMenuItem);
        rightClickPopupMenu.add(jSeparator4);

        renamePlaylistRightClickMenuItem.setText("Rename Playlist");
        renamePlaylistRightClickMenuItem.setToolTipText("");
        rightClickPopupMenu.add(renamePlaylistRightClickMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane2.setToolTipText("");

        playerPanel.setBackground(new java.awt.Color(51, 51, 51));

        playerTable.setAutoCreateRowSorter(true);
        playerTable.setBackground(new java.awt.Color(153, 153, 153));
        playerTable.setForeground(new java.awt.Color(204, 204, 204));
        playerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title", "Artist", "Track Length", "Album", "Track Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playerTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        playerTable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        playerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playerTableMouseReleased(evt);
            }
        });
        playerScrollPane.setViewportView(playerTable);

        javax.swing.GroupLayout playerPanelLayout = new javax.swing.GroupLayout(playerPanel);
        playerPanel.setLayout(playerPanelLayout);
        playerPanelLayout.setHorizontalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                .addContainerGap())
        );
        playerPanelLayout.setVerticalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Player", playerPanel);

        playlistPanel.setBackground(new java.awt.Color(51, 51, 51));

        playlistSongsTable.setAutoCreateRowSorter(true);
        playlistSongsTable.setBackground(new java.awt.Color(153, 153, 153));
        playlistSongsTable.setForeground(new java.awt.Color(204, 204, 204));
        playlistSongsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title", "Artist", "Track Length", "Album", "Track Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playlistSongsTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        playlistSongsTable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        playlistSongsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playlistSongsTableMouseReleased(evt);
            }
        });
        playlistSongsScrollPanel.setViewportView(playlistSongsTable);

        playlistNamesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Playlist Name"
            }
        ));
        playlistNamesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playlistNamesTableMouseReleased(evt);
            }
        });
        playlistNamesScrollPanel.setViewportView(playlistNamesTable);

        javax.swing.GroupLayout playlistPanelLayout = new javax.swing.GroupLayout(playlistPanel);
        playlistPanel.setLayout(playlistPanelLayout);
        playlistPanelLayout.setHorizontalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playlistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playlistNamesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playlistSongsScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        playlistPanelLayout.setVerticalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playlistSongsScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addComponent(playlistNamesScrollPanel))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Playlist", playlistPanel);

        libraryPanel.setBackground(new java.awt.Color(51, 51, 51));

        libraryTable.setAutoCreateRowSorter(true);
        libraryTable.setBackground(new java.awt.Color(153, 153, 153));
        libraryTable.setForeground(new java.awt.Color(204, 204, 204));
        libraryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title", "Artist", "Track Length", "Album", "Track Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        libraryTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        libraryTable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        libraryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                libraryTableMouseReleased(evt);
            }
        });
        libraryScrollPanel.setViewportView(libraryTable);

        javax.swing.GroupLayout libraryPanelLayout = new javax.swing.GroupLayout(libraryPanel);
        libraryPanel.setLayout(libraryPanelLayout);
        libraryPanelLayout.setHorizontalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libraryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libraryScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                .addContainerGap())
        );
        libraryPanelLayout.setVerticalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libraryScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Library", libraryPanel);

        mediaStreamPanel.setBackground(new java.awt.Color(102, 102, 102));
        mediaStreamPanel.setForeground(new java.awt.Color(204, 204, 204));

        currentTrackPlaying.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        currentTrackPlaying.setForeground(new java.awt.Color(204, 204, 204));
        currentTrackPlaying.setText("Current Track: ");

        rewindButton.setText("Rewind");
        rewindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewindButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");

        playButton.setText("Play");

        pauseButton.setText("Pause");

        fastForwardButton.setText("Fast Forward");

        volumeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        volumeLabel.setForeground(new java.awt.Color(204, 204, 204));
        volumeLabel.setText("Volume");

        volumeSlider.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        welcomeUserLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        welcomeUserLabel.setForeground(new java.awt.Color(204, 204, 204));
        welcomeUserLabel.setText("Welcome");
        welcomeUserLabel.setToolTipText("");

        songTimeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        songTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songTimeLabel.setText("00:00");
        songTimeLabel.setToolTipText("");
        songTimeLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        songTimeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout mediaStreamPanelLayout = new javax.swing.GroupLayout(mediaStreamPanel);
        mediaStreamPanel.setLayout(mediaStreamPanelLayout);
        mediaStreamPanelLayout.setHorizontalGroup(
            mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediaStreamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mediaStreamPanelLayout.createSequentialGroup()
                        .addComponent(rewindButton)
                        .addGap(18, 18, 18)
                        .addComponent(stopButton)
                        .addGap(18, 18, 18)
                        .addComponent(playButton)
                        .addGap(18, 18, 18)
                        .addComponent(pauseButton)
                        .addGap(18, 18, 18)
                        .addComponent(fastForwardButton)
                        .addGap(82, 82, 82)
                        .addComponent(volumeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(volumeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mediaStreamPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(welcomeUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mediaStreamPanelLayout.createSequentialGroup()
                        .addComponent(currentTrackPlaying)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(songTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mediaStreamPanelLayout.setVerticalGroup(
            mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediaStreamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentTrackPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mediaStreamPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(songTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(songProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rewindButton)
                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stopButton)
                        .addComponent(playButton)
                        .addComponent(pauseButton)
                        .addComponent(fastForwardButton)
                        .addComponent(volumeLabel)))
                .addContainerGap())
        );

        fileMenuItem.setText("File");

        createNewAccountMenuItem.setText("Create New Account ");
        createNewAccountMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewAccountMenuItemActionPerformed(evt);
            }
        });
        fileMenuItem.add(createNewAccountMenuItem);
        fileMenuItem.add(jSeparator1);

        exitApplicationMenuItem.setText("Exit VAMP");
        exitApplicationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitApplicationMenuItemActionPerformed(evt);
            }
        });
        fileMenuItem.add(exitApplicationMenuItem);

        applicationMenuBar.add(fileMenuItem);

        setJMenuBar(applicationMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(mediaStreamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mediaStreamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitApplicationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitApplicationMenuItemActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_exitApplicationMenuItemActionPerformed

    private void rewindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewindButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rewindButtonActionPerformed

    private void createNewAccountMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewAccountMenuItemActionPerformed
        // TODO add your handling code here:
        CreateUserAccountGUI create = new CreateUserAccountGUI();
        create.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createNewAccountMenuItemActionPerformed

    private void libraryTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libraryTableMouseReleased
        TableMouseListenerInterface rightClick = new TableRightClick(); 
        rightClick.mouseReleased(evt);
    }//GEN-LAST:event_libraryTableMouseReleased

    private void playlistSongsTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistSongsTableMouseReleased
        TableMouseListenerInterface rightClick = new TableRightClick(); 
        rightClick.mouseReleased(evt);        
    }//GEN-LAST:event_playlistSongsTableMouseReleased

    private void playlistNamesTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistNamesTableMouseReleased
        TableMouseListenerInterface rightClick = new TableRightClick(); 
        rightClick.mouseReleased(evt);
    }//GEN-LAST:event_playlistNamesTableMouseReleased

    private void playerTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerTableMouseReleased
        TableMouseListenerInterface rightClick = new TableRightClick(); 
        rightClick.mouseReleased(evt);
    }//GEN-LAST:event_playerTableMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VampPlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VampPlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VampPlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VampPlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VampPlayerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addPlaylistToPlayerRightClickMenuItem;
    private javax.swing.JMenuItem addSongRightClickMenuItem;
    private javax.swing.JMenuBar applicationMenuBar;
    private javax.swing.JMenuItem createNewAccountMenuItem;
    private javax.swing.JLabel currentTrackPlaying;
    private javax.swing.JMenuItem deletePlaylistRightClickMenuItem;
    private javax.swing.JMenuItem deleteSongRightClickMenuItem;
    private javax.swing.JMenuItem exitApplicationMenuItem;
    private javax.swing.JButton fastForwardButton;
    private javax.swing.JMenu fileMenuItem;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel libraryPanel;
    private javax.swing.JScrollPane libraryScrollPanel;
    private javax.swing.JTable libraryTable;
    private javax.swing.JPanel mediaStreamPanel;
    private javax.swing.JMenuItem newPlaylistRightClickMenuItem;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JScrollPane playerScrollPane;
    private javax.swing.JTable playerTable;
    private javax.swing.JScrollPane playlistNamesScrollPanel;
    private javax.swing.JTable playlistNamesTable;
    private javax.swing.JPanel playlistPanel;
    private javax.swing.JScrollPane playlistSongsScrollPanel;
    private javax.swing.JTable playlistSongsTable;
    private javax.swing.JMenuItem renamePlaylistRightClickMenuItem;
    private javax.swing.JButton rewindButton;
    private javax.swing.JPopupMenu rightClickPopupMenu;
    private javax.swing.JProgressBar songProgressBar;
    private javax.swing.JLabel songTimeLabel;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JSlider volumeSlider;
    private javax.swing.JLabel welcomeUserLabel;
    // End of variables declaration//GEN-END:variables


    interface TableMouseListenerInterface {
       public void mouseReleased(MouseEvent e);  
    }

    class TableRightClick implements TableMouseListenerInterface {

        @Override
        public void mouseReleased(MouseEvent e) {
            if (e.isPopupTrigger()) {
                JTable source = (JTable) e.getSource();
                int row = source.rowAtPoint(e.getPoint());
                int column = source.columnAtPoint(e.getPoint());

                if (!source.isRowSelected(row)) {
                    source.changeSelection(row, column, false, false);
                }

                rightClickPopupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    }
}
