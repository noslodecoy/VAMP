package com.player.bll;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Playlist implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
  
  private List<Playlist> playlists;
    private Playlist playlistId;
    private List<PlaylistSongs> pSongs;
    private String name;
    private UserAccount userId;
    private SessionFactory sf;
    private Session session;
    

    public Playlist() {
        playlists = new LinkedList<Playlist>();
        pSongs = new LinkedList<PlaylistSongs>();
    }
    
    
    @SuppressWarnings("unchecked")
    public Playlist(UserAccount userId) {
        this.userId = userId;
        sf = new Configuration().configure("database/hibernate.cfg.xml").buildSessionFactory();
        session = sf.openSession();

        Query query = session.createQuery("FROM Playlist WHERE user_id = :user");
        query.setParameter("user", userId.getUserId());
        playlists = query.list();
    }
    
    public void create(String p) {
        setUserId(userId);
        Transaction tx = session.beginTransaction();
        session.save(p);
        tx.commit();
        
    }
    
    public void removePlaylist(Playlist p) {
        playlists.remove(p);
        session.delete(p);
        Transaction tx = session.beginTransaction();
        tx.commit();
    }

    public void remove(int i) {
        removePlaylist(playlists.get(i));
    }

    public Playlist get(int i) {
        return playlists.get(i);
    }

    public boolean contains(Playlist p) {
        return playlists.contains(p);
    }

    public int size() {
        return playlists.size();
    }

//    public void addAll(Collection<Playlist> collectionToAdd) {
//        for (Playlist p : collectionToAdd) {
//            add(p);
//        }
//    }
//
//    public void addAll(List<Playlist> listToAdd) {
//        for (Playlist p : listToAdd) {
//            add(p);
//        }
//    }
    
    public void addAllPlaylistSongs(List<PlaylistSongs> listToAdd) {
        for (PlaylistSongs p : listToAdd) {
            pSongs.add(p);
        }
    }
    public void addAllPlaylistSongs(Collection<PlaylistSongs> collectionToAdd){
        for (PlaylistSongs p : collectionToAdd) {
            pSongs.add(p);
        }
    }
    

    public Collection<Playlist> getAll() {
        return Collections.unmodifiableCollection(playlists);
    }

    public Playlist getPlaylistId() {
        return this.playlistId;
    }

    public void setPlaylistId(Playlist playlistId) {
        this.playlistId = playlistId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccount getUserId() {
        return this.userId;
    }

    public void setUserId(UserAccount userId) {
        this.userId = userId;
    }
    
    public Object[][] getDataVector() {
    int arraySize = playlists.size();
    Object[][] objectToReturn = new Object[arraySize][5];
    for ( int i = 0; i < arraySize; i++ ) {
      Playlist p = playlists.get( i );
      objectToReturn[i] = new Object[]{
        p.getName()
      };
    }
    return objectToReturn;
    }

    

    
}
