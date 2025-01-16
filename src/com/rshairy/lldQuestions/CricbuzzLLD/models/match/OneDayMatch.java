package com.rshairy.lldQuestions.CricbuzzLLD.models.match;

public class OneDayMatch implements MatchType{
    @Override
    public int numberOfOvers() {
        return 50;
    }

    @Override
    public int maxOversAllowed() {
        return 10;
    }
}
