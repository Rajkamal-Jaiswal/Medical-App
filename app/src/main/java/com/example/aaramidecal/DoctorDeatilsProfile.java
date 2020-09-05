package com.example.aaramidecal;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aaramidecal.Adapter.DoctorsDetailsProfileAdaptor;
import com.example.aaramidecal.Models.DoctorsDetailsProfileModel;

import java.util.ArrayList;

public class DoctorDeatilsProfile extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<DoctorsDetailsProfileModel> profileModels;
    DoctorsDetailsProfileAdaptor adaptor;

    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_deatils_profile);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        recyclerView=findViewById(R.id.rec_doctorsList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        setData();

        adaptor=new DoctorsDetailsProfileAdaptor(this,profileModels);
        recyclerView.setAdapter(adaptor);




//        findViewById(R.id.book_Appointment).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(DoctorDeatilsProfile.this,BookAppointmntActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        findViewById(R.id.consult_doc).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(DoctorDeatilsProfile.this,ConsultWithDoctor.class);
//                startActivity(intent);
//            }
//        });
    }

    private void setData() {

        profileModels=new ArrayList<>();

        profileModels.add(new DoctorsDetailsProfileModel(R.drawable.smartdoc,"Dr. Sudhir Chopara","Cardiologist","8 Years Overall","MBBS, MD-Medicine, Diploma in Cardiology","Consultant Physician, Cardiologist","Aliganj:- Arihant Clinic ~ 3.7 km ","400.00"));
        profileModels.add(new DoctorsDetailsProfileModel(R.drawable.smartdoc,"Dr. Sudhir Chopara","Cardiologist","8 Years Overall","MBBS, MD-Medicine, Diploma in Cardiology","Consultant Physician, Cardiologist","Aliganj:- Arihant Clinic ~ 3.7 km ","400.00"));
        profileModels.add(new DoctorsDetailsProfileModel(R.drawable.smartdoc,"Dr. Sudhir Chopara","Cardiologist","8 Years Overall","MBBS, MD-Medicine, Diploma in Cardiology","Consultant Physician, Cardiologist","Aliganj:- Arihant Clinic ~ 3.7 km ","400.00"));
        profileModels.add(new DoctorsDetailsProfileModel(R.drawable.smartdoc,"Dr. Sudhir Chopara","Cardiologist","8 Years Overall","MBBS, MD-Medicine, Diploma in Cardiology","Consultant Physician, Cardiologist","Aliganj:- Arihant Clinic ~ 3.7 km ","400.00"));
        profileModels.add(new DoctorsDetailsProfileModel(R.drawable.smartdoc,"Dr. Sudhir Chopara","Cardiologist","8 Years Overall","MBBS, MD-Medicine, Diploma in Cardiology","Consultant Physician, Cardiologist","Aliganj:- Arihant Clinic ~ 3.7 km ","400.00"));
    }
}
