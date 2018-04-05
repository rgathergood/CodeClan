package com.example.rgathergood.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rgathergood on 15/03/2018.
 */

public class BearTest {

    @Test
    public void canGetBearName() {
        Bear bear = new Bear("Yogi");
        assertEquals("Yogi", bear.getName());
    }
}
