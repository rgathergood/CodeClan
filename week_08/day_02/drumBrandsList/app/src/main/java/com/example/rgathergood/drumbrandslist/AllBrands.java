package com.example.rgathergood.drumbrandslist;

import java.util.ArrayList;

/**
 * Created by rgathergood on 20/03/2018.
 */

public class AllBrands {

    private ArrayList<Brand> list;

    public AllBrands() {
        list = new ArrayList<Brand>();
        list.add(new Brand("Pearl", "Reference"));
        list.add(new Brand("DW", "Collectors Series"));
        list.add(new Brand("Tama", "Superclassic"));
        list.add(new Brand("Gretsch", "Catalina"));
        list.add(new Brand("Ludwig", "Legacy"));
        list.add(new Brand("Sonor", "ProLite"));
        list.add(new Brand("Yamaha", "Stage Custom"));
        list.add(new Brand("DDrum", "Flyer"));
    }

    public ArrayList<Brand> getList() {return new ArrayList<Brand>(list);}
}
