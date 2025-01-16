package com.rshairy.lldQuestions.CricbuzzLLD;

import com.rshairy.lldQuestions.CricbuzzLLD.models.enums.PlayerType;
import com.rshairy.lldQuestions.CricbuzzLLD.models.match.MatchType;
import com.rshairy.lldQuestions.CricbuzzLLD.models.match.T20Match;
import com.rshairy.lldQuestions.CricbuzzLLD.models.match.Team;
import com.rshairy.lldQuestions.CricbuzzLLD.models.player.Person;
import com.rshairy.lldQuestions.CricbuzzLLD.models.player.Player;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Application obj = new Application();
        Team teamA = obj.addTeam("India");
        Team teamB = obj.addTeam("Australia");

        MatchType matchType = new T20Match();
        Match match = new Match(teamA,teamB,new Date(),"JSCA Stadium",matchType);
        match.start();
    }

    private Team addTeam(String teamName) {
        Queue<Player> players = new LinkedList<>();
        List<Player> bowlers = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            Player player = addPlayer(teamName + (i + 1), PlayerType.ALL_ROUNDER);
            players.add(player);
            if (i > 7) {
                bowlers.add(player);
            }
        }

        Team team = new Team(teamName, players, new ArrayList<Player>(), bowlers);
        return team;
    }

    private Player addPlayer(String name, PlayerType playerType) {
        Person person = new Person(name, 22, "address");
        Player player = new Player(person, playerType);
        return player;
    }
}
