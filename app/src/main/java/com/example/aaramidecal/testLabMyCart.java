package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class testLabMyCart extends AppCompatActivity {

    TextView disPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lab_my_cart);

        disPrice=(TextView)findViewById(R.id.disPrice);
        disPrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        findViewById(R.id.payContinue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),testLabPatientDetail.class);
                startActivity(intent);
            }
        });
    }
}