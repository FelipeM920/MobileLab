package com.example.felipe.basicloginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText nameLoginText =  findViewById(R.id.nameText);

        EditText passwordLoginText =  findViewById(R.id.passwordText);

        Log.i("Name", nameLoginText.getText().toString());

        Log.i("PassWord", passwordLoginText.getText().toString());
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
