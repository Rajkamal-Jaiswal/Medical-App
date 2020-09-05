package com.example.aaramidecal.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.aaramidecal.Models.testLabItem;
import com.example.aaramidecal.R;
import com.example.aaramidecal.testLabOffer;

import java.util.ArrayList;

public class testLabItemAdaptor extends BaseAdapter {

    Context context;
    ArrayList<testLabItem> labItems;

    public testLabItemAdaptor(Context context, ArrayList<testLabItem> labItems) {
        this.context = context;
        this.labItems = labItems;
    }

    @Override
    public int getCount() {
        return labItems.size();
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

        convertView= LayoutInflater.from(context).inflate(R.layout.testlablayout,parent,false);

        TextView belong=convertView.findViewById(R.id.below);
        TextView btn_gender=convertView.findViewById(R.id.btn_gender);
        CardView cardView=convertView.findViewById(R.id.cardMale1);
        LinearLayout linearLayout=convertView.findViewById(R.id.linearLayout);


        belong.setText(labItems.get(position).getBelong());
        btn_gender.setText(labItems.get(position).getBtn_gender());
        linearLayout.setBackgroundResource(labItems.get(position).getBackImg());

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context.getApplicationContext(), testLabOffer.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}
