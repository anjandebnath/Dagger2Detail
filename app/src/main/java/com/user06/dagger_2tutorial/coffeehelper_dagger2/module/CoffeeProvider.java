package com.user06.dagger_2tutorial.coffeehelper_dagger2.module;

import com.user06.dagger_2tutorial.coffeehelper_dagger2.Coffee;
import com.user06.dagger_2tutorial.coffeehelper_dagger2.CoffeeHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */


//region readme
/**
 * By default, Dagger doesn’t know how to create objects
 * Module is a place where Dagger looks up for the proper way to instantiate an object.
 */
//endregion readme
@Module
public class CoffeeProvider {

    //region readme
    /**
     * @Provides = this method will provide a way to instantiate an object
     */
    //endregion readme
    @Provides
    public int getWaterQuantity(){
        return 10;
    }

    @Provides
    public Coffee.FLAVORS getCoffeeFlavors(){
        return Coffee.FLAVORS.ESPRESSO;
    }
}
