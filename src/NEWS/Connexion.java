package NEWS;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;


public class Connexion
{
   private static Connexion singleton=null;
   private Connexion()
   {
		try
		{
			DriverManager.registerDriver(new com.ibm.as400.access.AS400JDBCDriver());
		  //Class.forName("com.ibm.as400.access.AS400JDBCDriver").newInstance();
        }
	    catch(Exception e)
        {System.out.println("erreur dans Connexion : "+e.toString());
        }
   	
   }
   
   public static Connection connect() 
   {	
    Connection connexion=null;
  	try{
  	if(singleton==null)
  		singleton=new Connexion();
	String url="jdbc:as400://My_IP_@/my_Librery;date format=ISO";
	String login="lolo";
	String password="my_pass";
	DriverManager.registerDriver(new AS400JDBCDriver());
	connexion=(Connection) DriverManager.getConnection(url,login,password);



       }
	catch(Exception e)
    {}
    return connexion;
   }

    private static class AS400JDBCDriver implements Driver {
        @Override
        public Connection connect(String url, Properties info) throws SQLException {
            return null;
        }

        @Override
        public boolean acceptsURL(String url) throws SQLException {
            return false;
        }

        @Override
        public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
            return new DriverPropertyInfo[0];
        }

        @Override
        public int getMajorVersion() {
            return 0;
        }

        @Override
        public int getMinorVersion() {
            return 0;
        }

        @Override
        public boolean jdbcCompliant() {
            return false;
        }

        @Override
        public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
        }
    }
}
