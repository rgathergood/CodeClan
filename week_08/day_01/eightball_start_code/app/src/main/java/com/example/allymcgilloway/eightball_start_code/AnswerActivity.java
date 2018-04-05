package com.example.allymcgilloway.eightball_start_code;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    private TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerTextView = findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");
        answerTextView.setText(answer);
    }
}
