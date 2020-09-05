package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmOrder extends AppCompatActivity {

    String medicineName="";
    String companyName="";
    String price="";

    TextView txtMedecineName,txtCompanyName,txtPrice,btn_minus,btn_plus,totalItems,totalPrice,txt_totalQuantity;

    int i=0;

    double rs;
    double trs=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        txtCompanyName=findViewById(R.id.txtCompanyName);
        txtMedecineName=findViewById(R.id.txtMedecineName);
        txtPrice=findViewById(R.id.txtPrice);
        btn_minus=findViewById(R.id.btn_minus);
        btn_plus=findViewById(R.id.btn_plus);
        totalItems=findViewById(R.id.totalItem);
        totalPrice=findViewById(R.id.totalPrice);
        txt_totalQuantity=findViewById(R.id.txt_totalQuantity);

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        findViewById(R.id.btn_checkOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MedicineDeliveryAddress.class);
                startActivity(intent);
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @java.lang.Override
            public void onClick(View v) {
                Minus();
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @java.lang.Override
            public void onClick(View v) {
                Plus();
            }
        });



        Intent intent=getIntent();
        medicineName=intent.getStringExtra("medicinename");
        companyName=intent.getStringExtra("companyName");
        price=intent.getStringExtra("price");
        Toast.makeText(ConfirmOrder.this, ""+medicineName+","+companyName+","+price, Toast.LENGTH_SHORT).show();

        setData();

        rs=Double.parseDouble(txtPrice.getText().toString());



    }


    private void Plus() {
        i++;
        txt_totalQuantity.setText(String.valueOf(i));
        totalItems.setText(String.valueOf(i)+" Items");
        trs=trs+rs;
        //Log.d("TAG", "Plus: "+trs);
        totalPrice.setText(String.valueOf(trs));
    }

    private void Minus() {
        if(i==-1)
        {
            i=0;
            txt_totalQuantity.setText(String.valueOf(i));
            totalItems.setText(String.valueOf(i)+" Items");
            String price=txtPrice.getText().toString();
            totalPrice.setText("Price");
        }
        else
        {
            double ttrs=Double.parseDouble(totalPrice.getText().toString());
            double rrs=Double.parseDouble(txtPrice.getText().toString());
            i--;
            if(i==-1)
            {
               i=0;
                txt_totalQuantity.setText(String.valueOf(i));
                totalItems.setText(String.valueOf(i)+"Items");
                String price=txtPrice.getText().toString();
                totalPrice.setText("Price");
            }
            else {
                txt_totalQuantity.setText(String.valueOf(i));
                totalItems.setText(String.valueOf(i)+"Items");
                ttrs-=rrs;
                Log.d("TAG", "Minus: "+ttrs);
                totalPrice.setText(String.valueOf(ttrs));
            }

        }

    }

    private void setData() {
        txtCompanyName.setText(companyName);
        txtMedecineName.setText(medicineName);
        txtPrice.setText(price);
    }
}
