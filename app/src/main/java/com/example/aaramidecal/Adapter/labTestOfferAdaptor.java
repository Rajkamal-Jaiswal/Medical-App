package com.example.aaramidecal.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.aaramidecal.R;
import com.example.aaramidecal.Models.labTestsOfferItem;
import com.example.aaramidecal.testLabMyCart;

import java.util.ArrayList;

public class labTestOfferAdaptor extends BaseAdapter {

    Context context;
    ArrayList<labTestsOfferItem> offerItems;

    public labTestOfferAdaptor(Context context, ArrayList<labTestsOfferItem> offerItems) {
        this.context = context;
        this.offerItems = offerItems;
    }

    @Override
    public int getCount() {
        return offerItems.size();
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(context).inflate(R.layout.labtetsofferlayout,parent,false);

        TextView healthCheckup=convertView.findViewById(R.id.healthCheckup);
        TextView newPrice=convertView.findViewById(R.id.newPrice);
        TextView oldPrice=convertView.findViewById(R.id.oldPrice);
        TextView testCare=convertView.findViewById(R.id.testCare);
        TextView noOfTest=convertView.findViewById(R.id.NoOfTests);
        CardView cardView=convertView.findViewById(R.id.cardLabTestOffer);


        healthCheckup.setText(offerItems.get(position).getHealthCheckup());
        newPrice.setText(offerItems.get(position).getNewPrice());
        oldPrice.setText(offerItems.get(position).getOldPrice());
        testCare.setText(offerItems.get(position).getTestCare());
        noOfTest.setText(offerItems.get(position).getNoOfTests());

        oldPrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context.getApplicationContext(), testLabMyCart.class);
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}
