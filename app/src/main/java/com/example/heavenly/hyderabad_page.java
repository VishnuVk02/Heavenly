package com.example.heavenly;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hyderabad_page extends AppCompatActivity {
//    Button back;

    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad_page);

        tv1 = findViewById(R.id.txtr1);
        tv1.setPaintFlags(tv1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        tv2 = findViewById(R.id.txtr2);
        tv2.setPaintFlags(tv2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        tv3 = findViewById(R.id.txtr3);
        tv3.setPaintFlags(tv3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        tv4 = findViewById(R.id.txtr4);
        tv4.setPaintFlags(tv4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

    }

    public void grand_view(View view) {
        Intent i =new Intent(hyderabad_page.this, grand_view.class);
        startActivity(i);
    }


    public void anandhan(View view) {
        Intent i =new Intent(hyderabad_page.this, anandhan.class);
        startActivity(i);
    }

    public void peascon(View view) {
        Intent i =new Intent(hyderabad_page.this, peascon.class);
        startActivity(i);
    }

    public void shihaabi(View view) {
        Intent i =new Intent(hyderabad_page.this, shihaabi.class);
        startActivity(i);
    }
}