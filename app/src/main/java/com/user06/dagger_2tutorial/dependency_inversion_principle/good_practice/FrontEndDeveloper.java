package com.user06.dagger_2tutorial.dependency_inversion_principle.good_practice;

public class FrontEndDeveloper implements Developer{

    @Override
    public void develop() {
        writeJavascript();
    }

    private void writeJavascript() {
    }
}
