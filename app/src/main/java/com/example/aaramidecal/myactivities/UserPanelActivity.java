package com.example.aaramidecal.myactivities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.aaramidecal.Profile.ProfileActivity;
import com.example.aaramidecal.R;
import com.example.aaramidecal.allactivities.LoginActivity;
import com.example.aaramidecal.ui.all_fragments.ConsultatWithDoctorFragment;
import com.example.aaramidecal.ui.all_fragments.HomeFragment;
import com.example.aaramidecal.ui.all_fragments.MedicalRecordFragment;
import com.example.aaramidecal.ui.all_fragments.MyDoctorsFragment;
import com.example.aaramidecal.ui.all_fragments.OrdersFragment;
import com.example.aaramidecal.ui.all_fragments.PaymentHealthFragment;
import com.example.aaramidecal.ui.all_fragments.RemindersFragment;
import com.example.aaramidecal.ui.all_fragments.Upcoming_Appointment_Fragment;
import com.example.aaramidecal.ui.testbooking.TestBookingFragment;
import com.google.android.material.navigation.NavigationView;

public class UserPanelActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawer;
    CardView home,appointments,testbooking,orders,consultations,
            mydoctors,medicalrecords,reminders,payment,logout;
    FrameLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_panel);

        home = findViewById(R.id.home);
        appointments = findViewById(R.id.appointment);
        testbooking = findViewById(R.id.testbooking);
        orders = findViewById(R.id.orders);
        consultations = findViewById(R.id.consultations);
        mydoctors = findViewById(R.id.mydoctors);
        medicalrecords = findViewById(R.id.medicalrecords);
        reminders = findViewById(R.id.reminders);
        logout = findViewById(R.id.logout);
        payment = findViewById(R.id.payment);
        container=findViewById(R.id.container);


        Toolbar myToolBar = (Toolbar) findViewById(R.id.toolbar);
        if (myToolBar != null) {
            setSupportActionBar(myToolBar);
//            getSupportActionBar().setLogo(R.drawable.lg1);
            // myToolBar.setTitle("Dashboard");
            // requestWindowFeature(Window.FEATURE_NO_TITLE);
            myToolBar.hideOverflowMenu();
        }
        //For drawer
        navigationView = findViewById(R.id.navigation_view);
        drawer = findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, myToolBar, R.string.open, R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = findViewById(R.id.navigation_view);
        myToolBar.setNavigationIcon(R.drawable.menu);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,new HomeFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new HomeFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        appointments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new Upcoming_Appointment_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        testbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new TestBookingFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new OrdersFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        consultations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new ConsultatWithDoctorFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        mydoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new MyDoctorsFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        medicalrecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new MedicalRecordFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        reminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new RemindersFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();

            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new PaymentHealthFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.top_right_corner,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
            Intent intent=new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(intent);
            finish();
                break;
//            case R.id.action_custom_child_animation:
//
//                break;
//            case R.id.action_restore_default:
//
//                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}