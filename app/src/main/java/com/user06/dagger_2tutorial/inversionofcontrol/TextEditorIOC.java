package com.user06.dagger_2tutorial.inversionofcontrol;

public class TextEditorIOC {

    private IocSpellChecker checker;

    public TextEditorIOC(IocSpellChecker checker) {
        this.checker = checker;
    }
}


/**
 * In this code example we are creating an abstraction by having the
 * SpellChecker dependency class in TextEditor constructor signature (not initializing dependency in class).
 *
 *
 * This allows us to call the dependency then pass it to the TextEditor class:
 */