package com.example.pratik.room_android;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Pratik on 04-03-2018.
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM  UserData")
    List<UserData>getallusers();

    @Insert
    void insertUser(UserData... userData);
}
