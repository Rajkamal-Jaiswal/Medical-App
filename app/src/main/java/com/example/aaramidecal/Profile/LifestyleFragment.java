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
 * Use the {@link LifestyleFragment} factory method to
 * create an instance of this fragment.
 */
public class LifestyleFragment extends Fragment {

    Button save,edit;
    LinearLayout linearLayout;

    TextView smoke,alcohol,activity,preference,occupation;

    EditText et_smoke,et_alcohol,et_activity,et_preference,et_occupation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_lifestyle, container, false);

        save=view.findViewById(R.id.btn_save);
        edit=view.findViewById(R.id.btn_edit);
        linearLayout=view.findViewById(R.id.linear_lay);

        smoke=view.findViewById(R.id.smoke);
        alcohol=view.findViewById(R.id.alcohol);
        activity=view.findViewById(R.id.activity);
        preference=view.findViewById(R.id.preference);
        occupation=view.findViewById(R.id.occupation);

        et_smoke=view.findViewById(R.id.et_smoke);
        et_alcohol=view.findViewById(R.id.et_alcohol);
        et_activity=view.findViewById(R.id.et_activity);
        et_preference=view.findViewById(R.id.et_preference);
        et_occupation=view.findViewById(R.id.et_occupation);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                smoke.setVisibility(View.GONE);
                alcohol.setVisibility(View.GONE);
                activity.setVisibility(View.GONE);
                preference.setVisibility(View.GONE);
                occupation.setVisibility(View.GONE);

                et_smoke.setVisibility(View.VISIBLE);
                et_alcohol.setVisibility(View.VISIBLE);
                et_activity.setVisibility(View.VISIBLE);
                et_preference.setVisibility(View.VISIBLE);
                et_occupation.setVisibility(View.VISIBLE);

                save.setVisibility(View.VISIBLE);
                edit.setVisibility(View.GONE);
                linearLayout.setVisibility(View.GONE);
            }
        });
        return view;
    }
}