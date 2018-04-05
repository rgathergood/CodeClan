package com.codeclan.topmovieslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rgathergood on 20/03/2018.
 */

public class TopMoviesAdapter extends ArrayAdapter<Movie> {

    public TopMoviesAdapter(Context context, ArrayList<Movie> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        Movie currentMovie = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movie_item, parent, false);
        }

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentMovie.getRanking().toString());

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentMovie.getTitle().toString());

        TextView year = listItemView.findViewById(R.id.year);
        year.setText(currentMovie.getYear().toString());

        listItemView.setTag(currentMovie);

        return listItemView;
    }

}

