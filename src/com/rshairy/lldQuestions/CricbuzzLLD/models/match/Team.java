package com.rshairy.lldQuestions.CricbuzzLLD.models.match;

import com.rshairy.lldQuestions.CricbuzzLLD.controller.BattingController;
import com.rshairy.lldQuestions.CricbuzzLLD.controller.BowlingController;
import com.rshairy.lldQuestions.CricbuzzLLD.models.player.Player;

import java.util.List;
import java.util.Queue;

public class Team {
    public boolean isWinner;
    String name;
    Queue<Player> playingElvenQueue;
    List<Player> benchPlayers;

    BattingController battingController;
    BowlingController bowlingController;

    public Team(String name, Queue<Player> playingElvenQueue, List<Player> benchPlayers, List<Player> bowlers) {
        this.name = name;
        this.playingElvenQueue = playingElvenQueue;
        this.benchPlayers = benchPlayers;
        this.battingController = new BattingController(playingElvenQueue);
        this.bowlingController = new BowlingController(bowlers);
    }

    public String getName() {
        return name;
    }

    public Queue<Player> getPlayingElvenQueue() {
        return playingElvenQueue;
    }

    public List<Player> getBenchPlayers() {
        return benchPlayers;
    }

    public BattingController getBattingController() {
        return battingController;
    }

    public BowlingController getBowlingController() {
        return bowlingController;
    }

    public int getTotalRuns() {
        return playingElvenQueue.stream().mapToInt(p -> p.getBattingScoreCard().getTotalRun()).sum();
    }

    public void printScoreCard() {
    }

    public void printBowlingScoreCard() {
    }

    public void chooseNextBatsman() throws Exception {
        battingController.getNextPlayer();
    }

    public void chooseNextBowler() {
    }

    public Player getCurrentBowler() {
    }

    public Player getStriker() {
        return battingController.getStriker();
    }

    public void setNonStriker(Player temp) {
        battingController.setNonStriker(temp);
    }

    public Player getNonStriker() {
        return battingController.getNonStriker();
    }

    public void setStriker(Player player) {
        battingController.setStriker(player);
    }
}
