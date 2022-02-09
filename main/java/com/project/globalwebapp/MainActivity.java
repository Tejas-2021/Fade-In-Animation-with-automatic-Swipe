package com.project.globalwebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView globallogo;
    private Animation animBounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        //globallogo = findViewById(R.id.globallogo);
        //animBounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bouncing);
        //globallogo.startAnimation(animBounce);
    }
}