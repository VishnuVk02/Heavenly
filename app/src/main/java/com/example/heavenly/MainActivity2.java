package com.example.heavenly;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Paint;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageButton hyderabadbt , mumbaibt , bangalorebt;
    TextView strike;

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




    }
}