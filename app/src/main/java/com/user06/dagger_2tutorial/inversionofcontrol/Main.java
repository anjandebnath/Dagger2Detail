package com.user06.dagger_2tutorial.inversionofcontrol;

public class Main {


    public static void main(String args[]){

        SpellChecker sc = new SpellChecker(); // dependency
        TextEditorIOC textEditor = new TextEditorIOC(sc);
    }

}
