package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import com.example.aaramidecal.Adapter.DoctorProfileAdaptor;
import com.example.aaramidecal.Models.DoctorProfileItem;

import java.util.ArrayList;

public class ListofDoctorsProfile extends AppCompatActivity {

    GridView gridView;
    ArrayList<DoctorProfileItem> items;
    DoctorProfileAdaptor doctorListAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_doctors_profile);

        findViewById(R.id.imgBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        linearList();

        gridView=findViewById(R.id.grid_list);
        linearList();
        doctorListAdaptor=new DoctorProfileAdaptor(this,items);
        gridView.setAdapter(doctorListAdaptor);


//        findViewById(R.id.btn_consulting).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ListofDoctorsProfile.this,ConsultWithDoctor.class);
//                startActivity(intent);
//            }
//        });
//
//        findViewById(R.id.btn_bookappoint).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ListofDoctorsProfile.this,BookAppointmntActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    private void linearList(){

        items=new ArrayList<DoctorProfileItem>();
        items.add(new DoctorProfileItem("color/48/000000/pregnant.png","Women's Health"));
        items.add(new DoctorProfileItem("color/48/000000/user-male-skin-type-1-2.png","Skin & Hair"));
        items.add(new DoctorProfileItem("emoji/48/000000/child-medium-skin-tone.png","Child Specialist"));
        items.add(new DoctorProfileItem("color/48/000000/doctors-bag.png","General Physician"));
        items.add(new DoctorProfileItem("color/48/000000/dental-braces.png","Dental Care"));
        items.add(new DoctorProfileItem("color/48/000000/throat.png","Ear Nose Throat"));
        items.add(new DoctorProfileItem("color/48/000000/mortar-and-pestle.png","Homeopathy"));
        items.add(new DoctorProfileItem("ios/100/000000/knee-joint.png","Bones and Joint"));
        items.add(new DoctorProfileItem("color/50/000000/doctor-female.png","Sex Specialist"));
        items.add(new DoctorProfileItem("dusk/48/000000/visible.png","Eye Specialist"));
        items.add(new DoctorProfileItem("officel/16/000000/stomach.png","Digestive Issues"));
        items.add(new DoctorProfileItem("dusk/64/000000/mental-health.png","Mental Wellness"));
        items.add(new DoctorProfileItem("officel/16/000000/physical-therapy.png","Physiotherapy"));
        items.add(new DoctorProfileItem("dusk/64/000000/diabetes.png","Diabetes Management"));
        items.add(new DoctorProfileItem("doodle/64/000000/smart-.png","Brain and nervous"));
        items.add(new DoctorProfileItem("wired/48/000000/test-tube.png","Urinary Issues"));
        items.add(new DoctorProfileItem("officel/64/000000/kidney.png","Kidney Issues"));
        items.add(new DoctorProfileItem("cotton/64/000000/herbal-medicine.png","Ayurveda"));
        items.add(new DoctorProfileItem("flat_round/64/000000/protection-mask.png","General Surgery"));
        items.add(new DoctorProfileItem("officel/64/000000/lungs.png","Lungs and Breathing"));
        items.add(new DoctorProfileItem("officel/16/000000/hearts.png","Heart"));
        items.add(new DoctorProfileItem("color/48/000000/cancer-ribbon.png","Cancer"));



    }
}
