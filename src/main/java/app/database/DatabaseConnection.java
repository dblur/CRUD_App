package app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static Connection connection;

    public DatabaseConnection() {
    }

    private static final String URL = "jdbc:postgresql://localhost:8080/JavaWebApp";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "admin";
    private static final String DRIVER_CLASS = "org.postgresql.Driver";


    public static Connection getSQLConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER_CLASS);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException | ClassNotFoundException e) {
            System.out.println("Failed to load driver");
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("Connection successfully");
        } else {
            System.out.println("Failed to make connect");
        }
        return connection;
    }
}
