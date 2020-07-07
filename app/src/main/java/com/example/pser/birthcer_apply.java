package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class birthcer_apply extends AppCompatActivity {
    public Button birth_apply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthcer_apply);
        birth_apply = (Button) findViewById(R.id.birth_apply);
        birth_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(birthcer_apply.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}