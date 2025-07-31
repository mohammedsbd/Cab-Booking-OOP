// package util;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

// public class DBConnection {

//     private static final String URL = "jdbc:mysql://localhost:3306/cbs2";
//     private static final String USER = "cbs";
//     private static final String PASSWORD = "123456";

//     static {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             System.out.println("✅ MySQL JDBC Driver Registered!");
//         } catch (ClassNotFoundException e) {
//             System.out.println("❌ MySQL JDBC Driver NOT found!");
//             e.printStackTrace();
//         }
//     }

//     public static Connection getConnection() throws SQLException {
//         // Return a NEW connection every time this method is called
//         return DriverManager.getConnection(URL, USER, PASSWORD);
//     }
// }  




package util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ MySQL JDBC Driver Registered!");

            // Load database credentials from properties file
            Properties props = new Properties();
            InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("dbconfig.properties");

            if (input == null) {
                throw new IOException("❌ Unable to find dbconfig.properties in classpath!");
            }

            props.load(input);
            url = props.getProperty("db.url");
            user = props.getProperty("db.username");
            password = props.getProperty("db.password");

        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver NOT found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("❌ Failed to load database properties!");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}

