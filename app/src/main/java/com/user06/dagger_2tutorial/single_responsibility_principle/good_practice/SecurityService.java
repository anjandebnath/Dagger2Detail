package com.user06.dagger_2tutorial.single_responsibility_principle.good_practice;

import com.user06.dagger_2tutorial.single_responsibility_principle.User;

public class SecurityService {

    public static boolean checkAccess(User user)
    {
        //check the access.
        return true;
    }
}
