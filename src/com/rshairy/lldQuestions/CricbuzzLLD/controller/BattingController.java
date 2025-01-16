package com.rshairy.lldQuestions.CricbuzzLLD.controller;

import com.rshairy.lldQuestions.CricbuzzLLD.models.player.Player;

import java.util.Queue;

public class BattingController {


    Queue<Player> yetToPlay;
    Player striker;
    Player nonStriker;

    public BattingController(Queue<Player> playingElvenQueue) {
        this.yetToPlay = playingElvenQueue;
    }

    public void getTotalRuns() {
    }

    public Player getStriker() {
        return striker;
    }

    public Player getNonStriker() {
        return nonStriker;
    }

    public void getNextPlayer() throws Exception {
        if (yetToPlay.isEmpty()) {
            throw new Exception();
        }

        if (striker == null) {
            striker = yetToPlay.poll();
        }
        if (nonStriker == null) {
            nonStriker = yetToPlay.poll();
        }
    }

    public void setNonStriker(Player temp) {
        nonStriker = temp;
    }

    public void setStriker(Player player) {
        striker = player;
    }
}
