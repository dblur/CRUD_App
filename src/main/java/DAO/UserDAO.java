package DAO;

import Entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void addUser(User user);
    void deleteUser(Long id);

    User getUserByName(String name);
    User getUserById(Long id);
}
