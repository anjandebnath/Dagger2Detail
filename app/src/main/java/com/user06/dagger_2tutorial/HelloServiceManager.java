package com.user06.dagger_2tutorial;

/**
 * Created by Anjan Debnath on 11/23/2017.
 * Copyright (c) 2017, W3 Engineers Ltd. All rights reserved.
 */

public class HelloServiceManager implements HelloService{
    @Override
    public String greet(String userName) {
        return "Hello " + userName + "!";
    }
}
