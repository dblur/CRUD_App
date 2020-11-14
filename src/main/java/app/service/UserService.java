package app.service;

import app.DAO.DaoConnection;
import app.DAO.UserDAO;
import app.model.User;

import java.util.List;

public class UserService {
    private static UserService instance;
    private static UserDAO userDAO;

    private UserService() {
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        userDAO = DaoConnection.getDaoConnection();
        return instance;
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public User getUserByName(String name) {
        return userDAO.getUserByName(name);
    }

    public boolean addUser(User user) {
        if (userDAO.getUserByName(user.getName()) == null) {
            userDAO.addUser(user);
            return true;
        }
        else {
            return false;
        }
    }

    public void deleteUser(String name, String password) {
        userDAO.deleteUser(name, password);
    }
}
