package com.user06.dagger_2tutorial.coffeehelper_dagger2;

import android.util.Log;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class CoffeeBrewer {

    public static final String TAG = "TAG";

    private Coffee coffee;
    private Water water;
    private WaterHeater waterHeater;


    public CoffeeBrewer(Water water, Coffee coffee) {
        this.coffee = coffee;
        this.water = water;
        this.waterHeater = new WaterHeater(this.water);
    }

    public void brewCoffee(){
        waterHeater.on();
        waterHeater.off();
        Log.d(TAG, "Water:: " + water.isWaterHot() + "Flavor:: "+coffee.getFlavor());
        Log.d(TAG, "----------- Coffee is ready to be served ---------------------");
    }
}
