package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

import com.example.pser.RoomDB.Model.User;
import com.example.pser.RoomDB.Repository.UserRepository;

public class RegistrationForm extends AppCompatActivity {
    public Button button;

    public EditText first_name, last_name, email, contact, cnic, password, conform_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        first_name = (EditText) findViewById(R.id.first_name);
        last_name = (EditText) findViewById(R.id.last_name);
        email = (EditText) findViewById(R.id.reg_email);
        contact = (EditText) findViewById(R.id.reg_contact);
        cnic = (EditText) findViewById(R.id.cnic);
        password = (EditText) findViewById(R.id.reg_password);
        conform_password = (EditText) findViewById(R.id.reg_conpassword);
        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setEmail(email.getText().toString());
                user.setPassword(password.getText().toString());
                user.setFirst_name(first_name.getText().toString());
                user.setLast_name(last_name.getText().toString());
                user.setContact(contact.getText().toString());
                user.setConform_password(conform_password.getText().toString());
                user.setCnic(cnic.getText().toString());
                UserRepository repository = new UserRepository(RegistrationForm.this);
                repository.insertTask(user);

                Intent intent = new Intent(RegistrationForm.this, LoginForm.class);
                startActivity(intent);
            }
        });
    }
}