package com.example.aaramidecal;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.aaramidecal.allactivities.LoginActivity;
import com.goodiebag.pinview.Pinview;

public class OtpReceive extends AppCompatActivity {

    Pinview pinview;
    ImageView gif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_receive);

        pinview=findViewById(R.id.pinview);

        gif=(ImageView)findViewById(R.id.gif);
        Glide.with(this).load(R.drawable.lock).into(gif);

        findViewById(R.id.btn_resetpassword).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        pinview.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean fromUser) {
                //Make api calls here or what not
                Toast.makeText(OtpReceive.this, pinview.getValue(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
