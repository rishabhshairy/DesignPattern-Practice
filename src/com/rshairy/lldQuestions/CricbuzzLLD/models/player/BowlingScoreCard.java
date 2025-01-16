package com.rshairy.lldQuestions.CricbuzzLLD.models.player;

/**
 * This belongs to each Player
 */
public class BowlingScoreCard {
    int totalOverBowled;
    int runsGiven;
    int wicketTaken;
    int wide;
    int noBalls;
    double economy;

    public int getTotalOverBowled() {
        return totalOverBowled;
    }

    public void setTotalOverBowled(int totalOverBowled) {
        this.totalOverBowled = totalOverBowled;
    }

    public int getRunsGiven() {
        return runsGiven;
    }

    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }

    public int getWicketTaken() {
        return wicketTaken;
    }

    public void setWicketTaken(int wicketTaken) {
        this.wicketTaken = wicketTaken;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public int getNoBalls() {
        return noBalls;
    }

    public void setNoBalls(int noBalls) {
        this.noBalls = noBalls;
    }

    public double getEconomy() {
        return economy;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }
}
