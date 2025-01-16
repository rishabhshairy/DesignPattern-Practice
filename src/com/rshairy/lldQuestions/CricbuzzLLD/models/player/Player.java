package com.rshairy.lldQuestions.CricbuzzLLD.models.player;

import com.rshairy.lldQuestions.CricbuzzLLD.models.enums.PlayerType;

public class Player {
    Person person;
    PlayerType playerType;
    BattingScoreCard battingScoreCard;
    BowlingScoreCard bowlingScoreCard;

    public Player(Person person, PlayerType playerType) {
        this.person = person;
        this.playerType = playerType;
    }

    public Person getPerson() {
        return person;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public BattingScoreCard getBattingScoreCard() {
        return battingScoreCard;
    }

    public BowlingScoreCard getBowlingScoreCard() {
        return bowlingScoreCard;
    }
}
