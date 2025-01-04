package com.rshairy.designs.CommandDesignPattern.CopyPasteEx.commands;

import com.rshairy.designs.CommandDesignPattern.CopyPasteEx.Editor;

public class PasteCommand extends ICommand {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) {
            return false;
        }
        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
