package com.user06.dagger_2tutorial.single_responsibility_principle.bad_practice;

import com.user06.dagger_2tutorial.single_responsibility_principle.User;

public class UserSettingService {

    public void changeEmail(User user)
    {
        if(checkAccess(user))
        {
            //Grant option to change
        }
    }
    public boolean checkAccess(User user)
    {
        //Verify if the user is valid.
        return true;
    }
}


/**
 * All looks good, until you would want to reuse the checkAccess code at some other place
 * OR
 * you want to make changes to the way checkAccess is being done
 * OR
 * you want to make change to the way email changes are being approved.
 *
 *
 * In all the later 2 cases you would end up changing the same class and in the first case
 * you would have to use UserSettingService to check for access as well, which is unnecessary.
 */
