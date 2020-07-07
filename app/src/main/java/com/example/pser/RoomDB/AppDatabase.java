package com.example.pser.RoomDB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.pser.RoomDB.Interfaces.DaoAccess;
import com.example.pser.RoomDB.Model.User;

//import com.example.pser.RoomDB.Model.Faqs;
//import com.example.pser.RoomDB.Model.Favourites;
//import com.example.pser.RoomDB.Model.Instructions;

@Database(entities = {User.class, }, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public abstract DaoAccess dao();

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "user-database")
                            // allow queries on the main thread.
                            // Don't do this on a real app! See PersistenceBasicSample for an example.
                            .allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}