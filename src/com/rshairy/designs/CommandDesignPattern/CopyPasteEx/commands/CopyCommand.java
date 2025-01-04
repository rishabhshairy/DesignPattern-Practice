package com.rshairy.designs.CommandDesignPattern.CopyPasteEx.commands;

import com.rshairy.designs.CommandDesignPattern.CopyPasteEx.Editor;

public class CopyCommand extends ICommand {


    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return true;
    }
}
