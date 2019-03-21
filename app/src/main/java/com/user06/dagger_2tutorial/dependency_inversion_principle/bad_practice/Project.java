package com.user06.dagger_2tutorial.dependency_inversion_principle.bad_practice;

public class Project {

    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public void implement() {

        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}

/**
 * So as we can see the Project class is a high level module and it depends on low level modules
 * such as BackEndDeveloper and FrontEndDeveloper.
 *
 * We are actually violating the first part of the dependency inversion principle.
 */


/**
 * Also by the inspecting the implement function of the Project.class we realise that
 * the methods writeJava and writeJavascript are methods bound to the corresponding classes.
 *
 * Regarding the project scope those are details since in both cases they are forms of development.
 * Thus the second part of the dependency inversion principle is violated.
 */
