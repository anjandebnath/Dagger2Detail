package com.user06.dagger_2tutorial.mvpui_dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Anjan Debnath on 2/16/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
@Module
public class MVPUIPresenterModule {

    private MVPUIContract.View view;
    public MVPUIPresenterModule(MVPUIContract.View view){
        this.view = view;
    }

    @Provides
    public MVPUIContract.View getView(){
       return view;
    }
}
