package com.example.m2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hide the action bar from splash screen
        Objects.requireNonNull(getSupportActionBar()).hide();
        //display splash screen for 5 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent displaySplash = new Intent(MainActivity.this, HomeActivity.class);
                startActivity((displaySplash));
                //pressing back button wont return to splash
                finish();
            }
        }, 5*1000);







    }
}