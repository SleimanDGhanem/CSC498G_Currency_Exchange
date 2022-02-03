package com.lau.currency;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {
    EditText value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value = (EditText) findViewById(R.id.value);

    }

    public void conversionLBP(View v){
        double amount = Double.parseDouble(value.getText().toString());
        amount = amount * 22000;
        BigDecimal bd = new BigDecimal(amount).setScale(3, RoundingMode.HALF_UP);
        amount = bd.doubleValue();
        value.setText(String.valueOf(amount));
    }
    public void conversionUSD(View v){
        double amount = Double.parseDouble(value.getText().toString());
        amount = amount / 22000;
        BigDecimal bd = new BigDecimal(amount).setScale(3, RoundingMode.HALF_UP);
        amount = bd.doubleValue();
        value.setText(String.valueOf(amount));
    }
}