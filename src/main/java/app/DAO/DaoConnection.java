package app.DAO;

import app.database.DatabaseConnection;

public class DaoConnection {
    public static UserDAO getDaoConnection() {
        return new UserJdbcDAO(DatabaseConnection.getSQLConnection());
    }
}
