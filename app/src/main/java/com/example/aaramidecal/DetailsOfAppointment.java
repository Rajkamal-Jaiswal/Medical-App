package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aaramidecal.slotfragments.FirstFragment;
import com.example.aaramidecal.slotfragments.FragmentTwo;

public class DetailsOfAppointment extends AppCompatActivity implements View.OnClickListener {

    CardView card1,card2,card3,card4;
    TextView show_date,date,date1,date2,date4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_appointment);
        card1=(CardView)findViewById(R.id.card1);
        card2=(CardView)findViewById(R.id.card2);
        card3=(CardView)findViewById(R.id.card3);
        card4=(CardView)findViewById(R.id.card4);

        show_date=(TextView)findViewById(R.id.show_date);
        date=(TextView)findViewById(R.id.date);
        date1=(TextView)findViewById(R.id.date1);
        date2=(TextView)findViewById(R.id.date2);
        date4=(TextView)findViewById(R.id.date4);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=manager.beginTransaction();
        String cdate;
        cdate=date.getText().toString();
        show_date.setText(cdate);
        FirstFragment firstFragment=new FirstFragment();
        fragmentTransaction.replace(R.id.frame_layout,firstFragment);
        fragmentTransaction.commit();

    }

    @Override
    public void onClick(View v) {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=manager.beginTransaction();
        String cdate;
        switch (v.getId()){
            case R.id.card1:
                //Toast.makeText(this, "Hii,card1", Toast.LENGTH_SHORT).show();
                cdate=date.getText().toString();
                show_date.setText(cdate);
                FirstFragment firstFragment=new FirstFragment();
                fragmentTransaction.replace(R.id.frame_layout,firstFragment);
                fragmentTransaction.commit();
                break;
            case R.id.card2:
                //Toast.makeText(this, "Hii,card2", Toast.LENGTH_SHORT).show();
                cdate=date1.getText().toString();
                show_date.setText(cdate);
                FragmentTwo fragmentTwo=new FragmentTwo();
                fragmentTransaction.replace(R.id.frame_layout,fragmentTwo);
                fragmentTransaction.commit();
                break;
            case R.id.card3:
                cdate=date2.getText().toString();
                show_date.setText(cdate);
                FragmentTwo ft=new FragmentTwo();
                fragmentTransaction.replace(R.id.frame_layout,ft);
                fragmentTransaction.commit();
                break;
            case R.id.card4:
                cdate=date4.getText().toString();
                show_date.setText(cdate);
                FragmentTwo ft1=new FragmentTwo();
                fragmentTransaction.replace(R.id.frame_layout,ft1);
                fragmentTransaction.commit();
                break;

        }
    }

    public void next_ability(View view){
        String cdate=date1.getText().toString();
        show_date.setText(cdate);
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=manager.beginTransaction();
        FragmentTwo ft2=new FragmentTwo();
        fragmentTransaction.replace(R.id.frame_layout,ft2);
        fragmentTransaction.commit();

    }
}
