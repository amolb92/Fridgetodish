/*package com.catapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{
	private static String url = "jdbc:sqlserver://IRUSYN1LAP\\SQLEXPRESS;databaseName=CATAPP;integratedSecurity=true";    
    private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   
    ////private static String username = "root";   
   // private static String password = "root";
    private static Connection con;
   // private static String urlstring;

    public  Connection getConnection() {
    	
           try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            
            try {
               // con = DriverManager.getConnection(urlstring, username, password);
            	con=DriverManager.getConnection(url);
            	
            	
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
         /*catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }*/
    	// return con;
   //  } 
    /*public static void main(String[] args){
    	try {
		   // con = DriverManager.getConnection(urlstring, username, password);
			con=DriverManager.getConnection(url);
			User lUser =new User();
			lUser.setEntityId(1l);
			lUser.find(con, lUser);
			
		} catch (SQLException ex) {
		    // log an exception. fro example:
		    System.out.println("Failed to create the database connection."); 
		}
    }

}*/


package com.fridgetodish.Action;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;



public class DBConnection{
	
	
	//private static String url = "jdbc:mysql://localhost:3306/fridgetodish?autoReconnect=true&useSSL=false";
	/*private static String url=String.format(
		    "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
			        + "socketFactory=com.google.cloud.sql.mysql.SocketFactory",
			    "fridgetodish",
			    "quantum-engine-199903:us-central1:fridge-to-dish");
   private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "mysql1234";
    private static Connection con;
	//public static final Logger logger = Logger.getLogger(DBConnection.class.toString());
   // private static String urlstring;
*/    
    public static Connection getConnection() throws URISyntaxException, SQLException {
        URI url = new URI(System.getenv("mysql://b753ba6a0e03b3:ad297d2c@us-cdbr-iron-east-05.cleardb.net/heroku_6706d4fbc456e71?reconnect=true"));

        String username = url.getUserInfo().split(":")[0];
        String password = url.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:mysql://" + url.getHost() + url.getPath();

        return DriverManager.getConnection(dbUrl, username, password);
    }

   /* public  Connection getConnection() {
    	
           try {
        	 //  Credential creds = GoogleCredential.getApplicationDefault();
        	 con = DriverManager.getConnection(url, username, password);
			Class.forName(driverName);
		} 
           
           catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           catch (ClassNotFoundException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
            
            try {
               con = DriverManager.getConnection(url, username, password);
            	//con=DriverManager.getConnection(url);
               //logger.error("Connection Successful");
            	
            } catch (SQLException ex) {
                // log an exception. fro example:
            	//logger.error("Error Occured While creating connection---->", ex);
            }
         //catch (ClassNotFoundException ex) {
            // log an exception. for example:
           // System.out.println("Driver not found."); 
        //}
    	return con;
    }
    public static void main (String [] args){
    	new DBConnection().getConnection();
    }
*/
}