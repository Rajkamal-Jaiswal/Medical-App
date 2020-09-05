package com.example.aaramidecal.slotfragments;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import com.example.aaramidecal.PatientDetails;
import com.example.aaramidecal.R;

import java.util.ArrayList;

public class GridListAdaptor extends BaseAdapter {

    Context context;
    ArrayList<GridViewListItem> items;

    public GridListAdaptor(Context context, ArrayList<GridViewListItem> items) {
        this.context = context;
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.size();
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

        convertView=LayoutInflater.from(context).inflate(R.layout.gridviewitem,parent,false);
        TextView txt_time=convertView.findViewById(R.id.txt_time);
        txt_time.setText(items.get(position).getTime());
        CardView cardView=convertView.findViewById(R.id.cardViewItem);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, ""+items.get(position).getTime(), Toast.LENGTH_SHORT).show();
                String time=items.get(position).getTime();
                Intent intent=new Intent(context.getApplicationContext(), PatientDetails.class);
                intent.putExtra("time",time);
                context.startActivity(intent);
            }
        });


        return convertView;
    }
}
