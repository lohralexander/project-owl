package org.lohr.owl.backend;

import org.lohr.owl.backend.challenge.Challenge;
import org.lohr.owl.backend.challengedeck.ChallengeDeck;
import org.lohr.owl.backend.data.DataProvider;
import org.lohr.owl.backend.playerdeck.Attribute;
import org.lohr.owl.backend.playerdeck.PlayerCard;
import org.lohr.owl.backend.playerdeck.PlayerDeck;

import java.util.*;

public class Runner {
    public static Map run() {
        Map<Attribute, Double> result = new HashMap<>();
        ChallengeDeck challengeDeck = new ChallengeDeck();
        PlayerDeck playerDeck = new PlayerDeck();
        ArrayList<PlayerCard> playerCards = new ArrayList<>();
        List<Attribute> attributes = Arrays.asList(Attribute.STRENGTH, Attribute.CONSTITUTION, Attribute.DEXTERITY, Attribute.CHARISMA, Attribute.WISDOM, Attribute.INTELLIGENCE);

        playerCards.addAll(DataProvider.getHumanRacePlayerCards());
        playerCards.addAll(DataProvider.getBasicPlayerCards());
        playerCards.addAll(DataProvider.getCharacterPlayerCards());
        playerCards.addAll(DataProvider.getSpecialisationPlayerCards());
        playerDeck.setPlayerCards(playerCards);

        challengeDeck.setChallengeCards(DataProvider.getChallengeCards());

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
            result.put(attribute, successPercentage);
            //System.out.println("Average success for " + attribute + ": " + successPercentage);

        }
        return result;
    }
}
