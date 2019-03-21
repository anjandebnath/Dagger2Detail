package com.user06.dagger_2tutorial.dependency_inversion_principle.good_practice;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.List;

public class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {

        this.developers = developers;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void implement() {

        developers.forEach(d->d.develop());
    }

}


/**
 * in order to tackle the violation of the first part would be to refactor
 * the Project class so that it will not depend on the FrontEndDeveloper and the BackendDeveloper class.
 */


/**
 * Project class does not depend on lower level modules but abstractions.
 * Also low-level modules and their details depend on abstractions.
 */
