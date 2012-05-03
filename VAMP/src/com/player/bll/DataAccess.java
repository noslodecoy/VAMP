package com.player.bll;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataAccess {
  static SessionFactory sf;
  static Session session;
  
  static public SessionFactory getSessionFactory() {
    if ( DataAccess.sf == null ) {
      DataAccess.sf = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    } 
    return DataAccess.sf;
  }

  static public Session getSession() {
    if ( DataAccess.session == null ) {
      DataAccess.session = DataAccess.getSessionFactory().openSession();
    }
    return DataAccess.session;
  }
  
}
