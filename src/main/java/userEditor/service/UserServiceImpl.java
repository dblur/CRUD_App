package userEditor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import userEditor.DAO.UserDAO;
import userEditor.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public void setUserDAO (UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Override
    @Transactional
    public void edit(User user) {
        userDAO.edit(user);
    }

    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }
}
