package com.personality.mbti;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView appName, subText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appName = findViewById(R.id.appName);
        subText = findViewById(R.id.subText);
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
        }, 1000);

    }
}
