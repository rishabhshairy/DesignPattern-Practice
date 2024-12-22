package com.rshairy.lldQuestions.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boardSize, int snakes, int ladders) {
        initializeCells(boardSize);
        addSnakesAndLadders(cells, snakes, ladders);
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesAndLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {


        int limit = cells.length * cells.length - 1;
        // first add snakes
        while (numberOfSnakes > 0) {
            // snake head should be greater than snake tail
            int snakeHead = ThreadLocalRandom.current().nextInt(1, limit);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, limit);

            if (snakeTail >= snakeHead) {
                continue;
            }

            // Since snake is a JUMP object
            Jump snake = new Jump();
            snake.setStart(snakeHead);
            snake.setEnd(snakeTail);

            // Place the snake inside Cell
            Cell cell = getCell(snakeHead);
            cell.jump = snake;

            numberOfSnakes--;
        }

        while (numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, limit);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, limit);

            if (ladderStart >= ladderEnd) {
                continue;
            }

            Jump ladder = new Jump();
            ladder.setStart(ladderStart);
            ladder.setEnd(ladderEnd);

            Cell cell = getCell(ladderStart);
            cell.jump = ladder;

            numberOfLadders--;
        }
    }

    protected Cell getCell(int snakeHead) {
        int row = snakeHead / cells.length;
        int col = snakeHead % cells.length;
        return cells[row][col];
    }


}
