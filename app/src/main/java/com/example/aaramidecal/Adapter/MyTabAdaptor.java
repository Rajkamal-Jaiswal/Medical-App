package com.example.aaramidecal.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.aaramidecal.Profile.LifestyleFragment;
import com.example.aaramidecal.Profile.MedicalFragment;
import com.example.aaramidecal.Profile.PersonalFragment;

import java.util.ArrayList;

public class MyTabAdaptor extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments=new ArrayList<>();
    ArrayList<String> strings=new ArrayList<>();

    public MyTabAdaptor(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new PersonalFragment();
            case 1:
                return new MedicalFragment();
            case 2:
                return new LifestyleFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void add(Fragment fragment,String string){
        fragments.add(fragment);
        strings.add(string);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }

}
