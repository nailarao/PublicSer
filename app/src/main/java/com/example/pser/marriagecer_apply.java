package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class marriagecer_apply extends AppCompatActivity {
    public Button marriage_apply;
    public EditText husband_full_name,wife_full_name,husband_cnic,wife_cnic,email,contact, city, district;
    private Object marriageCerDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriagecer_apply);

        husband_full_name = (EditText) findViewById(R.id.husband_full_name);
        wife_full_name = (EditText) findViewById(R.id.wife_full_name);
        husband_cnic = (EditText) findViewById(R.id.husband_cnic);
        wife_cnic = (EditText) findViewById(R.id.wife_cnic);
        email = (EditText) findViewById(R.id.email);
        contact = (EditText) findViewById(R.id.contact);
        city = (EditText) findViewById(R.id.city);
        district = (EditText) findViewById(R.id.district);



        marriage_apply = (Button) findViewById(R.id.marriage_apply);
        marriage_apply.setOnClickListener(new View.OnClickListener() {
            

            @Override
            public void onClick(View v) {

//                marriageCerDB marriage = new marriageCerDB(husband_full_name.getText().toString(), wife_full_name.getText().toString(),
//                        husband_cnic.getText().toString() , wife_cnic.getText().toString(),
//                        email.getText().toString() , contact.getText().toString(),
//                        city.getText().toString() , district.getText().toString());
//
//                MyDatabase myDatabase = Room.databaseBuilder(marriagecer_apply.this, MyDatabase.class,"marriageDB")
//                        .allowMainThreadQueries().build();


                Intent intent = new Intent(marriagecer_apply.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}