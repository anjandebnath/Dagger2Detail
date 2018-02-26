package com.user06.dagger_2tutorial.component;

import com.user06.dagger_2tutorial.DaggerApplication;
import com.user06.dagger_2tutorial.Main2Activity;
import com.user06.dagger_2tutorial.MainActivity;
import com.user06.dagger_2tutorial.MainService;
import com.user06.dagger_2tutorial.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Anjan Debnath on 11/23/2017.
 * Copyright (c) 2017, W3 Engineers Ltd. All rights reserved.
 */

// A dagger getComponent can be seen as an intermediate object
// which allows accessing to objects defined in Dagger modules.
    @Singleton
    @Component(modules = {MainModule.class})
public interface DaggerComponent {

    MainService mainService();
    void inject(MainActivity mainActivity);
    void inject(Main2Activity main2Activity);


    static final class Initializer {

        private Initializer(){

        }

        public static DaggerComponent init(DaggerApplication app){
          return  DaggerDaggerComponent
                  .builder()
                  .mainModule(new MainModule(app))
                  .build();
        }

    }
}
