package com.ishan.fakestore.services;

import com.ishan.fakestore.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    List<User> getUsersLimited(int limit);

    List<User> getUsersSorted(String sort);

    User addUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}