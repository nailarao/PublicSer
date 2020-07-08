package com.example.pser.RoomDB.Interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pser.RoomDB.Model.CnicTable;
import com.example.pser.RoomDB.Model.User;

import java.util.List;


//import com.example.pser.RoomDB.Model.Faqs;
//import com.example.pser.RoomDB.Model.Favourites;
//import com.example.pser.RoomDB.Model.Instructions;

@Dao
public interface DaoAccess {

    @Insert
    Long insertUser(User note);


    @Query("SELECT * FROM User")
    LiveData<List<User>> fetchAllUser();

    @Query("SELECT * FROM User WHERE id =:instId")
    LiveData<User> getUserById(int instId);


    @Query("SELECT * FROM User WHERE email =:str_email and password=:str_password")
    LiveData<User> getUser(String str_email, String str_password);


    @Update
    void updateUser(User user);


    @Delete
    void deleteUser(User user);

    /*
     * Cnic CRUD
     */

    @Insert
    Long insertCnic(CnicTable note);

    @Query("SELECT * FROM CnicTable")
    LiveData<List<CnicTable>> fetchAllCnic();

    @Query("SELECT * FROM CnicTable WHERE id =:instId")
    LiveData<CnicTable> getCnicById(int instId);

    @Query("SELECT * FROM CnicTable WHERE user_id =:userId")
    LiveData<CnicTable> getCnic(String userId);

    @Update
    void updateCnic(CnicTable cnic);

    @Delete
    void deleteCnic(CnicTable cnic);



//    /*
//     * Favourites CRUD
//     */
//
//    @Insert
//    Long insertFavourite(Favourites favourites);
//
//
//    @Query("SELECT * FROM Favourites")
//    LiveData<List<Favourites>> fetchAllFavourites();
//
//
//    @Query("SELECT * FROM Favourites WHERE id =:favId")
//    LiveData<Favourites> getFavourite(int favId);
//
//    @Query("SELECT * FROM Favourites WHERE instruction_id =:instId")
//    Favourites searchFavourite(int instId);
//
//    @Query("DELETE FROM Favourites WHERE instruction_id=:instId")
//    void deleteFavourite(int instId);
//
//    @Update
//    void updateFavourite(Favourites favourites);
//
//    @Delete
//    void deleteFavourite(Favourites favourites);
//
//    /*
//     * FAQs CRUD
//     */
//
//    @Insert
//    Long insertFaq(Faqs faqs);
//
//
//    @Query("SELECT * FROM Faqs")
//    LiveData<List<Faqs>> fetchAllFaqs();
//
//
//    @Query("SELECT * FROM Faqs WHERE id =:faqId")
//    LiveData<Faqs> getFaq(int faqId);
//
//
//    @Update
//    void updateFaq(Faqs faqs);
//
//
//    @Delete
//    void deleteFaq(Faqs faqs);
}
