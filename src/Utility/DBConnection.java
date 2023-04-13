package Utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnection {

	  private static DBConnection c=null;
	    private static Connection con=null;
	    private final String url="jdbc:mysql://localhost/gestionbib";
	    private final String user="root";
	    private final String pwd="";
	    private DBConnection()
	    {
	        try {
	    con=DriverManager.getConnection(url, user, pwd);
	        } catch (Exception e) {
	   e.printStackTrace();
	        }
	    }
	    public static Connection getConnection()
	    {
	        if(c==null) c=new DBConnection();
	        return con;
	    }
	     public static void main(String[] args) {
	    	 DBConnection.getConnection();
	    }
	    
	    
}
