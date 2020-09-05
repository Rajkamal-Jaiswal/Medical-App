package com.example.aaramidecal;


import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddRecord extends AppCompatActivity {

    TextView txt_Date;
    ImageButton datePicker;
    DatePickerDialog datePickerDialog;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    RelativeLayout relRecordFor;
    ImageView addImg;

    public static final int GREQUEST_CODE=1;
    public static final int FREQUEST_CODE=2;
    private static final int CREQUEST_CODE=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);
        txt_Date=(TextView)findViewById(R.id.txt_date);
        datePicker=(ImageButton)findViewById(R.id.datePicker);
        relRecordFor=(RelativeLayout)findViewById(R.id.relRecordFor);
        addImg=(ImageView)findViewById(R.id.addImg);


        Intent intent=getIntent();
        String cameraVal=intent.getStringExtra("camera");
        String gallery=intent.getStringExtra("gallery");
        String pdf=intent.getStringExtra("pdf");
        if(cameraVal!=null){
            cameraUploadPic();
        }
        else if(gallery!=null){
            galleryUploadPic();
        }
        else if(pdf!=null){
            browseDocument();
        }
        else{
            Toast.makeText(this, "Choose the true option", Toast.LENGTH_SHORT).show();
        }


        relRecordFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPopupFamilyRecord();
            }
        });

        findViewById(R.id.imgBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        getCurrentDate();

        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDate();
            }
        });
    }

    private void cameraUploadPic() {
        Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent,CREQUEST_CODE);
    }

    private void galleryUploadPic() {
        Intent intent=new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.setType("image/*"); //
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent,GREQUEST_CODE);
    }

    private void browseDocument() {
        String[] mimeTypes =
                {"application/msword","application/vnd.openxmlformats-officedocument.wordprocessingml.document", // .doc & .docx
                        "application/vnd.ms-powerpoint","application/vnd.openxmlformats-officedocument.presentationml.presentation", // .ppt & .pptx
                        "application/vnd.ms-excel","application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", // .xls & .xlsx
                        "text/plain",
                        "image",
                        "application/pdf",
                        "application/zip"};
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            intent.setType(mimeTypes.length == 1 ? mimeTypes[0] : "*/*");
            if (mimeTypes.length > 0) {
                intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
            }
        } else {
            String mimeTypesStr = "";
            for (String mimeType : mimeTypes) {
                mimeTypesStr += mimeType + "|";
            }
            intent.setType(mimeTypesStr.substring(0,mimeTypesStr.length() - 1));
        }
        startActivityForResult(Intent.createChooser(intent,"ChooseFile"), FREQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==GREQUEST_CODE && resultCode== Activity.RESULT_OK){
            if(data!=null){
                Uri uri=data.getData();
                Glide.with(getApplicationContext()).load(uri).into(addImg);
            }
            else{
                onBackPressed();
            }
        }
        else if (requestCode==FREQUEST_CODE && resultCode==Activity.RESULT_OK){
            if(data!=null){
                Uri uri=data.getData();
                Toast.makeText(this, "File Uploaded"+uri, Toast.LENGTH_SHORT).show();
            }
            else {
                onBackPressed();
            }
        }
        else {
              if(requestCode==CREQUEST_CODE && resultCode==Activity.RESULT_OK) {
              Bitmap photo = (Bitmap) data.getExtras().get("data");
              addImg.setImageBitmap(photo);
              }
              else {
                  onBackPressed();
              }
        }
    }

    private void addPopupFamilyRecord() {

        AlertDialog.Builder mBuilder=new AlertDialog.Builder(this);
        View mView=getLayoutInflater().inflate(R.layout.popupof_addmedical_record,null);
        final EditText et_familyName=(EditText)mView.findViewById(R.id.et_familyMember);
        final TextView txt_familyName=(TextView)mView.findViewById(R.id.txt_familyMember);
        Button imgButton_addFamily=(Button)mView.findViewById(R.id.imgButton_addFamily);

        imgButton_addFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_familyName.getText().toString().trim().isEmpty()){
                    et_familyName.setError("Plz Enter Name");
                    et_familyName.requestFocus();
                    return;
                }
                else{
                    String familyMemberName=et_familyName.getText().toString().trim();
                    txt_familyName.setText(familyMemberName);
                    et_familyName.setText("");
                }
            }
        });
        mBuilder.setView(mView);
        AlertDialog dialog=mBuilder.create();
        dialog.show();
    }

    private void getCurrentDate() {

        SimpleDateFormat currentDate=new SimpleDateFormat("d MMMM, yyyy");
        Date todayDate=new Date();
        String thisDate=currentDate.format(todayDate);
        txt_Date.setText(thisDate);
    }

    private void setDate(){

        calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        dayOfMonth=calendar.get(Calendar.DAY_OF_MONTH);

        datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                txt_Date.setText(new StringBuilder().append(dayOfMonth).append("/").append(month+1).append("/").append(year));
                int month_k=month+1;
            }
        },year,month,dayOfMonth);

        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
    }




}
