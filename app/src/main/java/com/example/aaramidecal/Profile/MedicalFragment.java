package com.example.aaramidecal.Profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.aaramidecal.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class MedicalFragment extends Fragment {

    TextView allgires,medication,pastMedication,disease,injuries,surgeries;

    EditText et_allergies,et_medication,et_pastMedication,et_disease,et_incident,et_surgeries;

    Button save,edit;
    LinearLayout linearLayout;

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public MedicalFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment MedicalFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static MedicalFragment newInstance(String param1, String param2) {
//        MedicalFragment fragment = new MedicalFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_medical, container, false);

        save=view.findViewById(R.id.btn_save);
        edit=view.findViewById(R.id.btn_edit);
        linearLayout=view.findViewById(R.id.linear_lay);

        allgires=view.findViewById(R.id.allgires);
        medication=view.findViewById(R.id.medication);
        pastMedication=view.findViewById(R.id.pastMedication);
        disease=view.findViewById(R.id.disease);
        injuries=view.findViewById(R.id.injuries);
        surgeries=view.findViewById(R.id.surgeries);

        et_allergies=view.findViewById(R.id.et_allergies);
        et_medication=view.findViewById(R.id.et_medication);
        et_pastMedication=view.findViewById(R.id.et_pastMedication);
        et_disease=view.findViewById(R.id.et_disease);
        et_incident=view.findViewById(R.id.et_incident);
        et_surgeries=view.findViewById(R.id.et_surgeries);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allgires.setVisibility(View.GONE);
                medication.setVisibility(View.GONE);
                pastMedication.setVisibility(View.GONE);
                disease.setVisibility(View.GONE);
                injuries.setVisibility(View.GONE);
                surgeries.setVisibility(View.GONE);

                et_allergies.setVisibility(View.VISIBLE);
                et_medication.setVisibility(View.VISIBLE);
                et_pastMedication.setVisibility(View.VISIBLE);
                et_disease.setVisibility(View.VISIBLE);
                et_incident.setVisibility(View.VISIBLE);
                et_surgeries.setVisibility(View.VISIBLE);

                save.setVisibility(View.VISIBLE);
                edit.setVisibility(View.GONE);
                linearLayout.setVisibility(View.GONE);
            }
        });


        return view;
    }
}