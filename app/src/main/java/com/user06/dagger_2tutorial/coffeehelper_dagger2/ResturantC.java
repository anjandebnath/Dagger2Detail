package com.user06.dagger_2tutorial.coffeehelper_dagger2;

import javax.inject.Inject;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class ResturantC {

    public static final int waterQuantity = 15;
    public static final Coffee.FLAVORS flavor = Coffee.FLAVORS.AMERICANO;

    //region readme
    //@Inject = Hey Dagger, I want an instance of CoffeeHelper, So please provide me the instance
    //endregion readme
    @Inject
    public CoffeeHelper coffeeHelper; //Dagger does not support injection into private fields
    private CoffeeBrewer coffeeBrewer;

    public ResturantC() {
        coffeeBrewer = coffeeHelper.getCoffeeBrewer(waterQuantity, flavor);
    }


    public void brewCoffee(){
        coffeeBrewer.brewCoffee();
    }
}
