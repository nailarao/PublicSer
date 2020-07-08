package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.pser.RoomDB.Model.CnicTable;
import com.example.pser.RoomDB.Model.User;
import com.example.pser.RoomDB.Repository.CnicRepository;
import com.example.pser.RoomDB.Repository.UserRepository;
import com.google.gson.Gson;

public class cnic_apply extends AppCompatActivity {
    public Button cnic_apply;
    EditText guardianName,fullName,guardianCnic,email,contact,city,district;
    RadioButton male,female;
    String str_gender = "male";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnic_apply);
        guardianName = (EditText) findViewById(R.id.cnic_apply_guardainName);
        fullName = (EditText) findViewById(R.id.cnic_apply_fullName);
        guardianCnic = (EditText) findViewById(R.id.cnic_apply_cnic);
        email = (EditText) findViewById(R.id.cnic_apply_email);
        contact = (EditText) findViewById(R.id.cnic_apply_contactNumber);
        city = (EditText) findViewById(R.id.cnic_apply_cityName);
        district = (EditText) findViewById(R.id.cnic_apply_distric_name);
        male = (RadioButton) findViewById(R.id.cnic_apply_gender_radio);
        female = (RadioButton) findViewById(R.id.cnic_apply_gender_radio_f);
        cnic_apply = (Button) findViewById(R.id.cnic_apply);
        male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    str_gender = "male";
                }else {
                    str_gender = "female";
                }
            }
        });
        female.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    str_gender = "female";
                }else {
                    str_gender = "male";
                }
            }
        });
        cnic_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = getSharedPreferences("App", MODE_PRIVATE).getString("user","");
                CnicRepository repository = new CnicRepository(cnic_apply.this);
                CnicTable cnicTable = new CnicTable();
                cnicTable.setFull_name(fullName.getText().toString());
                cnicTable.setGuardian_name(guardianName.getText().toString());
                cnicTable.setGuardian_cnic(guardianCnic.getText().toString());
                cnicTable.setEmail(email.getText().toString());
                cnicTable.setContact(contact.getText().toString());
                cnicTable.setCity(city.getText().toString());
                cnicTable.setDistrict(district.getText().toString());
                cnicTable.setGender(str_gender);
                cnicTable.setUserd_id(userId);
                repository.insertTask(cnicTable);
                Intent intent = new Intent(cnic_apply.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}