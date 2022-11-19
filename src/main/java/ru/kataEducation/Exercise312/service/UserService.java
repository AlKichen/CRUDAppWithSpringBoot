package ru.kataEducation.Exercise312.service;



import ru.kataEducation.Exercise312.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createNewUser(User user);

    User getUser(Long id);

    void updateUser(Long id, User updatedUser);

    void deleteUser(Long id);
}
