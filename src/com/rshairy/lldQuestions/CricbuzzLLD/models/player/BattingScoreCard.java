package com.rshairy.lldQuestions.CricbuzzLLD.models.player;

/**
 * This belongs to each Playeyr
 */
public class BattingScoreCard {
    int totalRun;
    int totalBalls;
    int totalFours;
    int totalSix;
    double strikeRate;

    public int getTotalRun() {
        return totalRun;
    }

    public void setTotalRun(int totalRun) {
        this.totalRun = totalRun;
    }

    public int getTotalBalls() {
        return totalBalls;
    }

    public void setTotalBalls(int totalBalls) {
        this.totalBalls = totalBalls;
    }

    public int getTotalFours() {
        return totalFours;
    }

    public void setTotalFours(int totalFours) {
        this.totalFours = totalFours;
    }

    public int getTotalSix() {
        return totalSix;
    }

    public void setTotalSix(int totalSix) {
        this.totalSix = totalSix;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }
}
