package com.user06.dagger_2tutorial.coffeehelper_dagger2;

import javax.inject.Inject;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class CoffeeHelper {

    int waterQuantity;
    Coffee.FLAVORS flavor;

    @Inject
    public CoffeeHelper(int waterQuantity, Coffee.FLAVORS flavor) {
          this.waterQuantity = waterQuantity;
          this.flavor = flavor;
    }

    public CoffeeBrewer getCoffeeBrewer() {
        Water water = new Water(waterQuantity);
        Coffee coffee = new Coffee(flavor);
        return new CoffeeBrewer(water, coffee);
    }
}
