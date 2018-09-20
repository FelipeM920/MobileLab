package com.example.felipe.imagechangeaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button buttonChange;
    ImageView dogsImage;
    Boolean pressed = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonChange = findViewById(R.id.buttonChange);
        dogsImage = findViewById(R.id.dogsImage);
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressed) {
                    dogsImage.setImageResource(R.drawable.dog2);
                    pressed = false;
                }
                else {
                    dogsImage.setImageResource(R.drawable.dog1);
                    pressed = true;
                }
            }
        });
    }
}
