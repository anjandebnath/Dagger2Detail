package com.user06.dagger_2tutorial.coffeehelper_dagger2;

import com.user06.dagger_2tutorial.coffeehelper_dagger2.component.CoffeeComponent;
import com.user06.dagger_2tutorial.coffeehelper_dagger2.component.DaggerCoffeeComponent;

import javax.inject.Inject;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class ResturantAConstructorInjection {


    //region readme
    //@Inject = Hey Dagger, I want an instance of CoffeeHelper, So please provide me the instance
    //endregion readme
    @Inject
    public CoffeeHelper coffeeHelper;

    private CoffeeBrewer coffeeBrewer;


    public ResturantAConstructorInjection() {
        goDagger();
        coffeeBrewer = coffeeHelper.getCoffeeBrewer();
    }


    /**
     *  if no component is present we won’t get our dependency.
     */
    public void goDagger(){
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder().build();
        coffeeComponent.injectCoffeeHelper(this);
    }

    public String brewCoffee(CoffeeCallback coffeeCallback){
       return  coffeeBrewer.brewCoffee(coffeeCallback);
    }
}
