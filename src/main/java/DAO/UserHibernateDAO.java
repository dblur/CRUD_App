package DAO;

import Entity.User;
import database.HibernateConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserHibernateDAO implements UserDAO {
    private final SessionFactory sessionFactory;

    public UserHibernateDAO(SessionFactory sessionFactory) {
        this.sessionFactory = HibernateConnection.getSessionFactory();
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList;
        try (Session session = sessionFactory.openSession()) {
            userList = (List<User>) session.createQuery("FROM User").list();
            session.close();
        }
        return userList;
    }

    @Override
    public User getUserByName(String name) {
        User user;
        try (Session session = sessionFactory.openSession()) {
            user = (User) session.createQuery("FROM User WHERE name=:name");
            session.close();
        }
        return user;
    }

    public void addUser(User user) {
        try (Session session = sessionFactory.openSession()) {

            session.save(user);
            session.close();
        }
    }

    public void deleteUser(String name, String password) {
        try (Session session = sessionFactory.openSession()) {

            session.delete(name, password);
            session.close();
        }
    }
}
