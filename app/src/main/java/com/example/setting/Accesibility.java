package com.example.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Accesibility extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesibility);
    }
    public void back(View view){
        Intent intent=new Intent(Accesibility.this, MainActivity.class);
        startActivity(intent);
    }
}