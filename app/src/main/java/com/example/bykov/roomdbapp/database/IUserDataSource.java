package com.example.bykov.roomdbapp.database;

import com.example.bykov.roomdbapp.model.User;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by bykov on 13.06.2018.
 */

public interface IUserDataSource {
    Flowable<User> getUserById(int userId);

    Flowable<List<User>> getAllUsers();

    void insertUser(User... users);

    void updateUser(User... users);

    void deleteUser(User user);

    void deleteAllUsers();
}
