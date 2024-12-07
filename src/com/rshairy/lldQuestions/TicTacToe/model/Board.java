package com.rshairy.lldQuestions.TicTacToe.model;

import com.rshairy.lldQuestions.TicTacToe.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    // add piece to baord
    public boolean addPiece(int row, int col, PlayingPiece piece) {
        if (board[row][col] != null) {
            return false;
        }
        board[row][col] = piece;
        return true;
    }


    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "    ");
                } else {
                    System.out.print("    ");
                }
                System.out.print("  |  ");
            }
            System.out.println();
        }
    }

    public List<Pair> getFreeSpaces() {
        List<Pair> freeSpaces = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeSpaces.add(new Pair(i, j));
                }
            }
        }
        return freeSpaces;
    }
}
