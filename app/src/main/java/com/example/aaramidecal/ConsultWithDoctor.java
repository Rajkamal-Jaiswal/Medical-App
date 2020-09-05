package com.example.aaramidecal;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ConsultWithDoctor extends AppCompatActivity {


    Button video_call,chat;
    public static final int REQUEST_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult_with_doctor);
        video_call=(Button)findViewById(R.id.video_call);
        chat=(Button)findViewById(R.id.chat);


        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        findViewById(R.id.video_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(ConsultWithDoctor.this,PaymentSummery.class);
//                startActivity(intent);

                //Camera Code
                Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent,REQUEST_CODE);

            }
        });
        findViewById(R.id.chat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ConsultWithDoctor.this,PaymentSummery.class);
                intent.putExtra("chat","chat");
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
                    video_call.setVisibility(View.VISIBLE);
                    chat.setVisibility(View.VISIBLE);
                }
            }
        });
        mBuilder.setView(view);
        AlertDialog alertDialog=mBuilder.create();
        alertDialog.show();
    }


}

