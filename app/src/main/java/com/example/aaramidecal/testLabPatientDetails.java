package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class testLabPatientDetails extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_test_lab_patient_details);

    findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        onBackPressed();
      }
    });

    findViewById(R.id.imgBtn_edit).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent=new Intent(getApplicationContext(),testLabPatientDetail.class);
        startActivity(intent);
      }
    });

    findViewById(R.id.btn_proceed).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        timeSlotBottomSheet bottomSheet=new timeSlotBottomSheet();
        bottomSheet.show(getSupportFragmentManager(),"timeSlotBottomSheet");

      }
    });
  }
}