package com.example.rgathergood.drumbrandslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AllBrands allBrands = new AllBrands();
        ArrayList<Brand> list = allBrands.getList();

        AllBrandsAdapter brandAdapter = new AllBrandsAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(brandAdapter);
    }

    public void onListItemClick(View listItem) {
        Brand brand = (Brand) listItem.getTag();

        Log.d("mainActivity", brand.getName());

        Intent intent = new Intent(this, BrandActivity.class);
        intent.putExtra("brand", brand);

        startActivity(intent);
    }

}
