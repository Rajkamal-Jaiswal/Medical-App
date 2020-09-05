package com.example.aaramidecal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookAppointmntActivity extends AppCompatActivity {


    Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointmnt);
        btn_next=(Button)findViewById(R.id.btn_next);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BookAppointmntActivity.this,DetailsOfAppointment.class);
                startActivity(intent);
            }
        });




        findViewById(R.id.btn_sympton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applySymptom();
            }
        });
    }

    private void applySymptom() {
        AlertDialog.Builder mBuilder=new AlertDialog.Builder(this);
        View view=getLayoutInflater().inflate(R.layout.symptomconsultlay,null);
        final EditText et_symptom=(EditText)view.findViewById(R.id.et_disease);
        Button btn_submit=(Button)view.findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_symptom.getText().toString().trim().isEmpty()){
                    et_symptom.setError("Plz enter about your disease");
                    et_symptom.requestFocus();
                    return;
                }
                else{
                    String disease=et_symptom.getText().toString().trim();
                    et_symptom.setText("");
                    btn_next.setVisibility(View.VISIBLE);

                }
            }
        });
        mBuilder.setView(view);
        AlertDialog alertDialog=mBuilder.create();
        alertDialog.show();
    }


}
