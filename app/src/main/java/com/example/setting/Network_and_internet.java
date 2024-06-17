package com.example.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.ImageButton;

public class Network_and_internet extends AppCompatActivity {
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_and_internet);

    }
    public void back_to_mainactivity(View view){
        Intent intent=new Intent(Network_and_internet.this, MainActivity.class);
        startActivity(intent);

    }
    public void back_to_mainactivity3(View view){

        btn.setBackground(getDrawable(com.google.android.material.R.color.design_default_color_secondary_variant));
    }
}