package com.personality.mbti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class q29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q29);

        RadioGroup radioGroup = findViewById(R.id.radgroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {

                    case 0:
                        ApplicationSessionStorage.SetSessionData("I", (ApplicationSessionStorage.GetSessionData("I") - 1));
                        break;
                    case 1:
                        ApplicationSessionStorage.SetSessionData("I", (ApplicationSessionStorage.GetSessionData("I") + 1));
                        break;
                }

            }
        });

    }

}
