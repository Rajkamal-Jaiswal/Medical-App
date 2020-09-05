package com.example.aaramidecal.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aaramidecal.R;
import com.example.aaramidecal.ui.models.MyDoctorData;

import java.util.ArrayList;

public class MyDoctorDataAdaptor extends RecyclerView.Adapter<MyDoctorDataAdaptor.MyHolder> {

    Context context;
    ArrayList<MyDoctorData> list;

    public MyDoctorDataAdaptor(Context context, ArrayList<MyDoctorData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.my_doctor_layout,parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.docName.setText(list.get(position).getDocName());
        holder.address.setText(list.get(position).getAddress());
        holder.image.setImageResource(list.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        TextView docName,address;
        ImageView image;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            docName=itemView.findViewById(R.id.docName);
            address=itemView.findViewById(R.id.address);
            image=itemView.findViewById(R.id.imgDocProfile);
        }
    }
}
