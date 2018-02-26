package com.user06.dagger_2tutorial.module;

import android.app.Application;

import com.user06.dagger_2tutorial.DaggerApplication;
import com.user06.dagger_2tutorial.HelloService;
import com.user06.dagger_2tutorial.HelloServiceManager;
import com.user06.dagger_2tutorial.RestService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Anjan Debnath on 11/23/2017.
 * Copyright (c) 2017, W3 Engineers Ltd. All rights reserved.
 */

//A dagger module provides the way that constructs the objects which will be injected.
@Module
public class MainModule {

    DaggerApplication app;

    public MainModule(DaggerApplication application){
          app = application;
    }

    // provider provide methods that return the instances
    @Provides
    @Singleton
    protected Application provideApplication(){
        return app;
    }

    @Provides
    @Singleton
    HelloService provideHelloService() {
        return new HelloServiceManager();
    }

    @Provides
    @Singleton
    RestService provideRestService(){
        return new RestService();
    }


}
