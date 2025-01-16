package com.rshairy.lldQuestions.CricbuzzLLD.models.match;

public class T20Match implements MatchType{
    @Override
    public int numberOfOvers() {
        return 20;
    }

    @Override
    public int maxOversAllowed() {
        return 4;
    }
}
