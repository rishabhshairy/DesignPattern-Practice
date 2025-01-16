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

    void startBall(){

    }


}
