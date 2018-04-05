package com.codeclan.topmovieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopMovies topMovies = new TopMovies();
        ArrayList<Movie> list = topMovies.getList();

        TopMoviesAdapter movieAdapter = new TopMoviesAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(movieAdapter);
    }

    public void onListItemClick(View listItem) {
        Movie selectedMovie = (Movie) listItem.getTag();

        Log.d("MainActivity", selectedMovie.getTitle());

        Intent intent = new Intent(this, MovieActivity.class);
        intent.putExtra("movie", selectedMovie);

        startActivity(intent);
    }
}
