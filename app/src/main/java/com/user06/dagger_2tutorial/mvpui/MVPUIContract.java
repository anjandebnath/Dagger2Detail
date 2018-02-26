package com.user06.dagger_2tutorial.mvpui;

/**
 * Created by Anjan Debnath on 2/16/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */

public interface MVPUIContract {

    interface Presenter {
        void loadMessage();

        void saveName(String firstName, String lastName);
    }

    interface View {
        void showMessage(String message);

        void showError(String error);
    }
}
