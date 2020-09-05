package com.example.aaramidecal.ui.all_fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aaramidecal.ListofDoctorsProfile;
import com.example.aaramidecal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConsultatWithDoctorFragment extends Fragment {

    public ConsultatWithDoctorFragment() {
        // Required empty public constructor
    }

    Button btn_consult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_consult_with_doctor, container, false);

        btn_consult=view.findViewById(R.id.btn_consult);

        btn_consult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), ListofDoctorsProfile.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
