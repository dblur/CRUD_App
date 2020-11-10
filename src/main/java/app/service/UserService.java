package app.service;

import app.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static UserService instance;
    private List<User> database = new ArrayList<>();

    private UserService() {
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public List<User> getAllUsers() {
        return database;
    }

    public void addUser(User user) {
        database.add(user);
    }


}
