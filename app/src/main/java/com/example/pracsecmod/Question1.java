package com.example.pracsecmod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Question1 extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        editText = findViewById(R.id.editTextQuestion1);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                String ans = editText.getText().toString();
                int score = getIntent().getIntExtra("score", 0);
                if (ans == "объектно-ориентированное программирование" || ans == "объектно ориентированное gпрограммирование") {
                    score += 1;
                }
                Intent intent = new Intent(Question1.this, Question2.class);
                intent.putExtra("score", score);
                startActivity(intent);
                break;
        }
    }

}