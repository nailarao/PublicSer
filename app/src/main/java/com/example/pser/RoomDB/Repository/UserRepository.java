package com.example.pser.RoomDB.Repository;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.lifecycle.LiveData;

import com.example.pser.RoomDB.AppDatabase;
import com.example.pser.RoomDB.Model.User;

import java.util.List;


public class UserRepository {

    private Context context;
    private AppDatabase appDatabase;

    public UserRepository(Context context) {
        appDatabase = AppDatabase.getAppDatabase(context);
        this.context = context;
    }

    public void insertTask(final User note) {
        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                Long result = appDatabase.dao().insertUser(note);
                return result;
            }
            @Override
            protected void onPostExecute(Long result) {
                if (result > 0) {
                    Toast.makeText(context, "User successfully registered", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "User failed register", Toast.LENGTH_SHORT).show();
                }
            }
        }.execute();
    }

    public void updateTask(final User note) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                appDatabase.dao().updateUser(note);
                return null;
            }
        }.execute();
    }

    public void deleteTask(final int id) {
        final LiveData<User> task = getTask(id);
        if(task != null) {
            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... voids) {
                    appDatabase.dao().deleteUser(task.getValue());
                    return null;
                }
            }.execute();
        }
    }

    public void deleteTask(final User note) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                appDatabase.dao().deleteUser(note);
                return null;
            }
        }.execute();
    }

    public LiveData<User> getTask(int id) {
        return appDatabase.dao().getUserById(id);
    }

    public LiveData<List<User>> getTasks() {
        return appDatabase.dao().fetchAllUser();
    }
    public LiveData<User> searchUser(String email, String password) {
        return appDatabase.dao().getUser(email, password);
    }

    public void insertTask(String toString, String toString1, String toString2, String toString3, String toString4, String toString5, String toString6) {
    }
}