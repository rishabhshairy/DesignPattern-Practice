package com.rshairy.lldQuestions.CricbuzzLLD.models.match;

import java.util.ArrayList;
import java.util.List;

public class Innings {
    Team battingTeam;
    Team bowlingTeam;
    List<Over> overs;
    MatchType matchType;

    public Innings(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        overs = new ArrayList<>();
    }

    public void startInnings(int runsToWin) {

        // set batsman
        try {
            battingTeam.chooseNextBatsman();
        } catch (Exception e) {
            System.err.println();
        }

        // set overs
        int totalOvers = matchType.numberOfOvers();

        // start bowling now
        for (int overNumber = 1; overNumber <= totalOvers; overNumber++) {
            bowlingTeam.chooseNextBowler();

            Over currentOver = new Over(overNumber, bowlingTeam.getCurrentBowler());
            overs.add(currentOver);

            try {
                boolean won = currentOver.startOver(battingTeam,bowlingTeam,runsToWin);
                if (won){
                    break;
                }
            } catch (Exception e){
                break;
            }
        }
    }

    public int getTotalRuns() {
        return battingTeam.getTotalRuns();
    }
}
