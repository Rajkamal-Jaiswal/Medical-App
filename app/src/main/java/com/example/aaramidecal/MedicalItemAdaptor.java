package com.example.aaramidecal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MedicalItemAdaptor extends RecyclerView.Adapter<MedicalItemAdaptor.MyHolder> {

    Context context;
    ArrayList<MedicalItemList> itemLists;

    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener=listener;
    }

    public MedicalItemAdaptor(Context context, ArrayList<MedicalItemList> itemLists) {
        this.context = context;
        this.itemLists = itemLists;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.medicalitemlay,parent,false);
        MyHolder myHolder=new MyHolder(view,mListener);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {

        holder.imgIcon.setImageResource(itemLists.get(position).getImgIcon());
        holder.medicineName.setText(itemLists.get(position).getMedicineName());
        holder.companyName.setText(itemLists.get(position).getCompanyName());
        holder.price.setText(itemLists.get(position).getPrice());
        holder.purchase.setText(itemLists.get(position).getPurchase());
        holder.txtpurchase.setOnClickListener(new View.OnClickListener() {
            @java.lang.Override
            public void onClick(View v) {
                Intent intent=new Intent(context.getApplicationContext(),ConfirmOrder.class);
                String medicineName=itemLists.get(position).getMedicineName();
                String companyName=itemLists.get(position).getCompanyName();
                String price=itemLists.get(position).getPrice();
                intent.putExtra("medicinename",medicineName);
                intent.putExtra("companyName",companyName);
                intent.putExtra("price",price);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemLists.size();
    }


    public static class MyHolder extends RecyclerView.ViewHolder {

        ImageView imgIcon;
        TextView medicineName,companyName,price,purchase,txtpurchase;
        public MyHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            imgIcon=itemView.findViewById(R.id.imgIcon);
            medicineName=itemView.findViewById(R.id.txtMedecineName);
            companyName=itemView.findViewById(R.id.txtCompanyName);
            price=itemView.findViewById(R.id.txtPrice);
            purchase=itemView.findViewById(R.id.txtpurchase);
            txtpurchase=itemView.findViewById(R.id.txtpurchase);



        }

    }
}
