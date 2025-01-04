package com.rshairy.designs.CommandDesignPattern.CopyPasteEx.commands;

import com.rshairy.designs.CommandDesignPattern.CopyPasteEx.Editor;

public abstract class ICommand {
    public Editor editor;
    private String backup;

    public ICommand(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
