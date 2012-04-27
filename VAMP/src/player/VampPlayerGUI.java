/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayerGUI;

/**
 *
 * @author Jamie
 */
public class VampPlayerGUI extends javax.swing.JFrame {

    /**
     * Creates new form MediaPlayer
     */
    public VampPlayerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        playerPanel = new javax.swing.JPanel();
        playerScrollPane = new javax.swing.JScrollPane();
        playerTable = new javax.swing.JTable();
        playlistPanel = new javax.swing.JPanel();
        playlistScrollPanel = new javax.swing.JScrollPane();
        playlistTable = new javax.swing.JTable();
        libraryPanel = new javax.swing.JPanel();
        libraryScrollPane = new javax.swing.JScrollPane();
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
        applicationMenuBar = new javax.swing.JMenuBar();
        fileMenuItem = new javax.swing.JMenu();
        viewEditAccount = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitApplication = new javax.swing.JMenuItem();

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
        playerScrollPane.setViewportView(playerTable);

        javax.swing.GroupLayout playerPanelLayout = new javax.swing.GroupLayout(playerPanel);
        playerPanel.setLayout(playerPanelLayout);
        playerPanelLayout.setHorizontalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
        );
        playerPanelLayout.setVerticalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Player", playerPanel);

        playlistPanel.setBackground(new java.awt.Color(51, 51, 51));

        playlistTable.setAutoCreateRowSorter(true);
        playlistTable.setBackground(new java.awt.Color(153, 153, 153));
        playlistTable.setForeground(new java.awt.Color(204, 204, 204));
        playlistTable.setModel(new javax.swing.table.DefaultTableModel(
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
        playlistTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        playlistTable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        playlistScrollPanel.setViewportView(playlistTable);

        javax.swing.GroupLayout playlistPanelLayout = new javax.swing.GroupLayout(playlistPanel);
        playlistPanel.setLayout(playlistPanelLayout);
        playlistPanelLayout.setHorizontalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playlistPanelLayout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(playlistScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        playlistPanelLayout.setVerticalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playlistScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
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
        libraryScrollPane.setViewportView(libraryTable);

        javax.swing.GroupLayout libraryPanelLayout = new javax.swing.GroupLayout(libraryPanel);
        libraryPanel.setLayout(libraryPanelLayout);
        libraryPanelLayout.setHorizontalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libraryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libraryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
        );
        libraryPanelLayout.setVerticalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libraryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
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

        javax.swing.GroupLayout mediaStreamPanelLayout = new javax.swing.GroupLayout(mediaStreamPanel);
        mediaStreamPanel.setLayout(mediaStreamPanelLayout);
        mediaStreamPanelLayout.setHorizontalGroup(
            mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediaStreamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentTrackPlaying, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(85, 85, 85)
                        .addComponent(volumeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volumeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        mediaStreamPanelLayout.setVerticalGroup(
            mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediaStreamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentTrackPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mediaStreamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rewindButton)
                        .addComponent(stopButton)
                        .addComponent(playButton)
                        .addComponent(pauseButton)
                        .addComponent(fastForwardButton)
                        .addComponent(volumeLabel))
                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        fileMenuItem.setText("File");

        viewEditAccount.setText("View/Edit Account ");
        fileMenuItem.add(viewEditAccount);
        fileMenuItem.add(jSeparator1);

        exitApplication.setText("Exit VAMP");
        exitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitApplicationActionPerformed(evt);
            }
        });
        fileMenuItem.add(exitApplication);

        applicationMenuBar.add(fileMenuItem);

        setJMenuBar(applicationMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addComponent(mediaStreamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mediaStreamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitApplicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitApplicationActionPerformed

    private void rewindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewindButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rewindButtonActionPerformed

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
    private javax.swing.JMenuBar applicationMenuBar;
    private javax.swing.JLabel currentTrackPlaying;
    private javax.swing.JMenuItem exitApplication;
    private javax.swing.JButton fastForwardButton;
    private javax.swing.JMenu fileMenuItem;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel libraryPanel;
    private javax.swing.JScrollPane libraryScrollPane;
    private javax.swing.JTable libraryTable;
    private javax.swing.JPanel mediaStreamPanel;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JScrollPane playerScrollPane;
    private javax.swing.JTable playerTable;
    private javax.swing.JPanel playlistPanel;
    private javax.swing.JScrollPane playlistScrollPanel;
    private javax.swing.JTable playlistTable;
    private javax.swing.JButton rewindButton;
    private javax.swing.JProgressBar songProgressBar;
    private javax.swing.JButton stopButton;
    private javax.swing.JMenuItem viewEditAccount;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}