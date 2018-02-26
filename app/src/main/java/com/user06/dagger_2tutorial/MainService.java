package com.user06.dagger_2tutorial;

import javax.inject.Inject;

/**
 * Created by Anjan Debnath on 2/15/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */

public class MainService {
    private RestService restService;

    //constructor injection
    @Inject
    public MainService(RestService restService){
        this.restService = restService;
    }

    public void doSomething() {
        String s = restService.getSomething();
    }
}
