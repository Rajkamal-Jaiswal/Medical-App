package com.example.aaramidecal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentSummery extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioBtnSingle,radioBtnUnlimited;
    TextView txt_Unlimitedfee,txt_payFee,txt_payAmount,txt_singleFee;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_summery);

        txt_Unlimitedfee=(TextView)findViewById(R.id.txt_unlimitedFee);
        txt_payFee=(TextView)findViewById(R.id.txt_payFee);
        txt_payAmount=(TextView)findViewById(R.id.txt_payAmount);
        txt_singleFee=(TextView)findViewById(R.id.txt_singleFee);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioBtnSingle=(RadioButton)findViewById(R.id.radioBtnSingle);
        radioBtnUnlimited=(RadioButton)findViewById(R.id.radioBtnUnlimited);

        Intent i=getIntent();
        String chatting=i.getStringExtra("chat");

        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioBtnSingle:
                        //Toast.makeText(PaymentSummery.this, "Single", Toast.LENGTH_SHORT).show();
                        String singleAmount=txt_singleFee.getText().toString().trim();
                        txt_payFee.setText(singleAmount);
                        txt_payAmount.setText(singleAmount);
                        break;
                    case R.id.radioBtnUnlimited:
                        //Toast.makeText(PaymentSummery.this, "Unlimited", Toast.LENGTH_SHORT).show();
                        String amount=txt_Unlimitedfee.getText().toString();
                        txt_payAmount.setText(amount);
                        txt_payFee.setText(amount);
                        break;
                }
            }
        });

        findViewById(R.id.btn_payment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ChatActivity.class);
                startActivity(intent);
            }
        });


    }
}