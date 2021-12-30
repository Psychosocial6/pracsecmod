package com.example.pracsecmod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question3 extends AppCompatActivity implements View.OnClickListener {

    TextView textView6, textView7;
    Button button3;
    RadioButton radioButton, radioButton2, radioButton3;
    int cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                int score = getIntent().getIntExtra("score", 0);
                if (radioButton3.isChecked()) {
                    cnt = 1;
                }
                if (cnt == 1) {
                    score += 1;
                }
                Intent intent = new Intent(Question3.this, Result.class);
                intent.putExtra("score", score);
                startActivity(intent);
                break;
        }
    }
}