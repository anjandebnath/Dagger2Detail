package com.user06.dagger_2tutorial.coffeehelper;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class CoffeeHelper {

    public CoffeeHelper() {

    }

    public CoffeeBrewer getCoffeeBrewer(int waterQuantity, Coffee.FLAVORS flavor) {
        Water water = new Water(waterQuantity);
        Coffee coffee = new Coffee(flavor);
        return new CoffeeBrewer(water, coffee);
    }
}
