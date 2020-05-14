package org.lohr.owl.backend.application;

import org.lohr.owl.backend.challenge.Challenge;
import org.lohr.owl.backend.challengedeck.ChallengeDeck;
import org.lohr.owl.backend.playerdeck.Attribute;
import org.lohr.owl.backend.playerdeck.PlayerCard;
import org.lohr.owl.backend.playerdeck.PlayerDeck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public void run() {
        ChallengeDeck challengeDeck = new ChallengeDeck();
        PlayerDeck playerDeck = new PlayerDeck();
        ArrayList<PlayerCard> playerCards = new ArrayList<>();
        List<Attribute> attributes = Arrays.asList(Attribute.STRENGTH, Attribute.CONSTITUTION, Attribute.DEXTERITY, Attribute.CHARISMA, Attribute.WISDOM, Attribute.INTELLIGENCE);

        //playerCards.addAll(Main.getHumanRacePlayerCards());
        //playerCards.addAll(Main.getBasicPlayerCards());
        //playerCards.addAll(Main.getCharacterPlayerCards());
        //playerCards.addAll(Main.getSpecialicationPlayerCards());
        //playerDeck.setPlayerCards(playerCards);

        //challengeDeck.setChallengeCards(Main.getChallengeDeck());

        Challenge challenge = new Challenge(challengeDeck, playerDeck, false);
        double runs = 100000;
        for (Attribute attribute : attributes) {
            double successCounter = 0;
            for (int i = 0; i < runs; i++) {
                if (challenge.makeCheck(3, attribute)) {
                    successCounter++;
                }
            }
            double successPercentage = Math.round((successCounter / runs) * 100);
            System.out.println("Average success for " + attribute + ": " + successPercentage);
        }
    }
}
