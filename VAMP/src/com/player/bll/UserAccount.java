package com.player.bll;

import java.util.TreeSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserAccount {
  
  private long id;
  private String username;
  private String password;
  private String email;
  
  public UserAccount() {
  }

  public UserAccount( String username, String password ) {
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session session = sessionFactory.openSession();
    UserAccount returnedUser = (UserAccount)session
            .createQuery( "FROM UserAccount WHERE username = :username AND password = :password")
            .setParameter( "username", username )
            .setParameter( "password", password )
            .uniqueResult();
    this.id = returnedUser.getId();
    this.username = returnedUser.getUsername();
    this.password = returnedUser.getPassword();
    this.email = returnedUser.getEmail();
  }

  
  public UserAccount( String username, String password, String email ) {
    this.username = username;
    this.password = password;
    this.email = email;
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    session.save( this );
    tx.commit();
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
  
}
