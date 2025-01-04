package com.rshairy.designs.CommandDesignPattern.CopyPasteEx.commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<ICommand> history = new Stack<>();

    public void push(ICommand c) {
        history.push(c);
    }

    public ICommand pop(){
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
