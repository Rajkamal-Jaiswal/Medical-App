package com.example.aaramidecal.ui.all_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aaramidecal.AppointmentDetails;
import com.example.aaramidecal.R;
import com.example.aaramidecal.ui.adapters.AppointmentAdapter;
import com.example.aaramidecal.ui.models.AppointmentListItem;

import java.util.ArrayList;

public class Upcoming_Appointment_Fragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AppointmentAdapter adapter;
    ArrayList<AppointmentListItem> items;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_upcoming_appointment, container, false);

        recyclerView=root.findViewById(R.id.recycler_appointment);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        setItemsData();

        adapter=new AppointmentAdapter(getContext(),items);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new AppointmentAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                //Toast.makeText(getContext(), ""+items.get(position).getAppointDoctor(), Toast.LENGTH_SHORT).show();
                String doctorName=items.get(position).getAppointDoctor();
                int imgUrl=items.get(position).getImages();
                Intent intent=new Intent(getContext(), AppointmentDetails.class);
                startActivity(intent);

            }
        });

        return root;
    }

    private void setItemsData() {
        items=new ArrayList<AppointmentListItem>();
        items.add(new AppointmentListItem(R.drawable.ladydoc,"Dr. Akanksha Gupta","Shubham Hospital,Jankipuram","11 May 2020,11:30 AM"));
        items.add(new AppointmentListItem(R.drawable.ladydoc,"Dr. Akanksha Gupta","Shubham Hospital,Jankipuram","11 May 2020,11:30 AM"));
        items.add(new AppointmentListItem(R.drawable.ladydoc,"Dr. Akanksha Gupta","Shubham Hospital,Jankipuram","11 May 2020,11:30 AM"));
        items.add(new AppointmentListItem(R.drawable.ladydoc,"Dr. Akanksha Gupta","Shubham Hospital,Jankipuram","11 May 2020,11:30 AM"));

    }

}
