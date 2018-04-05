package com.example.rgathergood.drumbrandslist;

import java.io.Serializable;

/**
 * Created by rgathergood on 20/03/2018.
 */

public class Brand implements Serializable {
    private String name;
    private String model;

    public Brand (String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
