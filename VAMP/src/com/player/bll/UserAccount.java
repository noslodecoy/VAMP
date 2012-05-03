package com.player.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserAccount {
  
  public long id;
  public String username;
  public String password;
  public String password2; 
  public String email;
  
  public UserAccount() {
  }

  public UserAccount( String username, String password ) {
    System.out.println( "USERNAME: "+username+", PASSWORD: "+password );
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session session = sessionFactory.openSession();
    Query query = session.createQuery( "FROM UserAccount WHERE username = :username AND password = :password");
    
    UserAccount returnedUser = (UserAccount)query
            .setParameter( "username", username )
            .setParameter( "password", password )
            .uniqueResult();
    if (returnedUser != null ) {
      this.id = returnedUser.getId();
      this.username = returnedUser.getUsername();
      this.password = returnedUser.getPassword();
      this.email = returnedUser.getEmail();
    }
  }
  
  public UserAccount( String username, String password, String email ) {
    this.username = username;
    this.password = password;
    this.password2 = password2;
    this.email = email;
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    session.save( this );
    tx.commit();
  }

    public static boolean userExists( String username ) {
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session session = sessionFactory.openSession();
    Query query = session.createQuery( "FROM UserAccount WHERE username = :username");
    query.setParameter( "username", username );
    if (username != null) {
            return ( query.list().size() > 0 );
        }
    else {
            return true;
        }
    }
  
  public boolean validate() {
    return ( this.username != null && this.password != null );
  }
  
  public boolean passwordMatch() {
      return ( this.password.equals( this.password2 ) ); 
  }
  
  public long getId() {
    return id;
  }
  
  public void setId( long id ) {
    this.id = id;
  }
  
  public String getUsername() {
    return username;
  }
  
  public void setUsername( String username ) {
    this.username = username;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword( String password ) {
    this.password = password;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail( String email ) {
    this.email = email;
  }
  
  public List<Playlist> getPlaylists() {
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session songsSession = sessionFactory.openSession();
    Query query = songsSession.createQuery( "FROM Playlist WHERE user_id = :user" );
    query.setParameter( "user", this.getId() );
    return (List)query.list();
  }
  
  public Object[][] getPlaylistsVector( ArrayList<Playlist> playlists ) {
    int arraySize = playlists.size();
    Object[][] objectToReturn = new Object[arraySize][1];
    for ( int i = 0; i < arraySize; i++ ) {
      objectToReturn[i] = new Object[]{
        playlists.get(i).getName()
      };
    }
    return objectToReturn;
  }
  
  

  
  public boolean isValidPassword(String pwd) {
    String passReq="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,16})";  
    CharSequence input = pwd;  
    Pattern pattern = Pattern.compile(passReq);  
    Matcher matcher = pattern.matcher(input);  
    return matcher.matches();  
    }
    
    public boolean isValidUsername(String username) {
    String userReq="^[a-zA-Z][a-zA-Z0-9]{2,15}$";  
    CharSequence input = username;  
    Pattern pattern = Pattern.compile(userReq,Pattern.CASE_INSENSITIVE);  
    Matcher matcher = pattern.matcher(input);  
    return matcher.matches();  
    }
    
    public boolean isValidEmail(String emailAddress)
    {  
    String emailReq="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
    CharSequence input = emailAddress;  
    Pattern pattern = Pattern.compile(emailReq,Pattern.CASE_INSENSITIVE);  
    Matcher matcher = pattern.matcher(input);  
    return matcher.matches();  
    }
  
}
