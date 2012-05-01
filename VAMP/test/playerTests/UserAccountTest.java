/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playerTests;

import com.player.bll.UserAccount;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bolson@work
 */
public class UserAccountTest {
  
  static UserAccount staticUser;
  
  public UserAccountTest() {
  }
  // TODO add test methods here.
  // The methods must be annotated with annotation @Test. For example:
  //
  // @Test
  // public void hello() {}

  @BeforeClass
  public static void setUpClass() throws Exception {
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session session = sessionFactory.openSession();
    session.createSQLQuery( "DELETE FROM UserAccount WHERE username = 'staticuser'").executeUpdate();
    session.createSQLQuery( "DELETE FROM UserAccount WHERE username = 'testuser2'").executeUpdate();
    
    staticUser = new UserAccount( "staticuser", "1234567890", "noslodecoy@gmail.com" );
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    SessionFactory sessionFactory = new Configuration().configure( "database/hibernate.cfg.xml" ).buildSessionFactory();
    Session session = sessionFactory.openSession();
    session.createSQLQuery( "DELETE FROM UserAccount WHERE username = 'staticuser'").executeUpdate();
    session.createSQLQuery( "DELETE FROM UserAccount WHERE username = 'testuser2'").executeUpdate();
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }
  
  @Test
  public void createNewUserTest() {
    UserAccount newUser = new UserAccount( "testuser2", "123456", "noslodecoy@gmail.com" );
    assertEquals( "testuser2", newUser.getUsername() );
    assertEquals( "123456", newUser.getPassword() );
    assertEquals( "noslodecoy@gmail.com", newUser.getEmail() );
  }

  
  @Test
  public void loadUserTest() {
    UserAccount loadUser = new UserAccount( staticUser.getUsername(), staticUser.getPassword() );
    assertEquals( "staticuser", loadUser.getUsername() );
    assertEquals( "1234567890", loadUser.getPassword() );
    assertEquals( "noslodecoy@gmail.com", loadUser.getEmail() );
  }
}
