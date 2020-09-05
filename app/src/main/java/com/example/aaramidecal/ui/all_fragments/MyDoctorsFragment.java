package com.example.aaramidecal.ui.all_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aaramidecal.R;
import com.example.aaramidecal.ui.models.MyDoctorData;
import com.example.aaramidecal.ui.adapters.MyDoctorDataAdaptor;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDoctorsFragment extends Fragment {

    public MyDoctorsFragment() {
        // Required empty public constructor
    }
    RecyclerView recyclerView;
    MyDoctorDataAdaptor dataAdaptor;
    ArrayList<MyDoctorData> list;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_my_doctors, container, false);

        recyclerView=view.findViewById(R.id.recycler_docProfile);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        setData();

        dataAdaptor=new MyDoctorDataAdaptor(getContext(),list);
        recyclerView.setAdapter(dataAdaptor);

        return view;
    }

    private void setData() {

        list=new ArrayList<MyDoctorData>();
        list.add(new MyDoctorData(R.drawable.ladydoc,"Dr. Akankasha Gupta","Gynecologist/Obstetriction specialist  Shubham Hospital"));
    }
}
