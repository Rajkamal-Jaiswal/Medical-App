package com.example.aaramidecal.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.aaramidecal.DoctorDeatilsProfile;
import com.example.aaramidecal.Models.DoctorProfileItem;
import com.example.aaramidecal.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DoctorProfileAdaptor extends BaseAdapter {


    Context context;
    ArrayList<DoctorProfileItem> listItems;

    public DoctorProfileAdaptor(Context context, ArrayList<DoctorProfileItem> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
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

        convertView= LayoutInflater.from(context).inflate(R.layout.doctorprofilelay,parent,false);


        RelativeLayout relativeLayout=convertView.findViewById(R.id.rel_container);
        TextView sym_Name=convertView.findViewById(R.id.symptonName);
        CircleImageView sym_img=convertView.findViewById(R.id.sympton_img);

        sym_Name.setText(listItems.get(position).getSympton_name());
        String img=listItems.get(position).getImage_sympton();
        String imgUrl="https://img.icons8.com/"+img;
        Glide.with(context).load(imgUrl).into(sym_img);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, "Hiii", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context.getApplicationContext(), DoctorDeatilsProfile.class);
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}
