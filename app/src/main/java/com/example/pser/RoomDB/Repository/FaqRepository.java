//package com.example.pser.RoomDB.Repository;
//
//import android.content.Context;
//import android.os.AsyncTask;
//import androidx.lifecycle.LiveData;
//import java.util.List;
//import com.example.pser.RoomDB.AppDatabase;
//import com.example.pser.RoomDB.Model.Faqs;
//
////public class FaqRepository {
////
////    private AppDatabase appDatabase;
////
////    public FaqRepository(Context context) {
////        appDatabase = AppDatabase.getAppDatabase(context);
////    }
////
////    public void insertTask(String question, String answer) {
////        Faqs note = new Faqs();
////        note.setQuestion(question);
////        note.setAnswer(answer);
////        insertTask(note);
////    }
////
////    public void insertTask(final Faqs note) {
////        new AsyncTask<Void, Void, Void>() {
////            @Override
////            protected Void doInBackground(Void... voids) {
////                appDatabase.daoAccess().insertFaq(note);
////                return null;
////            }
////        }.execute();
////    }
////
////    public void updateTask(final Faqs note) {
////        new AsyncTask<Void, Void, Void>() {
////            @Override
////            protected Void doInBackground(Void... voids) {
////                appDatabase.daoAccess().updateFaq(note);
////                return null;
////            }
////        }.execute();
////    }
////
////    public void deleteTask(final int id) {
////        final LiveData<Faqs> task = getTask(id);
////        if(task != null) {
////            new AsyncTask<Void, Void, Void>() {
////                @Override
////                protected Void doInBackground(Void... voids) {
////                    appDatabase.daoAccess().deleteFaq(task.getValue());
////                    return null;
////                }
////            }.execute();
////        }
////    }
////
////    public void deleteTask(final Faqs note) {
////        new AsyncTask<Void, Void, Void>() {
////            @Override
////            protected Void doInBackground(Void... voids) {
////                appDatabase.daoAccess().deleteFaq(note);
////                return null;
////            }
////        }.execute();
////    }
////
////    public LiveData<Faqs> getTask(int id) {
////        return appDatabase.daoAccess().getFaq(id);
////    }
////
////    public LiveData<List<Faqs>> getTasks() {
////        return appDatabase.daoAccess().fetchAllFaqs();
////    }
////}