package userEditor.DAO;

import userEditor.model.User;

import java.util.List;

public interface UserDAO {

    List<User> allUsers();

    void add(User user);
    void delete(int id);
    void edit(User user);

    boolean checkUser(String name, String password);

    User getById(int id);
    User getByEmail(String email);
    User getByName(String name);

}
