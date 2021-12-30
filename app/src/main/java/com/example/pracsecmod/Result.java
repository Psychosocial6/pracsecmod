package com.example.pracsecmod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView textView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView8 = findViewById(R.id.textView8);
        int score = getIntent().getIntExtra("score", 0);
        if (score == 0) {
            textView8.setText("Вы ответили верно на 0 вопросов.");
        }
        else if (score == 1) {
            textView8.setText("Вы ответили верно на 1 вопрос.");
        }
        else {
            textView8.setText("Вы ответили верно на " + score + " вопроса.");
        }
    }
}