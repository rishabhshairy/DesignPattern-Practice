package com.rshairy.designs.CommandDesignPattern.CopyPasteEx;

import com.rshairy.designs.CommandDesignPattern.CopyPasteEx.commands.CommandHistory;

import java.util.List;
import java.util.Stack;

public class Application {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
