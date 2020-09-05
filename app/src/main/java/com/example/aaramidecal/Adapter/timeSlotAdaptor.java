package com.example.aaramidecal.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.aaramidecal.Models.timeSlotItem;
import com.example.aaramidecal.R;
import com.example.aaramidecal.testLabPayment;

import java.util.ArrayList;

public class timeSlotAdaptor extends BaseAdapter {

    Context context;
    ArrayList<timeSlotItem> slotItems;

    public timeSlotAdaptor(Context context, ArrayList<timeSlotItem> slotItems) {
        this.context = context;
        this.slotItems = slotItems;
    }

    @Override
    public int getCount() {
        return slotItems.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(context).inflate(R.layout.testlabtimeslotlayout,parent,false);

        TextView time=convertView.findViewById(R.id.tv_time);



        time.setText(slotItems.get(position).getTime());


        return convertView;
    }
}
