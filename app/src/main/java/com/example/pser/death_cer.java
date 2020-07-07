package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class death_cer extends AppCompatActivity {
    public Button death_form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death_cer);
        death_form = (Button) findViewById(R.id.dth_form);
        death_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(death_cer.this, deathcer_apply.class);
                startActivity(intent);
            }

        });
    }
}