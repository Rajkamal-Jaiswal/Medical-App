package com.example.aaramidecal;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.aaramidecal.Adapter.timeSlotAdaptor;
import com.example.aaramidecal.Models.timeSlotItem;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.Calendar;

public class timeSlotBottomSheet extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view=inflater.inflate(R.layout.timeslotbottomsheet,container,false);

        final TextView date=view.findViewById(R.id.date);
        ImageButton btn_getDate=view.findViewById(R.id.btn_getDate);

        Button btn_confirm=view.findViewById(R.id.btn_confirm);

        final DatePickerDialog[] datePickerDialog = new DatePickerDialog[1];
        final int[] year = new int[1];
        final int[] month = new int[1];
        final int[] dayOfMonth = new int[1];
        final Calendar[] calendar = new Calendar[1];


        btn_getDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calendar[0] =Calendar.getInstance();
                year[0] = calendar[0].get(Calendar.YEAR);
                month[0] = calendar[0].get(Calendar.MONTH);
                dayOfMonth[0] = calendar[0].get(Calendar.DAY_OF_MONTH);
                datePickerDialog[0] =new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        date.setText(dayOfMonth + "/"+ (month+1) +"/" +year);
                    }
                }, year[0], month[0], dayOfMonth[0]);
                datePickerDialog[0].show();

            }
        });


        GridView gridViewItem=view.findViewById(R.id.gridViewItem);
        ArrayList<timeSlotItem> items;
        timeSlotAdaptor slotAdaptor;

        items=new ArrayList<timeSlotItem>();
        items.add(new timeSlotItem("6 am - 7 am"));
        items.add(new timeSlotItem("7 am - 8 am"));
        items.add(new timeSlotItem("8 am - 9 am"));
        items.add(new timeSlotItem("10 am - 11 am"));
        items.add(new timeSlotItem("11 am - 12 pm"));
        items.add(new timeSlotItem("12 pm - 1 pm"));
        items.add(new timeSlotItem("1 pm - 2 pm"));

        slotAdaptor=new timeSlotAdaptor(getContext(),items);
        gridViewItem.setAdapter(slotAdaptor);

        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), testLabPayment.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
