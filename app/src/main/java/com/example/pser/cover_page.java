package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.time.Instant;

public class cover_page extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_page);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(cover_page.this, LoginForm.class);
                startActivity(intent);
            }

        },SPLASH_TIME_OUT);
    }
}