package com.example.aaramidecal.Profile;





import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aaramidecal.Adapter.MyTabAdaptor;
import com.example.aaramidecal.R;
import com.example.aaramidecal.myactivities.UserPanelActivity;
import com.google.android.material.tabs.TabLayout;

public class ProfileActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @java.lang.Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

//        tabLayout=findViewById(R.id.tabLayout);
//        viewPager=findViewById(R.id.viewPager);

//        MyTabAdaptor adaptor=new MyTabAdaptor(getSupportFragmentManager());
//
//        adaptor.add(new PersonalFragment(),"Personal");
//        adaptor.add(new MedicalFragment(),"Medical");
//        adaptor.add(new LifestyleFragment(),"Lifestyle");
//
//        viewPager.setAdapter(adaptor);
//        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(), UserPanelActivity.class);
        startActivity(intent);
        finish();

    }
}