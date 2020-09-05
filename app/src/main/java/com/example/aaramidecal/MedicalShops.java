package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;

import java.util.ArrayList;


public class MedicalShops extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MedicalItemAdaptor itemAdaptor;
    ArrayList<MedicalItemList> itemLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_shops);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



        setLinearView();
        itemAdaptor=new MedicalItemAdaptor(this,itemLists);
        recyclerView.setAdapter(itemAdaptor);




    }

    private void setLinearView() {

        itemLists=new ArrayList<MedicalItemList>();
        itemLists.add(new MedicalItemList(R.drawable.probiotic,"Crocin Advance 500mg Tablet 15's","Glaxo Smithkline(Consumer HC)","14.22","Add To Cart"));
        itemLists.add(new MedicalItemList(R.drawable.medicineraj,"Ecosprin 150mg Tablet 14's","Usv Limited(Condor)","08.22","Add To Cart"));
        itemLists.add(new MedicalItemList(R.drawable.drugs,"Asthalin Inhaler 200md","Cipia limited Respirotary","150.22","Add To Cart"));
        itemLists.add(new MedicalItemList(R.drawable.probiotic,"Crocin Advance 500mg Tablet 15's","Glaxo Smithkline(Consumer HC)","14.22","Add To Cart"));
        itemLists.add(new MedicalItemList(R.drawable.medicineraj,"Ecosprin 150mg Tablet 14's","Usv Limited(Condor)","08.22","Add To Cart"));
        itemLists.add(new MedicalItemList(R.drawable.drugs,"Asthalin Inhaler 200md","Cipia limited Respirotary","150.22","Add To Cart"));
    }
}
