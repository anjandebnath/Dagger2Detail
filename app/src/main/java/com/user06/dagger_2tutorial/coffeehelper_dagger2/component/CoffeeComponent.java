package com.user06.dagger_2tutorial.coffeehelper_dagger2.component;

import com.user06.dagger_2tutorial.coffeehelper_dagger2.ResturantAConstructorInjection;
import com.user06.dagger_2tutorial.coffeehelper_dagger2.module.CoffeeProvider;

import dagger.Component;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */


// region readme
    /*
      Component can be regarded as a bridge between module and dependent classes
      Component takes the modules and then gives the dependency back to the dependent classes.
     */
// endregion readme
@Component(modules = {CoffeeProvider.class})
public interface CoffeeComponent {

    /**
     *
     * Any dependent class must be declared in this manner.
     */
    void injectCoffeeHelper(ResturantAConstructorInjection resturantA);


}
