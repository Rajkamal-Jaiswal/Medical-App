package com.example.aaramidecal.allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aaramidecal.R;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=(ImageView)findViewById(R.id.logo);
        textView=(TextView)findViewById(R.id.medical);
        Animation top= AnimationUtils.loadAnimation(this,R.anim.blink);
        Animation bottom=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        logo.setAnimation(top);
        textView.setAnimation(bottom);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
