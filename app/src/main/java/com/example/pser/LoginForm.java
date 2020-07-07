package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.room.Room;

import android.util.Log;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pser.RoomDB.Model.User;
import com.example.pser.RoomDB.Repository.UserRepository;

import java.util.List;

public class LoginForm extends AppCompatActivity {
    public Button login, registration;
    private EditText textEmail;
    private EditText textPassword;

    public EditText text_user_email, text_user_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        text_user_email = (EditText) findViewById(R.id.text_email);
        text_user_password = (EditText) findViewById(R.id.text_password);
        login = (Button) findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                User User = new User(text_user_email.getText().toString() , text_user_password.getText().toString());

                UserRepository repository = new UserRepository(LoginForm.this);
                repository.searchUser(text_user_email.getText().toString(), text_user_password.getText().toString()).observe(LoginForm.this, new Observer<User>() {
                    @Override
                    public void onChanged(User user) {
                        if (user == null) {
                            Log.e("test", "user not register or invalid credentials");
                            Toast.makeText(LoginForm.this, "Invalid user Email and Password", Toast.LENGTH_SHORT).show();

                        } else {
                            Log.e("test", "user register and credentials matched");
                            Intent int1 = new Intent(LoginForm.this, MainActivity.class);
                            startActivity(int1);
                        }
                    }
                });


            }
        });
        registration = (Button) findViewById(R.id.registration_button);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(LoginForm.this, RegistrationForm.class);
                startActivity(int2);
            }

        });


//        Validation of Email and Password***********


//        textEmail = findViewById(R.id.text_email);
//
//        textPassword = findViewById(R.id.text_password);
//    }
//    public static boolean isValidEmailAddress(String email) {
//        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
//        return email.matches(emailPattern);
//    }
//
//    private boolean valideteEmail() {
//        String emailInput = textEmail.getText().toString().trim();
//
//        if (emailInput.isEmpty()) {
//            textEmail.setError("Field can't be empty");
//            return false;
//        } else if (!isValidEmailAddress(emailInput)) {
//            textEmail.setError("Please enter a valid email address");
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    private boolean validetePassword() {
//        String emailInput = textPassword.getText().toString().trim();
//
//        if (emailInput.isEmpty()) {
//            textPassword.setError("Field can't be empty");
//            return false;
//        } else {
//            textPassword.setError(null);
//            return true;
//        }
//
//    }

    }
}