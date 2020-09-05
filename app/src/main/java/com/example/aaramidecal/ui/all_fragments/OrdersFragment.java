package com.example.aaramidecal.ui.all_fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.aaramidecal.ListofDoctorsProfile;
import com.example.aaramidecal.MedicalShops;
import com.example.aaramidecal.R;
import com.example.aaramidecal.ui.bottomsheets.ExampleBottomSheetDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrdersFragment extends Fragment{

    public OrdersFragment() {
        // Required empty public constructor
    }



    Button btn_upload;
    TextView no_prescription,txtSearchView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_orders, container, false);
        btn_upload=view.findViewById(R.id.btn_upload);
        no_prescription=view.findViewById(R.id.no_prescription);
        txtSearchView=view.findViewById(R.id.txtSearchView);





        txtSearchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), MedicalShops.class);
                startActivity(intent);
            }
        });

        no_prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), ListofDoctorsProfile.class);
                startActivity(intent);
            }
        });

        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExampleBottomSheetDialog buttomdailog=new ExampleBottomSheetDialog();
                buttomdailog.show(getParentFragmentManager().beginTransaction(),"exampleBottomSheet");
            }
        });

        return view;
    }


}
