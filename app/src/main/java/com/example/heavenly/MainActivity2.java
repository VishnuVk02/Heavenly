package com.example.heavenly;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    ImageButton hyderabadbt , mumbaibt , bangalorebt;
    TextView tv1,tv2,tv3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageButton chennaibt = findViewById(R.id.chennaiCity);
        hyderabadbt = findViewById(R.id.hyderabadCity);
        mumbaibt = findViewById(R.id.mumbaiCity);
        bangalorebt = findViewById(R.id.bangaloreCity);

        chennaibt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity2.this , chennai_page.class);
                startActivity(intent);
            }
        });

        hyderabadbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, hyderabad_page.class);
                startActivity(i);
            }
        });

        bangalorebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, bangalore_page.class);
                startActivity(i);
            }
        });

        mumbaibt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this , mumbai_page.class);
                startActivity(i);
            }
        });

        tv1 = findViewById(R.id.txtr1);
        tv1.setPaintFlags(tv1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        tv2 = findViewById(R.id.txtr2);
        tv2.setPaintFlags(tv2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        tv3 = findViewById(R.id.txtr3);
        tv3.setPaintFlags(tv3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }

    public void shriram(View view) {
        Intent i =new Intent(MainActivity2.this , shriram_resort.class);
        startActivity(i);
    }
}