package com.emmutua.linkedinclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Boolean isLoggedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        if (isLoggedIn == false) {
            startActivity(new Intent(MainActivity.this, Login.class));
        } else {
            setContentView(R.layout.activity_home_screen);
        }
    }
}