package com.user06.dagger_2tutorial.coffeehelper;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class ResturantA {

    public static final int waterQuantity = 10;
    public static final Coffee.FLAVORS flavor = Coffee.FLAVORS.ESPRESSO;

    private CoffeeHelper coffeeHelper;
    private CoffeeBrewer coffeeBrewer;

    public ResturantA() {
        this.coffeeHelper = new CoffeeHelper();
        coffeeBrewer = coffeeHelper.getCoffeeBrewer(waterQuantity, flavor);
    }


    public void brewCoffee(){
        coffeeBrewer.brewCoffee();
    }
}
