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

    public User getUserById(Long id) {
        return userDAO.getUserById(id);
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
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }

    public void editUser(User user) {
        userDAO.editUser(user);
    }
}
