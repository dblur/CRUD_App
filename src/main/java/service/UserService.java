package service;

import DAO.UserDAO;
import DAO.UserHibernateDAO;
import Entity.User;
import database.HibernateConnection;

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

        userDAO = new UserHibernateDAO(HibernateConnection.getSessionFactory());
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
