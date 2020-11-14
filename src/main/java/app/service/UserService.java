package app.service;


import app.DAO.UserDAO;
import app.DAO.UserJdbcDAO;
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
        userDAO = (UserDAO) new UserJdbcDAO().getAllUsers();
        return instance;
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

//    public boolean addUser(User user) throws SQLException {
//        if (userDAO.getAllUsers(user.getName()) == null) {
//            userDAO.addUser(user);
//            return true;
//        } else {
//            return false;
//        }
//    }


}
