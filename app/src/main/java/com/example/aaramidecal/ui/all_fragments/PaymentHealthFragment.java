package com.example.aaramidecal.ui.all_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aaramidecal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PaymentHealthFragment extends Fragment {

    public PaymentHealthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_payment_health, container, false);



        return view;
    }
}
