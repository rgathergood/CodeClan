package com.example.rgathergood.drumbrandslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class BrandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);

        Intent intent = getIntent();
        Brand brand = (Brand) intent.getSerializableExtra("brand");
        Log.d("brandActivity", brand.getName());


        ImageView myImageView = (ImageView) findViewById(R.id.my_image_view);
        myImageView.setImageResource(R.drawable.animal);
    }
}
