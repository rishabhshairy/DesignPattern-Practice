package com.rshairy.designs.CommandDesignPattern.CopyPasteEx.commands;

import com.rshairy.designs.CommandDesignPattern.CopyPasteEx.Editor;

public class CutCommand extends ICommand {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) {
            return false;
        }
        backup();
        String src = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(src));
        return false;
    }

    private String cutString(String src) {
        String start = src.substring(0, editor.textField.getSelectionStart());
        String end = src.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
