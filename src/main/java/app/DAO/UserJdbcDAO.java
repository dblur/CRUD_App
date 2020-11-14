package app.DAO;

import app.database.DatabaseConnection;
import app.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserJdbcDAO implements UserDAO{
    Connection connection = DatabaseConnection.getSQLConnection();

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

    @Override
    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO userinfo(name, email, password) VALUE (?,?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());

            if (preparedStatement.executeUpdate() != 0) {
                preparedStatement.close();
            }
            preparedStatement.close();
        }
        catch (SQLException e){
            System.out.println("Exception");
        }
    }
}
