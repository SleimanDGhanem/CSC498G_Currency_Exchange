package com.lau.currency;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value = (EditText) findViewById(R.id.value);


    }

    public void conversionLBP(View v){
        float amount = Integer.parseInt(value.getText().toString());
        amount = amount * 22000;
        value.setText(amount);
    }
    public void conversionUSD(View v){
        float amount = Integer.parseInt(value.getText().toString());
        amount = amount / 22000;
        value.setText(amount);
    }
}