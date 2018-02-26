package com.user06.dagger_2tutorial.mvpui_dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.user06.dagger_2tutorial.R;

import javax.inject.Inject;

/**
 * Created by Anjan Debnath on 2/16/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */

public class MVPUIActivity extends AppCompatActivity implements MVPUIContract.View {

    @Inject
    MVPUIPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvpui);

        // Creates presenter
        DaggerMVPUIDaggerComponent.builder()
                .mVPUIPresenterModule(new MVPUIPresenterModule(this))
                .build()
                .injectTo(this);

        presenter.loadMessage();

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(String error) {

    }
}
