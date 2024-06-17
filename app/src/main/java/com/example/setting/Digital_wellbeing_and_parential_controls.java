package com.example.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Digital_wellbeing_and_parential_controls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_wellbeing_and_parential_controls);
    }
    public void digi(View view){
        Intent intent=new Intent(Digital_wellbeing_and_parential_controls.this, MainActivity.class);
        startActivity(intent);
    }
}