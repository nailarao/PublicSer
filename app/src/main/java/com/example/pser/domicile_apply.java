package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class domicile_apply extends AppCompatActivity {
    public Button domicile_apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domicile_apply);
        domicile_apply = (Button) findViewById(R.id.domicile_apply);
        domicile_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(domicile_apply.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}