package com.example.bykov.roomdbapp.database

import com.example.bykov.roomdbapp.model.User
import io.reactivex.Flowable

/**
 * Created by bykov on 13.06.2018.
 */
interface IUserDataSource {
    fun getUserById(userId: Int): Flowable<User>
    fun getAllUsers(): Flowable<List<User>>
    fun insertUser(user: User)
    fun updateUser(user: User)
    fun deleteUser(user: User)
    fun deleteAllUsers()
}