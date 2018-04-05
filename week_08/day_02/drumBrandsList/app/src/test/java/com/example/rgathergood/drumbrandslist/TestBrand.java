package com.example.rgathergood.drumbrandslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rgathergood on 20/03/2018.
 */

public class TestBrand {

    Brand brand;

    @Before
    public void before() {
        brand = new Brand("Pearl", "Reference");
    }

    @Test
    public void getBrandName() {
        assertEquals("Pearl", brand.getName());
    }

    @Test
    public void getBrandModel() {
        assertEquals("Reference", brand.getModel());
    }
}

