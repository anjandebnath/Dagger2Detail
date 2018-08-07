package com.user06.dagger_2tutorial.coffeehelper_dagger2;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class Coffee {


    public Coffee(FLAVORS flavor) {
    }

    public enum FLAVORS{
        AMERICANO,
        ESPRESSO,
        LATTE
    }

    public FLAVORS getFlavor(){
        return FLAVORS.ESPRESSO;
    }
}
