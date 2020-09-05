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
import com.example.aaramidecal.ui.models.AppointmentListItem;

import java.util.ArrayList;

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.MyHolder> {

    Context context;
    ArrayList<AppointmentListItem> listItems;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener=listener;
    }

    public AppointmentAdapter(Context context, ArrayList<AppointmentListItem> listItems) {
        this.context = context;
        this.listItems = listItems;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.appointmentlistitem,parent,false);
        MyHolder myHolder=new MyHolder(view,mListener);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.AppointmentDoctor.setText(listItems.get(position).getAppointDoctor());
        holder.txtAddress.setText(listItems.get(position).getAddress());
        holder.txtDateTime.setText(listItems.get(position).getDateTime());
        holder.docImage.setImageResource(listItems.get(position).getImages());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        TextView AppointmentDoctor,txtAddress,txtDateTime;
        ImageView docImage;
        public MyHolder(@NonNull View itemView,final OnItemClickListener listener) {
            super(itemView);

            AppointmentDoctor=itemView.findViewById(R.id.txt_AppointDoctor);
            txtAddress=itemView.findViewById(R.id.txt_location);
            txtDateTime=itemView.findViewById(R.id.txt_DateTime);
            docImage=itemView.findViewById(R.id.imgDoc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        int position=getAdapterPosition();
                        if(position!=RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
