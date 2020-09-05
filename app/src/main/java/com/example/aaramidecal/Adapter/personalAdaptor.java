package com.example.aaramidecal.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aaramidecal.Models.PersonalModel;
import com.example.aaramidecal.R;

import java.util.ArrayList;

public class personalAdaptor extends BaseAdapter {

    Context context;
    ArrayList<PersonalModel> modelArrayList;

    public personalAdaptor(Context context, ArrayList<PersonalModel> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @Override
    public int getCount() {
        return modelArrayList.size();
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

        view= LayoutInflater.from(context).inflate(R.layout.personalprofilelayout,viewGroup,false);

        TextView name=view.findViewById(R.id.name);
        TextView contact=view.findViewById(R.id.contact);
        TextView emailId=view.findViewById(R.id.email);
        TextView gender=view.findViewById(R.id.gender);
        TextView dob=view.findViewById(R.id.dob);
        TextView bloodGroup=view.findViewById(R.id.blood);
        TextView maritalstatus=view.findViewById(R.id.status);
        TextView height=view.findViewById(R.id.height);
        TextView weight=view.findViewById(R.id.weight);
        TextView emrContact=view.findViewById(R.id.emrcontact);
        TextView location=view.findViewById(R.id.location);
        RelativeLayout relativeLayout=view.findViewById(R.id.rel_container);

        name.setText(modelArrayList.get(i).getName());
        contact.setText(modelArrayList.get(i).getContact());
        emailId.setText(modelArrayList.get(i).getEmail());
        gender.setText(modelArrayList.get(i).getGender());
        dob.setText(modelArrayList.get(i).getDob());
        bloodGroup.setText(modelArrayList.get(i).getBlood());
        maritalstatus.setText(modelArrayList.get(i).getStatus());
        height.setText(modelArrayList.get(i).getHeight());
        weight.setText(modelArrayList.get(i).getWeight());
        emrContact.setText(modelArrayList.get(i).getEmrcontact());
        location.setText(modelArrayList.get(i).getLocation());

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "hiii", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
