package com.example.aaramidecal.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aaramidecal.BookAppointmntActivity;
import com.example.aaramidecal.ConsultWithDoctor;
import com.example.aaramidecal.DoctorDeatilsProfile;
import com.example.aaramidecal.Models.DoctorsDetailsProfileModel;
import com.example.aaramidecal.R;

import java.util.ArrayList;

public class DoctorsDetailsProfileAdaptor extends RecyclerView.Adapter<DoctorsDetailsProfileAdaptor.MyHolder> {

    Context context;
    ArrayList<DoctorsDetailsProfileModel> profileModels;

    public DoctorsDetailsProfileAdaptor(Context context, ArrayList<DoctorsDetailsProfileModel> profileModels) {
        this.context = context;
        this.profileModels = profileModels;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.doctorsdetailsprofilelayout,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.doc_image.setImageResource(profileModels.get(position).getImage());
        holder.docName.setText(profileModels.get(position).getDocName());
        holder.doc_specialist.setText(profileModels.get(position).getDoc_specialist());
        holder.docExp.setText(profileModels.get(position).getDocExp());
        holder.doc_marksheet.setText(profileModels.get(position).getDoc_marksheet());
        holder.doc_degree.setText(profileModels.get(position).getDoc_degree());
        holder.address.setText(profileModels.get(position).getAddress());
        holder.docFee.setText(profileModels.get(position).getDocFee());

        holder.book_Appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, BookAppointmntActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        holder.consult_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, ConsultWithDoctor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return profileModels.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        TextView docName,doc_specialist,docExp,doc_marksheet,doc_degree,address,docFee;
        ImageView doc_image;
        Button book_Appointment,consult_doc;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            docName=itemView.findViewById(R.id.doc_name);
            doc_specialist=itemView.findViewById(R.id.doc_Specilist);
            docExp=itemView.findViewById(R.id.doc_exp);
            doc_marksheet=itemView.findViewById(R.id.mbbs);
            doc_degree=itemView.findViewById(R.id.txt_degree);
            address=itemView.findViewById(R.id.address);
            docFee=itemView.findViewById(R.id.doc_fee);
            doc_image=itemView.findViewById(R.id.doc_Img);
            book_Appointment=itemView.findViewById(R.id.book_Appointment);
            consult_doc=itemView.findViewById(R.id.consult_doc);
        }
    }

}
