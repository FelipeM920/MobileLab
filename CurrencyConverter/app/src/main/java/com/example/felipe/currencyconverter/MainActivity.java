package com.example.felipe.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ConvertFunction(View view){

        EditText textValue = findViewById(R.id.amountField);

        if(textValue.getText().toString().matches("")){
            Toast.makeText(this,"Please, insert a value to convert.",Toast.LENGTH_SHORT).show();
        }
        else {
            Double dollarValue = 3.94;

            String showText = "R$: " + textValue.getText().toString() + " is U$" + (Double.parseDouble(textValue.getText().toString()) * dollarValue);

            Toast.makeText(this, showText, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
