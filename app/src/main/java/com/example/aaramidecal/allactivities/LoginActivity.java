package com.example.aaramidecal.allactivities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.aaramidecal.NavigationDrawer;
import com.example.aaramidecal.OtpReceive;
import com.example.aaramidecal.R;
import com.example.aaramidecal.myactivities.UserPanelActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_login);

        Button buttonLogin=(Button) findViewById(R.id.arrowlogin);

        findViewById(R.id.register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, RegistrationPage.class);
                startActivity(intent);
                finish();
            }
        });



        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, UserPanelActivity.class);
                startActivity(intent);


            }
        });


        //Forgot Password_code
        findViewById(R.id.forgotpass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyDialog();
            }
        });
    }

    private void applyDialog()
    {
        AlertDialog.Builder mBuilder=new AlertDialog.Builder(this);
        View mView=getLayoutInflater().inflate(R.layout.mobileotpdialoglay,null);
        final EditText mobileNum=(EditText)mView.findViewById(R.id.et_mobileNum);
        ImageButton clear=mView.findViewById(R.id.clear);
        Button sendOtp=(Button)mView.findViewById(R.id.sendOtp);
        sendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mobileNum.getText().toString().trim().isEmpty()){
                    mobileNum.setError("Empty");
                    mobileNum.requestFocus();
                    return;
                }
                else{

                    Intent intent=new Intent(LoginActivity.this, OtpReceive.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
        mBuilder.setCancelable(false);
        mBuilder.setView(mView);
        final AlertDialog alertDialog=mBuilder.create();
        alertDialog.show();
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
//        alertDialog.setCancelable(false);
    }

}
