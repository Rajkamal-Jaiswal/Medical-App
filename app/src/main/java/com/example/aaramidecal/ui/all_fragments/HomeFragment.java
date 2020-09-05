package com.example.aaramidecal.ui.all_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.example.aaramidecal.LetestOfferImageAdaptor;
import com.example.aaramidecal.ListofDoctorsProfile;
import com.example.aaramidecal.MedecineImgAdaptor;
import com.example.aaramidecal.MedicalShops;
import com.example.aaramidecal.R;
import com.example.aaramidecal.TestLabs;


import java.util.HashMap;
import java.util.Random;

import javax.xml.datatype.DatatypeFactory;

public class HomeFragment extends Fragment implements ViewPagerEx.OnPageChangeListener, BaseSliderView.OnSliderClickListener {


    SliderLayout mDemoSlider;
//    SliderLayout sliderLayout;
    CardView card1,card2,carddoc;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        mDemoSlider = root.findViewById(R.id.slider);
        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Chat with Doctor",R.drawable.aala);
        file_maps.put("Big Bang Theory",R.drawable.sklton);
        file_maps.put("House of Cards",R.drawable.doctorappint);
        file_maps.put("Test Booking", R.drawable.ladydoc);
        file_maps.put("Talk With Your Doctor", R.drawable.ladyfor);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(getContext());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle().putString("extra",name);
            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(com.daimajia.slider.library.SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(com.daimajia.slider.library.SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(3000);
        Random rand = new Random();

// Obtain a number between [0 - 49].
        int n = rand.nextInt(5);{
            switch (n){
                case 0:
                    mDemoSlider.setPresetTransformer("FlipHorizontal");
                    break;
                case 1:
                    mDemoSlider.setPresetTransformer("CubeIn");
                    break;
                case 2:
                    mDemoSlider.setPresetTransformer("DepthPage");
                    break;
                case 3:
                    mDemoSlider.setPresetTransformer("Tablet");
                    break;
                case 4:
                    mDemoSlider.setPresetTransformer("Stack");
                    break;
                case 5:
                    mDemoSlider.setPresetTransformer("Foreground2Background");
                    break;
                case 6:
                    mDemoSlider.setPresetTransformer("Background2Foreground");
                    break;
                case 7:
                    mDemoSlider.setPresetTransformer("Accordian");
                    break;
                default:
                    mDemoSlider.setPresetTransformer("Default");
                    break;


            }
        }
//        mDemoSlider.setPresetTransformer("FlipHorizontal");
        mDemoSlider.addOnPageChangeListener(this);


        //Letest Offer SLider
        ViewPager viewPager=root.findViewById(R.id.viewPager);
        LetestOfferImageAdaptor imageAdaptor=new LetestOfferImageAdaptor(getContext());
        viewPager.setAdapter(imageAdaptor);

        //medecine Slider
        ViewPager medecineViewPager=root.findViewById(R.id.medecineViewPager);
        MedecineImgAdaptor medecineImgAdaptor=new MedecineImgAdaptor(getContext());
        medecineViewPager.setAdapter(medecineImgAdaptor);

        card1=root.findViewById(R.id.card1);
        card2=root.findViewById(R.id.card2);
        carddoc=root.findViewById(R.id.carddoc);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), MedicalShops.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), TestLabs.class);
                startActivity(intent);
            }
        });

        carddoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), ListofDoctorsProfile.class);
                startActivity(intent);
            }
        });

        return root;
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//        Toast.makeText(this, "Scrolled", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
//        Toast.makeText(this, "Page Changed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrollStateChanged(int state) {
//        Toast.makeText(this, "Page Changed "+state, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(getContext(),slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
    }
}
