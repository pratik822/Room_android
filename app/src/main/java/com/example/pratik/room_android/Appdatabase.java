package com.example.pratik.room_android;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Pratik on 04-03-2018.
 */
 @Database(entities ={UserData.class},version = 1)
public abstract class Appdatabase extends RoomDatabase{
     public abstract UserDao userDao();
}
