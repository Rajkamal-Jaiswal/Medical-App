package com.example.aaramidecal.ui.bottomsheets;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.aaramidecal.R;
import com.example.aaramidecal.UploadPrescription;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ExampleBottomSheetDialog extends BottomSheetDialogFragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.bottom_sheet_layout,container,false);

        final RelativeLayout rel_camera=view.findViewById(R.id.rel_camera);
        final RelativeLayout rel_gallery=view.findViewById(R.id.rel_gallery);
        final RelativeLayout rel_pdfFile=view.findViewById(R.id.rel_pdfFile);

        rel_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UploadPrescription.class);
                intent.putExtra("camera","camera");
                startActivity(intent);
                dismiss();
            }
        });
        rel_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UploadPrescription.class);
                intent.putExtra("gallery","gallery");
                startActivity(intent);
                dismiss();
            }
        });
        rel_pdfFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UploadPrescription.class);
                intent.putExtra("pdf","pdf");
                startActivity(intent);
                dismiss();
            }
        });
        return view;
    }


}
