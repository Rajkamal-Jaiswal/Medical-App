package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.example.aaramidecal.Adapter.testLabItemAdaptor;
import com.example.aaramidecal.Models.testLabItem;

import java.util.ArrayList;

public class TestLabs extends AppCompatActivity {

//    GridView gridView;
//    com.example.aaramidecal.Adapter.testLabItemAdaptor testLabItemAdaptor;
//    ArrayList<testLabItem> labItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_labs);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

//        gridView=(GridView)findViewById(R.id.healthCheckupGridViewList);



//        testLabItemAdaptor=new testLabItemAdaptor(getApplicationContext(),labItems);
//        gridView.setAdapter(testLabItemAdaptor);


        findViewById(R.id.cardMale1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), testLabOffer.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cardFeMale1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), testLabOffer.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cardMale2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), testLabOffer.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.cardFeMales1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), testLabOffer.class);
                startActivity(intent);
            }
        });




        findViewById(R.id.cardStd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),testLabOffer.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.cardStd1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),testLabOffer.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.cardManipal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),testLabOffer.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.cardManipal1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),testLabOffer.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.cardThyride).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),testLabOffer.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.cardThyride1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),testLabOffer.class);
                startActivity(intent);

            }
        });
    }

//    private void setGridView() {
//
//        labItems=new ArrayList<testLabItem>();
//
//        labItems.add(new testLabItem("Below 40","Male",R.drawable.handsome));
//        labItems.add(new testLabItem("Below 40","Female",R.drawable.joggingwomen));
//        labItems.add(new testLabItem("Above 40","Male",R.drawable.maninoffice));
//        labItems.add(new testLabItem("Above 40","Female",R.drawable.parklady));
//
//    }
}
