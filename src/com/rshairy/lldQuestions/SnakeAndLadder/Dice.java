package com.rshairy.lldQuestions.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    final int min = 1;
    final int max = 1;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int sum = 0;
        int diceUsed = 0;
        while (diceUsed < diceCount) {
            sum += ThreadLocalRandom.current().nextInt(min, max + 1);
            diceUsed++;
        }
        return sum;
    }
}
