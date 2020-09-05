package com.example.aaramidecal.slotfragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.aaramidecal.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    public FragmentTwo() {
        // Required empty public constructor
    }

    GridView gridView;
    ArrayList<GridViewListItem> items;
    GridListAdaptor listAdaptor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_two, container, false);

        gridView=view.findViewById(R.id.grid_list);


        gridList();

        listAdaptor=new GridListAdaptor(getContext(),items);
        gridView.setAdapter(listAdaptor);


        return view;
    }

    private void gridList() {

        items=new ArrayList<GridViewListItem>();
        items.add(new GridViewListItem("09:30 AM"));
        items.add(new GridViewListItem("09:45 AM"));
        items.add(new GridViewListItem("10:00 AM"));
        items.add(new GridViewListItem("10:15 AM"));
        items.add(new GridViewListItem("10:30 AM"));
        items.add(new GridViewListItem("10:45 AM"));
        items.add(new GridViewListItem("11:00 AM"));
        items.add(new GridViewListItem("11:15 AM"));
        items.add(new GridViewListItem("11:30 AM"));
        items.add(new GridViewListItem("11:45 AM"));
    }
}
