package com.example.aaramidecal.Profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aaramidecal.Adapter.personalAdaptor;
import com.example.aaramidecal.Models.PersonalModel;
import com.example.aaramidecal.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class PersonalFragment extends Fragment {


    TextView name,contact,email,gender,dob,blood,status,height,weight,emrcontact,location;

    EditText et_dob,et_blood,et_status,et_height,et_weight,et_emrcontact,et_location;

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public PersonalFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment PersonalFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static PersonalFragment newInstance(String param1, String param2) {
//        PersonalFragment fragment = new PersonalFragment();
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
        View view=inflater.inflate(R.layout.fragment_personal, container, false);


        name=view.findViewById(R.id.name);
        contact=view.findViewById(R.id.contact);
        email=view.findViewById(R.id.email);
        gender=view.findViewById(R.id.gender);
        dob=view.findViewById(R.id.dob);
        blood=view.findViewById(R.id.blood);
        status=view.findViewById(R.id.status);
        height=view.findViewById(R.id.height);
        weight=view.findViewById(R.id.weight);
        emrcontact=view.findViewById(R.id.emrcontact);
        location=view.findViewById(R.id.location);

        et_dob=view.findViewById(R.id.et_dob);
        et_blood=view.findViewById(R.id.et_blood);
        et_status=view.findViewById(R.id.et_status);
        et_height=view.findViewById(R.id.et_height);
        et_weight=view.findViewById(R.id.et_weight);
        et_location=view.findViewById(R.id.et_location);
        et_emrcontact=view.findViewById(R.id.et_emrcontact);

        final Button btn_save=view.findViewById(R.id.btn_save);
        final Button btn_edit=view.findViewById(R.id.btn_edit);

        final LinearLayout linearLayout=view.findViewById(R.id.linearLayout);

        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dob.setVisibility(View.GONE);
                blood.setVisibility(View.GONE);
                status.setVisibility(View.GONE);
                height.setVisibility(View.GONE);
                weight.setVisibility(View.GONE);
                emrcontact.setVisibility(View.GONE);
                location.setVisibility(View.GONE);

                et_dob.setVisibility(View.VISIBLE);
                et_blood.setVisibility(View.VISIBLE);
                et_status.setVisibility(View.VISIBLE);
                et_height.setVisibility(View.VISIBLE);
                et_weight.setVisibility(View.VISIBLE);
                et_location.setVisibility(View.VISIBLE);
                et_emrcontact.setVisibility(View.VISIBLE);


                btn_edit.setVisibility(View.GONE);
                linearLayout.setVisibility(View.GONE);
                btn_save.setVisibility(View.VISIBLE);


            }
        });

        return view;
    }


}