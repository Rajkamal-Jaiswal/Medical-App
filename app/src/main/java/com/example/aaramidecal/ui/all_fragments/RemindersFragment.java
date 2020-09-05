package com.example.aaramidecal.ui.all_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.aaramidecal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RemindersFragment extends Fragment {

    ImageView image;
    public RemindersFragment() {
        // Required empty public constructor
    }


    Button add_Reminder;

    @Override
    public void onStart() {
        super.onStart();
//        Glide.with(getActivity()).load("https://source.unsplash.com/1600x900/?watch,alarm").into(image);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_reminders, container, false);

        add_Reminder=view.findViewById(R.id.btn_addReminder);
        image=view.findViewById(R.id.image);


        add_Reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Api is not available....", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
