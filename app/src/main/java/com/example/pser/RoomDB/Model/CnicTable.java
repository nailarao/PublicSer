package com.example.pser.RoomDB.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CnicTable {

    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "user_id")
    private String userd_id;
    @ColumnInfo(name = "full_name")
    private String full_name;
    @ColumnInfo(name = "guardian_name")
    String guardian_name;
    @ColumnInfo(name = "guardian_cnic")
    String guardian_cnic;
    @ColumnInfo(name = "contact")
    String contact;
    @ColumnInfo(name = "email")
    String email;
    @ColumnInfo(name = "city")
    String city;
    @ColumnInfo(name = "district")
    String district;
    @ColumnInfo(name = "gender")
    String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserd_id() {
        return userd_id;
    }

    public void setUserd_id(String userd_id) {
        this.userd_id = userd_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getGuardian_name() {
        return guardian_name;
    }

    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }

    public String getGuardian_cnic() {
        return guardian_cnic;
    }

    public void setGuardian_cnic(String guardian_cnic) {
        this.guardian_cnic = guardian_cnic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
