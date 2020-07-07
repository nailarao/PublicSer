package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class marriage_cer extends AppCompatActivity {
    public Button marriage_form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage_cer);
        marriage_form = (Button) findViewById(R.id.marriage_form);
        marriage_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(marriage_cer.this, marriagecer_apply.class);
                startActivity(intent);
            }

        });
    }
}