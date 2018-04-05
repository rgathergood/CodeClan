package com.example.rgathergood.drumbrandslist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rgathergood on 20/03/2018.
 */

public class TestAllBrands {

    @Test
    public void before() {
        AllBrands allBrands = new AllBrands();
        assertEquals(8, allBrands.getList().size());
    }
}
