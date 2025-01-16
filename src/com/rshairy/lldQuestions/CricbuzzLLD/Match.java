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
    Innings[] innings;
    MatchType matchType;
    Team tossWinner;

    void start() {

    }
}
