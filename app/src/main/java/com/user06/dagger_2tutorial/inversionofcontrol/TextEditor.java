package com.user06.dagger_2tutorial.inversionofcontrol;

public class TextEditor {

    private SpellChecker checker;

    public TextEditor() {
        this.checker = new SpellChecker();
    }

}

/**
 * In this code example we are instantiating SpellChecker
 * (this.checker = new SpellChecker();), which means the TextEditor class
 * directly depends on the SpellChecker class.
 */



