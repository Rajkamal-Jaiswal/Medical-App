package com.example.aaramidecal.ui.all_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aaramidecal.R;
import com.example.aaramidecal.ui.bottomsheets.MedicalRecordBottomSheet;

/**
 * A simple {@link Fragment} subclass.
 */
public class MedicalRecordFragment extends Fragment {

    public MedicalRecordFragment() {
        // Required empty public constructor
    }

    Button add_medicalRecord;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_medical_record, container, false);


        add_medicalRecord=view.findViewById(R.id.btn_addMedicalRecord);

        add_medicalRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    MedicalRecordBottomSheet recordBottomSheet=new MedicalRecordBottomSheet();
                    recordBottomSheet.show(getParentFragmentManager().beginTransaction(),"medicalBottomSheet");
            }
        });


        return view;
    }
}
