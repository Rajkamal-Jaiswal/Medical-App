package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.aaramidecal.Adapter.labTestOfferAdaptor;
import com.example.aaramidecal.Models.labTestsOfferItem;

import java.util.ArrayList;

public class testLabOffer extends AppCompatActivity {

    ListView list_viewItem;
    ArrayList<labTestsOfferItem> offerItems;
    labTestOfferAdaptor testOfferAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lab_offer);

        list_viewItem=(ListView)findViewById(R.id.list_viewItem);

        setListViewItem();

        testOfferAdaptor=new labTestOfferAdaptor(this,offerItems);
        list_viewItem.setAdapter(testOfferAdaptor);


        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void setListViewItem() {

        offerItems=new ArrayList<labTestsOfferItem>();

        offerItems.add(new labTestsOfferItem("Health Checkup - Standard","\u20B9 999 /-","By Thyrocare","\u20B9 2000 /-","60"));
        offerItems.add(new labTestsOfferItem("Essential Health Checkup","\u20B9 1199 /-","By Thyrocare","\u20B9 2200 /-","80"));
        offerItems.add(new labTestsOfferItem("Essential Health Checkup","\u20B9 1299 /-","By Pythocare","\u20B9 2000 /-","80"));
        offerItems.add(new labTestsOfferItem("Health Checkup - Basic","\u20B9 749 /-","By Thyrocare","\u20B9 1400 /-","56"));
        offerItems.add(new labTestsOfferItem("Health Checkup - Standard","\u20B9 999 /-","By Thyrocare","\u20B9 2000 /-","60"));
        offerItems.add(new labTestsOfferItem("Essential Health Checkup","\u20B9 1199 /-","By Thyrocare","\u20B9 2200 /-","80"));
        offerItems.add(new labTestsOfferItem("Health Checkup - Standard","\u20B9 999 /-","By Thyrocare","\u20B9 2000 /-","60"));
    }
}