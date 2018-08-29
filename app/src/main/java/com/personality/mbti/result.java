package com.personality.mbti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {

    private TextView textView, textView2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button4);
        String respers = ApplicationSessionStorage.GetSessionData("respers");
        switch (respers) {
            case "ESTJ":
                textView2.setText(respers + " - THE GUARDIAN");
                textView.setText(R.string.ESTJ);
                break;
            case "ESTP":
                textView2.setText(respers + " - THE DOER");
                textView.setText(R.string.ESTP);
                break;
            case "ESFJ":
                textView2.setText(respers + " - THE CAREGIVER");
                textView.setText(R.string.ESFJ);
                break;
            case "ESFP":
                textView2.setText(respers + " - THE PERFORMER");
                textView.setText(R.string.ESFP);
                break;
            case "ENTJ":
                textView2.setText(respers + " - THE EXECUTIVE");
                textView.setText(R.string.ENTJ);
                break;
            case "ENTP":
                textView2.setText(respers + " - THE VISIONARY");
                textView.setText(R.string.ENTP);
                break;
            case "ENFJ":
                textView2.setText(respers + " - THE GIVER");
                textView.setText(R.string.ENFJ);
                break;
            case "ENFP":
                textView2.setText(respers + " - THE INSPIRER");
                textView.setText(R.string.ENFP);
                break;
            case "ISTJ":
                textView2.setText(respers + " - THE DUTY FULFILLER");
                textView.setText(R.string.ISTJ);
                break;
            case "ISTP":
                textView2.setText(respers + " - THE MECHANIC");
                textView.setText(R.string.ISTP);
                break;
            case "ISFJ":
                textView2.setText(respers + " - THE NURTURER");
                textView.setText(R.string.ISFJ);
                break;
            case "ISFP":
                textView2.setText(respers + " - THE ARTIST");
                textView.setText(R.string.ISFP);
                break;
            case "INTJ":
                textView2.setText(respers + " - THE SCIENTIST");
                textView.setText(R.string.INTJ);
                break;
            case "INTP":
                textView2.setText(respers + " - THE THINKER");
                textView.setText(R.string.INTP);
                break;
            case "INFJ":
                textView2.setText(respers + " - THE PROTECTOR");
                textView.setText(R.string.INFJ);
                break;
            case "INFP":
                textView2.setText(respers + " - THE IDEALIST");
                textView.setText(R.string.INFP);
                break;
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(result.this, splashScreen.class);
                startActivity(intent);
            }
        });
    }
}
