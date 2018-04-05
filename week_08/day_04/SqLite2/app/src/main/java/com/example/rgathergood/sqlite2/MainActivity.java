package com.example.rgathergood.sqlite2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);

        db.addArtist("Rob");
        db.addArtist("Cal");
        db.addArtist("Ali");

        Toast.makeText(this, "Values saved", Toast.LENGTH_LONG).show();

    }
}
