package com.example.allymcgilloway.eightball_start_code;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText questionEditText;
    private Button shakeButton;
    private TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "oncreate");
        questionEditText = findViewById(R.id.question);
        shakeButton = findViewById(R.id.shake_button);
        answerTextView = findViewById(R.id.answer_textview);
    }

    public void onShakeButtonClicked(View clickedView) {
        Log.d("MainActivity", "shake button clicked");
        String questionThatWasAsked = questionEditText.getText().toString();
        Log.d("MainActivity", questionThatWasAsked);
        if(!questionEditText.getText().toString().isEmpty()) {
            Answer answers = new Answer();
            EightBall eightBall = new EightBall(answers);
            String randomAnswer = eightBall.randomAnswer();
//            answerTextView.setText(eightBall.randomAnswer());
        Intent intent = new Intent(this, AnswerActivity.class);

        intent.putExtra("answer", randomAnswer);

        startActivity(intent);
        } else {
            answerTextView.setText("Ask a question");
        }
    }
}