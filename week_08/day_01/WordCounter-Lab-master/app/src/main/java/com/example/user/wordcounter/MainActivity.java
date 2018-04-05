package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText textToBeCounted;
    private Button submitButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "oncreate");
        textToBeCounted = findViewById(R.id.TextToBeCounted);
        submitButton = findViewById(R.id.submit_button);
        result = findViewById(R.id.result);
    }

    public void onSubmitButtonClicked(View clickedView) {
        Log.d("MainActivity", "submit button clicked");
        String textInputted = textToBeCounted.getText().toString();
        Log.d("MainActivity", textInputted);
        WordCounter wordCounter = new WordCounter();
        String output = wordCounter.countWords(textInputted);
        result.setText("Word count: " + output);
    }
}
