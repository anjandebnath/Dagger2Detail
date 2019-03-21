package com.user06.dagger_2tutorial.dependency_inversion_principle.good_practice;

public class BackEndDeveloper implements Developer{

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
    }

}
