package com.user06.dagger_2tutorial.mvpui_dagger2;

import dagger.Component;

/**
 * Created by Anjan Debnath on 2/16/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */
@Component(modules = MVPUIPresenterModule.class)
public interface MVPUIDaggerComponent {

    MVPUIPresenter mpvUiPresenter();

    void injectTo(MVPUIActivity mvpuiActivity);
}
