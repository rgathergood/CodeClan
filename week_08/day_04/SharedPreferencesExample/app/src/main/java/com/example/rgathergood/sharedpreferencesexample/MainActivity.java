package com.example.rgathergood.sharedpreferencesexample;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputName;
    private TextView savedName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.input_name);
        savedName = findViewById(R.id.name);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        String nameThatWasSaved = sharedPref.getString("name", "No name saved");

        savedName.setText(nameThatWasSaved);
    }

    public void onSaveClick(View view) {
        String nameToSave = inputName.getText().toString();

        savedName.setText(nameToSave);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("name", nameToSave);
        editor.apply();
    }
 }
