package com.user06.dagger_2tutorial.coffeehelper;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class ResturantC {

    public static final int waterQuantity = 15;
    public static final Coffee.FLAVORS flavor = Coffee.FLAVORS.AMERICANO;

    private CoffeeHelper coffeeHelper;
    private CoffeeBrewer coffeeBrewer;

    public ResturantC() {
        this.coffeeHelper = new CoffeeHelper();
        coffeeBrewer = coffeeHelper.getCoffeeBrewer(waterQuantity, flavor);
    }


    public void brewCoffee(){
        coffeeBrewer.brewCoffee();
    }
}
