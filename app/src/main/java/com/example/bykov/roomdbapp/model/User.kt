package com.example.bykov.roomdbapp.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import io.reactivex.annotations.NonNull

/**
 * Created by bykov on 13.06.2018.
 */
@Entity(tableName = "users")
class User {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private var id: Int = 0

    @ColumnInfo(name = "name")
    private var name: String

    @ColumnInfo(name = "email")
    private var email: String

    @Ignore
    constructor(name: String, email: String) {
        this.name = name
        this.email = email
    }

    override fun toString(): String {
        return StringBuilder(name).append("\n").append(email).toString()
    }
}