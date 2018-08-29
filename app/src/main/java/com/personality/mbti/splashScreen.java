package com.personality.mbti;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

public class splashScreen extends AppCompatActivity {

    private TextView appName, subText;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appName = findViewById(R.id.appName);
        subText = findViewById(R.id.subText);
        start   = findViewById(R.id.button3);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                AlphaAnimation fade_in = new AlphaAnimation(0.0f, 1.0f);
                fade_in.setDuration(500);
                fade_in.setFillAfter(true);
                appName.startAnimation(fade_in);
            }
        }, 200);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                AlphaAnimation fade_in = new AlphaAnimation(0.0f, 1.0f);
                fade_in.setDuration(500);
                fade_in.setFillAfter(true);
                subText.startAnimation(fade_in);
            }
        }, 800);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                AlphaAnimation fade_in = new AlphaAnimation(0.0f, 1.0f);
                fade_in.setDuration(500);
                fade_in.setFillAfter(true);
                start.startAnimation(fade_in);
            }
        }, 1200);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(splashScreen.this, questions.class);
                startActivity(intent);
            }
        });

    }
}
