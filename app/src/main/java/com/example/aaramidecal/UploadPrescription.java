package com.example.aaramidecal;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class UploadPrescription extends AppCompatActivity {

    public static final int REQUEST_CODE=1;
    public static final int FREQUEST_CODE=2;
    private static final int REQ_CODE=3;
    ImageView imageView;
    TextView textView;
    ImageButton imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_prescription);
        imageView=(ImageView)findViewById(R.id.galleryImage);
        textView=(TextView)findViewById(R.id.textData);
        imgBack=(ImageButton)findViewById(R.id.imgBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent intent=getIntent();
        String camera=intent.getStringExtra("camera");
        String gallery=intent.getStringExtra("gallery");
        String pdf=intent.getStringExtra("pdf");
        if(camera!=null){
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

    }

    private void cameraUploadPic()
    {
        //Camera
        Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent,REQ_CODE);
    }

    private void galleryUploadPic()
    {
        Intent intent=new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.setType("image/*"); //
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent,REQUEST_CODE);
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

        if (requestCode==REQUEST_CODE && resultCode==Activity.RESULT_OK){
            if(data!=null){
                Uri uri=data.getData();
                Glide.with(getApplicationContext()).load(uri).into(imageView);
            }
            else {
                onBackPressed();
            }
        }
        else if (requestCode==FREQUEST_CODE && resultCode==Activity.RESULT_OK){
            if(data!=null){
                    Uri uri=data.getData();
                    Toast.makeText(this, "File Uploaded"+uri, Toast.LENGTH_SHORT).show();
            }
            else{
                onBackPressed();
            }
        }
        else {
            if(requestCode==REQ_CODE && resultCode==Activity.RESULT_OK){
                Bitmap photo=(Bitmap)data.getExtras().get("data");
                imageView.setImageBitmap(photo);
            }
            else {
                onBackPressed();
            }
        }
    }
}
