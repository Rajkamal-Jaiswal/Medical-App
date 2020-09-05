package com.example.aaramidecal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class LetestOfferImageAdaptor extends PagerAdapter {

    Context mContext;

    public LetestOfferImageAdaptor(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==((ImageView) object);
    }

    private int[] sliderImageId=new int[]{
            R.drawable.latestofferfive,R.drawable.latestoffero,
            R.drawable.letesoffersix,R.drawable.letestoffer,
            R.drawable.letestoffert,
            R.drawable.letestofferth

    };

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager)container).addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((ImageView)object);
    }
}
