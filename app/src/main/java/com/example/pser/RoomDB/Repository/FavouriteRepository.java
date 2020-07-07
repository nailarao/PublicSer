//package com.example.pser.RoomDB.Repository;
//
//import android.content.Context;
//import android.os.AsyncTask;
//import android.util.Log;
//import android.widget.Toast;
//
//import androidx.lifecycle.LiveData;
//
//import java.util.List;
//
//import com.example.pser.RoomDB.AppDatabase;
//import com.example.pser.RoomDB.Model.Favourites;
//
////public class FavouriteRepository {
////
////    private AppDatabase appDatabase;
////    Context context;
////    String TAG = "FavouriteRepository";
////
////    public FavouriteRepository(Context context) {
////        this.context = context;
////        appDatabase = AppDatabase.getAppDatabase(context);
////    }
////
////    public void insertTask(String question, String answer) {
////        Favourites note = new Favourites();
//////        insertTask(note);
////    }
////
////    public void insertTask(final Favourites note) {
////        new AsyncTask<Void, Void, Long>() {
////            @Override
////            protected Long doInBackground(Void... voids) {
////                Long result = appDatabase.daoAccess().insertFavourite(note);
////                printLog("insertTask", "result:" + result);
////                return result;
////            }
////
////            @Override
////            protected void onPostExecute(Long result) {
////                if (result > 0) {
////                    Toast.makeText(context, "Добавлено в избранные", Toast.LENGTH_SHORT).show();
////                } else {
////                    Toast.makeText(context, "Ошибка добавления", Toast.LENGTH_SHORT).show();
////                }
////            }
////        }.execute();
////    }
////
////    public void updateTask(final Favourites note) {
////        new AsyncTask<Void, Void, Void>() {
////            @Override
////            protected Void doInBackground(Void... voids) {
////                appDatabase.daoAccess().updateFavourite(note);
////                return null;
////            }
////        }.execute();
////    }
////
////    public boolean searcTask(final int id) {
////        final Favourites task = appDatabase.daoAccess().searchFavourite(id);
////        return task != null;
////    }
////
////    public void deleteTask(final int id) {
////        appDatabase.daoAccess().deleteFavourite(id);
////    }
////
//////    public void deleteTask(final int id) {
//////        final LiveData<Favourites> task = getTask(id);
//////        if (task != null) {
//////            new AsyncTask<Void, Void, Void>() {
//////                @Override
//////                protected Void doInBackground(Void... voids) {
//////                    appDatabase.daoAccess().deleteFavourite(task.getValue());
//////                    return null;
//////                }
//////            }.execute();
//////        }
//////    }
////
////    public void deleteTask(final Favourites note) {
////        new AsyncTask<Void, Void, Void>() {
////            @Override
////            protected Void doInBackground(Void... voids) {
////                appDatabase.daoAccess().deleteFavourite(note);
////                return null;
////            }
////        }.execute();
////    }
////
////    public LiveData<Favourites> getTask(int id) {
////        return appDatabase.daoAccess().getFavourite(id);
////    }
////
////    public LiveData<List<Favourites>> getTasks() {
////        return appDatabase.daoAccess().fetchAllFavourites();
////    }
////
////    public void printLog(String method, String message) {
////        Log.e(TAG, "Room => " + method + " => " + message);
////    }
////}