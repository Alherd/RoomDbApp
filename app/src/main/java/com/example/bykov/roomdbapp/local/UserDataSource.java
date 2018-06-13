package com.example.bykov.roomdbapp.local;

import com.example.bykov.roomdbapp.database.IUserDataSource;
import com.example.bykov.roomdbapp.model.User;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by bykov on 13.06.2018.
 */

public class UserDataSource implements IUserDataSource {

    private UserDAO userDAO;
    private static UserDataSource mInstance;
    public UserDataSource(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public static UserDataSource getInstance(UserDAO userDAO){
        if(mInstance == null){
            mInstance = new UserDataSource(userDAO);
        }
        return mInstance;
    }
    @NotNull
    @Override
    public Flowable<User> getUserById(int userId) {
        return userDAO.getUserById(userId);
    }

    @NotNull
    @Override
    public Flowable<List<User>> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void insertUser(User... users) {
        userDAO.insertUser(users);

    }

    @Override
    public void updateUser(User... users) {
        userDAO.updateUser(users);

    }

    @Override
    public void deleteUser(@NotNull User user) {
        userDAO.deleteUser(user);
    }

    @Override
    public void deleteAllUsers() {
        userDAO.deleteAllUsers();

    }
}
