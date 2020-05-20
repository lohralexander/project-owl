package org.lohr.owl.backend;

import org.lohr.owl.backend.challenge.Challenge;
import org.lohr.owl.backend.challengedeck.ChallengeDeck;
import org.lohr.owl.backend.data.DataComponent;
import org.lohr.owl.backend.data.DataProvider;
import org.lohr.owl.backend.playerdeck.Attribute;
import org.lohr.owl.backend.playerdeck.DeckNameEnum;
import org.lohr.owl.backend.playerdeck.PlayerDeck;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Runner {

    @Autowired
    private Runner() {
    }

    public static Map<Attribute, Double> run(DataComponent dataComponent, int amountCards) {
        Map<Attribute, Double> result = new EnumMap<>(Attribute.class);
        ChallengeDeck challengeDeck = new ChallengeDeck();
        PlayerDeck playerDeck = new PlayerDeck(DeckNameEnum.MAIN);
        List<Attribute> attributes = Arrays.asList(Attribute.STRENGTH, Attribute.CONSTITUTION, Attribute.DEXTERITY, Attribute.CHARISMA, Attribute.WISDOM, Attribute.INTELLIGENCE);

        for (DeckNameEnum deckNameEnum : dataComponent.getDeckNameEnums()) {
            playerDeck.mergeDecks(DataProvider.getDeck(deckNameEnum));
        }

        challengeDeck.setChallengeCards(dataComponent.getChallengeCards());

        Challenge challenge = new Challenge(challengeDeck, playerDeck, false);
        double runs = 10000;
        for (Attribute attribute : attributes) {
            double successCounter = 0;
            for (int i = 0; i < runs; i++) {
                if (challenge.makeCheck(amountCards, attribute)) {
                    successCounter++;
                }
            }
            double successPercentage = Math.round((successCounter / runs) * 100);
            result.put(attribute, successPercentage);
        }
        return result;
    }
}
