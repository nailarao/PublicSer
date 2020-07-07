package com.example.pser.RoomDB.Model;

import android.provider.ContactsContract;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "first_name")
    private String first_name;
    @ColumnInfo(name = "last_name")
    String last_name;
    @ColumnInfo(name = "email")
    String email;
    @ColumnInfo(name = "contact")
    String contact;
    @ColumnInfo(name = "cnic")
    String cnic;
    @ColumnInfo(name = "password")
    String password;
    @ColumnInfo(name = "conform_password")
    String conform_password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConform_password() {
        return conform_password;
    }

    public void setConform_password(String conform_password) {
        this.conform_password = conform_password;
    }
}

