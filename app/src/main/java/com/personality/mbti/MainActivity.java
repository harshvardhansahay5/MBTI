package com.personality.mbti;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener{

    private TextView appName, subText;
    GestureDetectorCompat detector;

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

        detector = new GestureDetectorCompat(this, this);

    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if (e1.getX() - e2.getX() > 50) {
            Intent intent = new Intent(MainActivity.this, questions.class);
            startActivity(intent);
            overridePendingTransition(R.anim.enter, R.anim.exit);
            return true;
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

}
