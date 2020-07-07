package com.example.pser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          ImageView butt1 = (ImageView) findViewById(R.id.imageView2);
          ImageView butt2 = (ImageView) findViewById(R.id.imageView3);
          ImageView butt3 = (ImageView) findViewById(R.id.imageView4);
          ImageView butt4 = (ImageView) findViewById(R.id.imageView5);
          ImageView butt5 = (ImageView) findViewById(R.id.imageView6);
          ImageView butt6 = (ImageView) findViewById(R.id.imageView7);
          ImageView butt7 = (ImageView) findViewById(R.id.imageView8);
          ImageView butt8 = (ImageView) findViewById(R.id.imageView9);
          ImageView butt9 = (ImageView) findViewById(R.id.imageView10);
          ImageView butt10 = (ImageView) findViewById(R.id.imageView11);
          ImageView butt11 = (ImageView) findViewById(R.id.imageView12);
          ImageView butt12 = (ImageView) findViewById(R.id.imageView13);
          ImageView butt13 = (ImageView) findViewById(R.id.imageView14);
          ImageView butt14 = (ImageView) findViewById(R.id.imageView15);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, cnic.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(MainActivity.this, domicl_cer.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(MainActivity.this, birth_cer.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Intent int4 = new Intent(MainActivity.this, death_cer.class);
                startActivity(int4);
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(MainActivity.this, marriage_cer.class);
                startActivity(int5);
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(MainActivity.this, divorce_cer.class);
                startActivity(int6);
            }
        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7 = new Intent(MainActivity.this, police.class);
                startActivity(int7);
            }
        });
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8 = new Intent(MainActivity.this, chartr_cer.class);
                startActivity(int8);
            }
        });
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9 = new Intent(MainActivity.this, driving_licence.class);
                startActivity(int9);
            }
        });
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10 = new Intent(MainActivity.this, vehicle_registration.class);
                startActivity(int10);
            }
        });
        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(MainActivity.this, vehicle_ownership.class);
                startActivity(int11);
            }
        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12 = new Intent(MainActivity.this, tokentax.class);
                startActivity(int12);
            }
        });
        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int13 = new Intent(MainActivity.this, trafficfine.class);
                startActivity(int13);
            }
        });
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int14 = new Intent(MainActivity.this, utility_ser.class);
                startActivity(int14);
            }
        });

    }
    }
