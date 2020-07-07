package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class domicl_cer extends AppCompatActivity {
    public Button domicile_form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domicl_cer);
        domicile_form = (Button) findViewById(R.id.domicile_form);
        domicile_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(domicl_cer.this, domicile_apply.class);
                startActivity(intent);
            }

        });
    }
}