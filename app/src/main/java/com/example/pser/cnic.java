package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cnic extends AppCompatActivity {
    public Button cnic_form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnic);
        cnic_form = (Button) findViewById(R.id.cnic_form);
        cnic_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(cnic.this, cnic_apply.class);
                startActivity(intent);
            }

        });
    }
}