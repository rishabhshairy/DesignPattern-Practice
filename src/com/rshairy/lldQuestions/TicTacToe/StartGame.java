package com.rshairy.lldQuestions.TicTacToe;

public class StartGame {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame(2);
        System.out.println(game.start());
    }
}
