package com.example.aaramidecal.ui.testbooking;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.aaramidecal.R;
import com.example.aaramidecal.modelsbyme.ModelGridTestBooking;

import java.util.ArrayList;
import java.util.List;

public class TestBookingFragment extends Fragment {



    GridView gridView;
    List<ModelGridTestBooking> modelGridTestBookings;
    AdapterTestBooking adapterTestBooking;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_test_booking, container, false);
        gridView=root.findViewById(R.id.gridView);
        modelGridTestBookings=new ArrayList<>();
        modelGridTestBookings.add(new ModelGridTestBooking(R.drawable.handsome,"Below 40","Male"));
        modelGridTestBookings.add(new ModelGridTestBooking(R.drawable.joggingwomen,"Below 40","Female"));
        modelGridTestBookings.add(new ModelGridTestBooking(R.drawable.maninoffice,"Above 40","Male"));
        modelGridTestBookings.add(new ModelGridTestBooking(R.drawable.parklady,"Above 40","Female"));
        adapterTestBooking=new AdapterTestBooking(getContext(),modelGridTestBookings);
        gridView.setAdapter(adapterTestBooking);
        return root;
    }
    private class AdapterTestBooking extends BaseAdapter{

        Context context;
        List<ModelGridTestBooking> modelGridTestBookings;

        public AdapterTestBooking(Context context, List<ModelGridTestBooking> modelGridTestBookings) {
            this.context = context;
            this.modelGridTestBookings = modelGridTestBookings;
        }

        @Override
        public int getCount() {
            return modelGridTestBookings.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
           view=LayoutInflater.from(context).inflate(R.layout.testlablayout,viewGroup,false);
           LinearLayout linearLayout=view.findViewById(R.id.linearLayout);
            TextView below=view.findViewById(R.id.below);
            TextView btn_gender=view.findViewById(R.id.btn_gender);
            linearLayout.setBackgroundResource(modelGridTestBookings.get(i).getImageres());
            below.setText(modelGridTestBookings.get(i).getTitle());
            btn_gender.setText(modelGridTestBookings.get(i).getSubtitle());
           return view;
        }
    }
}
