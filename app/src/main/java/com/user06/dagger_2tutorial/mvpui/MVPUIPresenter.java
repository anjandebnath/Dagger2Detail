package com.user06.dagger_2tutorial.mvpui;

/**
 * Created by Anjan Debnath on 2/16/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */

public class MVPUIPresenter implements MVPUIContract.Presenter {

    private MVPUIContract.View view;

    public MVPUIPresenter(MVPUIContract.View view) {
        this.view = view;
    }

    @Override
    public void loadMessage() {

    }

    @Override
    public void saveName(String firstName, String lastName) {

    }
}
