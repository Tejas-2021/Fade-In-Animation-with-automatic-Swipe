package com.project.globalwebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    Context ctx = this;
    TextView exportcontact,domesticcontact;
    TextView lbladdress;
    ImageView globallogo;
    private Animation animBounce,animFadeIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);
        globallogo = findViewById(R.id.globallogo);
        exportcontact = findViewById(R.id.exportcontact);
        domesticcontact = findViewById(R.id.domesticcontact);
        lbladdress = findViewById(R.id.lbladdressline1);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bouncing);
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_fade_in);
        lbladdress.startAnimation(animFadeIn);
        exportcontact.startAnimation(animFadeIn);
        domesticcontact.startAnimation(animFadeIn);
        globallogo.startAnimation(animBounce);
        startTheTransitionAfterTheSplashScreen();
    }

    private void startTheTransitionAfterTheSplashScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashscreenintent = new Intent(SplashScreen.this, SecondActivity.class);
                //splashscreenintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                splashscreenintent.putExtra("Shutdown",true);


                startActivity(splashscreenintent);
                overridePendingTransition(R.anim.animation_enter_activity, R.anim.animation_leave_activity);
                finish();

            }
        }, 8000);
    }
}
