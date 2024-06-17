package com.example.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView network;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        network=(TextView) findViewById(R.id.network_and_internet);
    }
    public void open_network_and_internet(View view){
        Intent intent=new Intent(MainActivity.this, Network_and_internet.class);
        startActivity(intent);

    }
    public void open_connected_device(View view){
        Intent intent=new Intent(MainActivity.this, Connected_devices.class);
        startActivity(intent);
    }

    public void open_personalise(View view){
        Intent intent=new Intent(MainActivity.this, Personalise.class);
        startActivity(intent);

    }
    public void open_display(View view){
        Intent intent=new Intent(MainActivity.this, Display.class);
        startActivity(intent);
    }
    public void open_home_and_lock(View view){
        Intent intent=new Intent(MainActivity.this, Home_and_lock_screen.class);
        startActivity(intent);
    }
    public void open_sound_and_vibration(View view){
        Intent intent=new Intent(MainActivity.this, Sound_and_vibration.class);
        startActivity(intent);
    }
    public void open_notifications(View view){
        Intent intent=new Intent(MainActivity.this, Notifications.class);
        startActivity(intent);
    }
    public void open_gestures(View view){
        Intent intent=new Intent(MainActivity.this, Gestures.class);
        startActivity(intent);
    }
    public void open_battery(View view){
        Intent intent=new Intent(MainActivity.this, Battery.class);
        startActivity(intent);
    }
    public void open_storage(View view){
        Intent intent=new Intent(MainActivity.this, Storage.class);
        startActivity(intent);
    }
    public void open_location(View view){
        Intent intent=new Intent(MainActivity.this, Location.class);
        startActivity(intent);
    }
    public void open_accesibility(View view){
        Intent intent=new Intent(MainActivity.this, Accesibility.class);
        startActivity(intent);
    }
    public void open_apps(View view){
        Intent intent=new Intent(MainActivity.this, Apps.class);
        startActivity(intent);
    }
    public void open_password_and_accounts(View view){
        Intent intent=new Intent(MainActivity.this, Password_and_acounts.class);
        startActivity(intent);
    }
    public void open_security_and_privacy(View view){
        Intent intent=new Intent(MainActivity.this, Security_and_privacy.class);
        startActivity(intent);
    }

    public void open_safety_and_emergency(View view){
        Intent intent=new Intent(MainActivity.this, Safety_and_security.class);
        startActivity(intent);
    }
    public void open_didgital_and_wellbeing(View view){
        Intent intent=new Intent(MainActivity.this, Digital_wellbeing_and_parential_controls.class);
        startActivity(intent);
    }
    public void open_google(View view){
        Intent intent=new Intent(MainActivity.this, Google.class);
        startActivity(intent);
    }
    public void open_system_updates(View view){
        Intent intent=new Intent(MainActivity.this, System_updates.class);
        startActivity(intent);
    }
    public void open_rating_and_reviews(View view){
        Intent intent=new Intent(MainActivity.this, Rating_and_reviews.class);
        startActivity(intent);
    }
    public void open_help(View view){
        Intent intent=new Intent(MainActivity.this, Help.class);
        startActivity(intent);
    }
    public void open_system(View view){
        Intent intent=new Intent(MainActivity.this, System.class);
        startActivity(intent);
    }
    public void open_about_phone(View view){
        Intent intent=new Intent(MainActivity.this, About_phone.class);
        startActivity(intent);
    }

}