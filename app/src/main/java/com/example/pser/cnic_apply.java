package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cnic_apply extends AppCompatActivity {
    public Button cnic_apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnic_apply);
        cnic_apply = (Button) findViewById(R.id.cnic_apply);
        cnic_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(cnic_apply.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}