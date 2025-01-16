package com.rshairy.lldQuestions.CricbuzzLLD.models.match;

import com.rshairy.lldQuestions.CricbuzzLLD.controller.BattingController;
import com.rshairy.lldQuestions.CricbuzzLLD.controller.BowlingController;
import com.rshairy.lldQuestions.CricbuzzLLD.models.player.Player;

import java.util.Queue;

public class Team {
    String name;
    Queue<Player> playingElvenQueue;
    Queue<Player> benchPlayers;

    BattingController battingController;
    BowlingController bowlingController;

    public Team(String name, Queue<Player> playingElvenQueue, Queue<Player> benchPlayers) {
        this.name = name;
        this.playingElvenQueue = playingElvenQueue;
        this.benchPlayers = benchPlayers;
        this.battingController = new BattingController();
        this.bowlingController = new BowlingController();
    }
}
