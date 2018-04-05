package com.example.rgathergood.drumbrandslist;

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

public class AllBrandsAdapter extends ArrayAdapter<Brand> {

    public AllBrandsAdapter(Context context, ArrayList<Brand> list) { super(context, 0, list);}

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        Brand currentBrand = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.brand_item, parent, false);
        }

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentBrand.getName().toString());

        TextView model = listItemView.findViewById(R.id.model);
        model.setText(currentBrand.getModel().toString());

        listItemView.setTag(currentBrand);

        return listItemView;
    }
}

