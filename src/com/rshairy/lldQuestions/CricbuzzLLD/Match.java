package com.rshairy.lldQuestions.CricbuzzLLD;

import com.rshairy.lldQuestions.CricbuzzLLD.models.match.Innings;
import com.rshairy.lldQuestions.CricbuzzLLD.models.match.MatchType;
import com.rshairy.lldQuestions.CricbuzzLLD.models.match.Team;

import java.util.Date;

public class Match {
    Team teamA;
    Team teamB;
    Date matchDate;
    String venue;
    Innings[] inningDetails;
    MatchType matchType;
    Team tossWinner;

    public Match(Team teamA, Team teamB, Date date, String venue, MatchType matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = date;
        this.venue = venue;
        this.matchType = matchType;
    }

    void start() {

        // Toss
        tossWinner = toss(teamA, teamB);

        // start the innings
        for (int currentInning = 1; currentInning <= 2; currentInning++) {
            Innings innings;
            Team bowlingTeam;
            Team battingTeam;

            // Assuming Toss winner will bat
            if (currentInning == 1) {
                battingTeam = tossWinner;
                bowlingTeam = tossWinner.getName().equals(teamA.getName()) ? teamB : teamA;
                innings = new Innings(battingTeam, bowlingTeam, matchType);
                innings.startInnings(-1);
            } else {
                battingTeam = tossWinner.getName().equals(teamA.getName()) ? teamB : teamA;
                bowlingTeam = tossWinner;
                innings = new Innings(battingTeam, bowlingTeam, matchType);
                innings.startInnings(inningDetails[0].getTotalRuns());
                if (bowlingTeam.getTotalRuns() > battingTeam.getTotalRuns()){
                    bowlingTeam.isWinner = true;
                }
            }

            // show current inning details
            inningDetails[currentInning-1] = innings;

            System.out.println();
            System.out.println("INNING " + innings + " -- total Run: " + battingTeam.getTotalRuns());
            System.out.println("---Batting ScoreCard : " + battingTeam.getName() + "---");

            battingTeam.printScoreCard();

            System.out.println();
            System.out.println("---Bowling ScoreCard : " + bowlingTeam.getName() + "---");
            bowlingTeam.printBowlingScoreCard();
        }

        System.out.println();
        if (teamA.isWinner) {
            System.out.println();
        } else {

        }
    }

    private Team toss(Team teamA, Team teamB) {
        int tossVal = (int) Math.random();
        if (tossVal < 0.5) {
            return teamA;
        }
        return teamB;
    }
}
