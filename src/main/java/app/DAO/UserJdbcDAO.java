package app.DAO;

import app.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserJdbcDAO implements UserDAO{
    private Connection connection;

    UserJdbcDAO(Connection daoConnection) {
        connection = daoConnection;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers= new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("SELECT * FROM userinfo");
            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                allUsers.add(new User(id, name, email, password));
            }
        }
        catch (SQLException e){
            System.out.println("Exception");
        }
        return allUsers;
    }
}
