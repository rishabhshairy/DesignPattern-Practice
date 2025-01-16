package com.rshairy.lldQuestions.CricbuzzLLD.models.match;

import com.rshairy.lldQuestions.CricbuzzLLD.models.enums.BallType;
import com.rshairy.lldQuestions.CricbuzzLLD.models.enums.RunType;
import com.rshairy.lldQuestions.CricbuzzLLD.models.player.Player;
import com.rshairy.lldQuestions.CricbuzzLLD.scoreObserver.ScoreUpdater;

import java.util.List;

public class Ball {
    int ballNumber;
    Player playedBy;
    Player bowledBy;
    List<ScoreUpdater> scoreUpdaters;
    BallType ballType;
    RunType runType;

    public Ball(int _ballNumber) {
        this.ballNumber = _ballNumber;
    }

    void startBall(){

    }


    public void startBallDelivery(Team battingTeam, Team bowlingTeam, Over over) {
        this.playedBy = battingTeam.getStriker();
        this.bowledBy = over.bowledBy;

        ballType = BallType.NORMAL;

        if (isWicketTaken()){

        } else {
            runType = getRunType();

            // swap striker and non striker if run 1 or 3
            Player temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }
    }

    private RunType getRunType() {

        double val = Math.random();
        if (val <= 0.2) {
            return RunType.SINGLE;
        } else if (val >= 0.3 && val <= 0.5) {
            return RunType.DOUBLE;
        } else if (val >= 0.6 && val <= 0.8) {
            return RunType.FOUR;
        } else {
            return RunType.SIX;
        }
    }

    private boolean isWicketTaken() {
        //random function return value between 0 and 1
        if (Math.random() < 0.2) {
            return true;
        } else {
            return false;
        }
    }
}
