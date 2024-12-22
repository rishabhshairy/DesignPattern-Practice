package com.rshairy.lldQuestions.SnakeAndLadder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new ArrayDeque<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(6, 5, 5);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player p1 = new Player("One", 0);
        Player p2 = new Player("Two", 0);
        players.add(p1);
        players.add(p2);
    }

    public void startGame() {
        while (winner == null) {
            // check who will play
            Player playerTurn = findPlayerTurn();
            System.out.println("Player turn == " + playerTurn.getId() + "  Current Position = " + playerTurn.getCurrentPosition());

            // roll the dice
            int diceNumber = dice.rollDice();

            // get new position for current player
            int newPosition = playerTurn.getCurrentPosition() + diceNumber;
            // check for jump -- snake or ladder
            newPosition = jumpCheck(newPosition);

            playerTurn.setCurrentPosition(newPosition);
            System.out.println("Player turn == " + playerTurn.getId() + "  New Position = " + playerTurn.getCurrentPosition());

            // check if winner
            if (newPosition >= board.cells.length * board.cells.length - 1) {
                winner = playerTurn;
            }
        }

        System.out.println("WINNER IS !!! " + winner.id);
    }

    private int jumpCheck(int newPosition) {
        int limit = board.cells.length * board.cells.length - 1;
        // return player if he crosses the board
        if (newPosition > limit) {
            return newPosition;
        }

        // find Cell of newPosition and return end of that
        Cell cell = board.getCell(newPosition);
        if (cell.jump != null && cell.jump.getStart() == newPosition) {
            // for clarification
            String jumpBy = cell.jump.getStart() < cell.jump.getEnd() ? "Ladder" : "Snake";
            System.out.println("Player Jumped by " + jumpBy);
            return cell.jump.getEnd();
        }

        // default return newPosition
        return newPosition;
    }

    private Player findPlayerTurn() {
        // remove player from first ana add back to queue
        Player current = players.removeFirst();
        players.addLast(current);
        return current;
    }
}
