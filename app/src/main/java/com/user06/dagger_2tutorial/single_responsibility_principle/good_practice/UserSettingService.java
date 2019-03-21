package com.user06.dagger_2tutorial.single_responsibility_principle.good_practice;

import com.user06.dagger_2tutorial.single_responsibility_principle.User;

import static com.user06.dagger_2tutorial.single_responsibility_principle.good_practice.SecurityService.checkAccess;

public class UserSettingService {

    public void changeEmail(User user)
    {
        if(SecurityService.checkAccess(user))
        {
            //Grant option to change
        }
    }
}


/**
 * to correct this is to decompose the UserSettingService into UserSettingService
 * and SecurityService. And move the checkAccess code into SecurityService.
 */
