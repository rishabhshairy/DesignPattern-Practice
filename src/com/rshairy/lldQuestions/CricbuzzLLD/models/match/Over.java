package com.rshairy.lldQuestions.CricbuzzLLD.models.match;

import com.rshairy.lldQuestions.CricbuzzLLD.models.player.Player;

import java.util.List;

public class Over {
    int overNumber;
    List<Ball> balls;
    Player bowledBy;
    int extraBalls;

    public Over(int overNumber, Player currentBowler) {
        this.overNumber = overNumber;
        this.bowledBy = currentBowler;
    }

    boolean startOver(Team battingTeam, Team bowlingTeam, int runsToWin) {
        int ballCount = 1;
        while (ballCount <= 6) {
            Ball currentBall = new Ball(ballCount);
            currentBall.startBallDelivery(battingTeam,bowlingTeam,this);
        }
    }
}
