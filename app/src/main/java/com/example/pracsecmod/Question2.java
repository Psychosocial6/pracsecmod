package com.example.pracsecmod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Question2 extends AppCompatActivity implements View.OnClickListener {

    Button button2;
    TextView textView4, textView5;
    CheckBox checkBox, checkBox2, checkBox3;
    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                int score = getIntent().getIntExtra("score", 0);
                if (checkBox.isChecked()) {
                    cnt = -1;
                }
                if (checkBox3.isChecked()) {
                    cnt = -1;
                }
                if (checkBox2.isChecked() && cnt == 0) {
                    cnt = 1;
                }
                if (cnt >= 0) {
                    score += 1;
                }
                Intent intent = new Intent(Question2.this, Question3.class);
                intent.putExtra("score", score);
                startActivity(intent);
                break;
        }
    }

}