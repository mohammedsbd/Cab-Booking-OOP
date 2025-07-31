package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/cbs2";
    private static final String USER = "cbs";
    private static final String PASSWORD = "123456";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ MySQL JDBC Driver Registered!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver NOT found!");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        // Return a NEW connection every time this method is called
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
