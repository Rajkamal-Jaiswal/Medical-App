package com.example.aaramidecal;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PatientDetails extends AppCompatActivity {

    TextView dateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);
        dateTime=(TextView)findViewById(R.id.dateTime);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

//        Intent i=getIntent();
//        String time=i.getStringExtra("time");
//        String date=i.getStringExtra("date");
//        dateTime.setText(date+"2020 ,"+time);
    }
}
