package prj301demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUNGHUYNH
 */
public class DBUtils {
    

    public static Connection getConnection(){
        
        String url;        
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        } else{
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        }
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("PRJ301DEMO: Can not load JDBC Driver. Please check your pom file");
        }
        
        try {
            Connection con = DriverManager.getConnection(url, userID, password);
            return con;
        } catch (SQLException ex) {
            System.out.println("PRJ301DEMO: Can not connect SQL Server. Reason: " + ex.getMessage());                        
        }
        return null;
    }
    
    
    private final static String serverName = "localhost";
    private final static String dbName = "prj301";
    private final static String portNumber = "1433";
    private final static String instance = "";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final static String userID = "sa";
    private final static String password = "123456";
}
