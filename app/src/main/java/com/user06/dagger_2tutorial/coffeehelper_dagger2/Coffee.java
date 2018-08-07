package com.user06.dagger_2tutorial.coffeehelper_dagger2;

/**
 * Created by Anjan Debnath on 8/7/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
public class Coffee {

    FLAVORS flavor;

    public Coffee(FLAVORS flavor) {
        this.flavor = flavor;
    }

    public enum FLAVORS{
        AMERICANO,
        ESPRESSO,
        LATTE
    }

    public FLAVORS getFlavor(){
        FLAVORS myFlavor = null;
        switch (flavor){
            case LATTE:
                myFlavor = FLAVORS.LATTE;
                break;
            case ESPRESSO:
                myFlavor = FLAVORS.ESPRESSO;
                break;
                default:
                    myFlavor =  FLAVORS.AMERICANO;
        }
        return myFlavor;
    }
}
