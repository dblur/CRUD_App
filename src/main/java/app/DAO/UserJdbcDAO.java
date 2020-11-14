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
            System.out.println("Exception from getAllUsers");
            e.printStackTrace();
        }
        return allUsers;
    }

    @Override
    public User getUserByName(String name) {
        User user = null;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT FROM userinfo WHERE name=?");
            preparedStatement.setString(1, name);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();

            if (resultSet.next()) {
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                user = new User(name, password, email);
            }
            resultSet.close();
            preparedStatement.close();
        }
        catch (SQLException e) {
            System.out.println("Exception from getUserByName");
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO userinfo(name, email, password) VALUES (?,?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            if (preparedStatement.executeUpdate() != 0) {
                preparedStatement.close();
            }
            preparedStatement.close();
        }
        catch (SQLException e) {
            System.out.println("Exception from addUser");
            e.printStackTrace();
        }
    }

    public void deleteUser(String name, String password) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM userinfo WHERE name=? AND password=? ");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Exception from deleteUser");
            e.printStackTrace();
        }
    }
}
