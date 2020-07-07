package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class deathcer_apply extends AppCompatActivity {
    public Button death_apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deathcer_apply);
        death_apply = (Button) findViewById(R.id.death_apply);
        death_apply.setOnClickListener(new View.OnClickListener() {

            @Override
                    public void onClick(View view){

                Intent intent = new Intent(deathcer_apply.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}