package com.rshairy.designs.CommandDesignPattern.CopyPasteEx.commands;

import com.rshairy.designs.CommandDesignPattern.CopyPasteEx.Editor;

public class UndoCommand extends ICommand{
    public UndoCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
