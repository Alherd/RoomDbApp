package com.example.bykov.roomdbapp.local

import android.arch.persistence.room.*
import com.example.bykov.roomdbapp.model.User
import io.reactivex.Flowable

/**
 * Created by bykov on 13.06.2018.
 */
@Dao
interface UserDAO {
    @Query("SELECT * FROM users WHERE id=: userId")
    fun getUserById(userId: Int): Flowable<User>

    @Query("SELECT * FROM users")
    fun getAllUsers(): Flowable<List<User>>

    @Insert
    fun insertUser(user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)

    @Query("DELETE FROM users")
    fun deleteAllUsers()
}