package app.DAO;

import app.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void  addUser(User user);
    void deleteUser(String name, String password);

    User getUserByName(String name);
}
