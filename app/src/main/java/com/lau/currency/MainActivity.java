package com.lau.currency;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {
    EditText lbp;
    EditText usd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbp = (EditText) findViewById(R.id.lbp);
        usd = (EditText) findViewById(R.id.usd);
        lbp.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                double amount = Integer.parseInt(lbp.getText().toString());
                double result = amount / 22000;
                BigDecimal bd = new BigDecimal(result).setScale(3, RoundingMode.HALF_UP);
                result = bd.doubleValue();
                usd.setText(String.valueOf(result));
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(lbp.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_LONG).show();22
                }

            }
        });
    }

    public void conversion(View v){

    }
}