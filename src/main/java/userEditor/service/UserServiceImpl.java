package userEditor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userEditor.DAO.UserDAO;
import userEditor.DAO.UserDAOImpl;
import userEditor.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();

    @Autowired
    public void setUserDAO (UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
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
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    @Transactional
    public void edit(User user) {
        userDAO.edit(user);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDAO.getById(id);
    }
}
