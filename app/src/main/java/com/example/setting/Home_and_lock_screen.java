package com.example.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home_and_lock_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_and_lock_screen);
    }
    public void lock(View view){
        Intent intent=new Intent(Home_and_lock_screen.this, MainActivity.class);
        startActivity(intent);
    }
}