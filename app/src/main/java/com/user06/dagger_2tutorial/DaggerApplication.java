package com.user06.dagger_2tutorial;

import android.app.Application;

import com.user06.dagger_2tutorial.component.DaggerComponent;

/**
 * Created by Anjan Debnath on 11/23/2017.
 * Copyright (c) 2017, W3 Engineers Ltd. All rights reserved.
 */

public class DaggerApplication extends Application {

    private static DaggerComponent component;
    private static DaggerApplication instance;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        createComponent();
    }
    public static DaggerComponent getComponent() {
        return component;
    }

    public static void createComponent() {
        component = DaggerComponent.Initializer.init(instance);
    }
}
