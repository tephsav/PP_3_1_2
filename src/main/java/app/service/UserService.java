package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user);

    User getUserById(Long id);
}
