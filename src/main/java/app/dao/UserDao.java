package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user);

    User getUserById(Long id);
}
