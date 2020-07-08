package com.example.pser.RoomDB.Repository;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.lifecycle.LiveData;

import com.example.pser.RoomDB.AppDatabase;
import com.example.pser.RoomDB.Model.CnicTable;
import com.example.pser.RoomDB.Model.User;

import java.util.List;


public class CnicRepository {

    private Context context;
    private AppDatabase appDatabase;

    public CnicRepository(Context context) {
        appDatabase = AppDatabase.getAppDatabase(context);
        this.context = context;
    }

    public void insertTask(final CnicTable note) {
        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                Long result = appDatabase.dao().insertCnic(note);
                return result;
            }
            @Override
            protected void onPostExecute(Long result) {
                if (result > 0) {
                    Toast.makeText(context, "Cnic successfully added", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "Cnic added register", Toast.LENGTH_SHORT).show();
                }
            }
        }.execute();
    }

    public void updateTask(final CnicTable note) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                appDatabase.dao().updateCnic(note);
                return null;
            }
        }.execute();
    }

    public void deleteTask(final int id) {
        final LiveData<CnicTable> task = getTask(id);
        if(task != null) {
            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... voids) {
                    appDatabase.dao().deleteCnic(task.getValue());
                    return null;
                }
            }.execute();
        }
    }

    public void deleteTask(final CnicTable note) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                appDatabase.dao().deleteCnic(note);
                return null;
            }
        }.execute();
    }

    public LiveData<CnicTable> getTask(int id) {
        return appDatabase.dao().getCnicById(id);
    }

    public LiveData<List<CnicTable>> getTasks() {
        return appDatabase.dao().fetchAllCnic();
    }

    public LiveData<CnicTable> serchCnic(String userId) {
        return appDatabase.dao().getCnic(userId);
    }
}