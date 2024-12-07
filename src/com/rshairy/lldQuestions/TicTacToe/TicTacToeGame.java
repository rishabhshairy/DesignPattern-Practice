package com.rshairy.lldQuestions.TicTacToe;

import com.rshairy.lldQuestions.TicTacToe.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame(int n) {
        init(n);
    }

    private void init(int n) {
        // here n is number of players
        players = new LinkedList<>();

        // Define players
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player(crossPiece, "Player1");

        PlayingPieceO noughtPiece = new PlayingPieceO();
        Player player2 = new Player(noughtPiece, "Player2");

        players.add(player1);
        players.add(player2);

        // initialize board
        gameBoard = new Board(3);
    }

    public String start() {
        boolean noWinner = true;

        // play game till we find winner
        while (noWinner) {
            Player currPlayer = players.removeFirst();

            gameBoard.printBoard();
            List<Pair> freeSpaces = gameBoard.getFreeSpaces();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // read user input for game
            System.out.print("Player:" + currPlayer.getName() + " Enter [row,column]:");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine(); // add input of row,col
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputCol = Integer.parseInt(values[1]);

            if (inputRow >= gameBoard.size || inputCol >= gameBoard.size) {
                System.out.println("Incorrect position, please enter size between 0 & " + (gameBoard.size - 1));
                players.addFirst(currPlayer);
                continue;
            }

            // place the piece
            boolean isPieceAdded = gameBoard.addPiece(inputRow, inputCol, currPlayer.getPlayingPiece());
            if (!isPieceAdded) {
                // player entered wrong position, ask to try again
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(currPlayer);
                continue;
            }
            // add current player to last if piece is placed successfully
            players.addLast(currPlayer);

            boolean winner = findWinner(inputRow, inputCol, currPlayer.getPlayingPiece().pieceType);
            if (winner) {
                return "Winner is :" + currPlayer.getName() + " !!!!";
            }
        }

        return "tie";
    }

    private boolean findWinner(int inputRow, int inputCol, PieceType placedPieceType) {
        // check in all 4 direction
        boolean rowCheck = true;
        boolean colCheck = true;
        boolean diagonalCheck = true;
        boolean antiDiagonalCheck = true;

        // check all rows
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[inputRow][i] == null || gameBoard.board[inputRow][i].pieceType != placedPieceType) {
                rowCheck = false;
            }
        }

        // check all columns
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][inputCol] == null || gameBoard.board[i][inputCol].pieceType != placedPieceType) {
                colCheck = false;
            }
        }

        // check diagonal
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != placedPieceType) {
                diagonalCheck = false;
            }
        }

        // antiDiagonalCheck
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size && j >= 0; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != placedPieceType) {
                antiDiagonalCheck = false;
            }
        }

        return rowCheck || colCheck || diagonalCheck || antiDiagonalCheck;
    }
}
