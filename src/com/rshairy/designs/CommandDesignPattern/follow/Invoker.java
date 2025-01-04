package com.rshairy.designs.CommandDesignPattern.follow;

public class Invoker {
    ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void invokeCommand() {
        this.command.execute();
    }
}
