package com.player.bll;

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
    return ( query.list().size() > 0 );
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
  
}
