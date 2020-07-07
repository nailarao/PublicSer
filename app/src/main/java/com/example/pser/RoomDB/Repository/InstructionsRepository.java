//package com.example.pser.RoomDB.Repository;
//
//import android.content.Context;
//import android.os.AsyncTask;
//
//import androidx.lifecycle.LiveData;
//
//import java.util.List;
//
//import com.example.pser.RoomDB.AppDatabase;
//import com.example.pser.RoomDB.Model.Instructions;
//
////public class InstructionsRepository {
////
////    private AppDatabase appDatabase;
////
////    public InstructionsRepository(Context context) {
////        appDatabase = AppDatabase.getAppDatabase(context);
////    }
////
////    public void insertTask(String question, String answer) {
////        Instructions note = new Instructions();
//////        insertTask(note);
////    }
////
////    public void insertTask(final Instructions note) {
////        new AsyncTask<Void, Void, Void>() {
////            @Override
////            protected Void doInBackground(Void... voids) {
////                appDatabase.daoAccess().insertInstruction(note);
////                return null;
////            }
////        }.execute();
////    }
////
////    public void updateTask(final Instructions note) {
////        new AsyncTask<Void, Void, Void>() {
////            @Override
////            protected Void doInBackground(Void... voids) {
////                appDatabase.daoAccess().updateInstruction(note);
////                return null;
////            }
////        }.execute();
////    }
////
////    public void deleteTask(final int id) {
////        final LiveData<Instructions> task = getTask(id);
////        if(task != null) {
////            new AsyncTask<Void, Void, Void>() {
////                @Override
////                protected Void doInBackground(Void... voids) {
////                    appDatabase.daoAccess().deleteInstruction(task.getValue());
////                    return null;
////                }
////            }.execute();
////        }
////    }
////
////    public void deleteTask(final Instructions note) {
////        new AsyncTask<Void, Void, Void>() {
////            @Override
////            protected Void doInBackground(Void... voids) {
////                appDatabase.daoAccess().deleteInstruction(note);
////                return null;
////            }
////        }.execute();
////    }
////
////    public LiveData<Instructions> getTask(int id) {
////        return appDatabase.daoAccess().getInstruction(id);
////    }
////
////    public LiveData<List<Instructions>> getTasks() {
////        return appDatabase.daoAccess().fetchAllInstructions();
////    }
////}