package org.lohr.owl.backend.data;

import org.lohr.owl.backend.challengedeck.Challenge;
import org.lohr.owl.backend.challengedeck.ChallengeCard;
import org.lohr.owl.backend.playerdeck.DeckName;
import org.lohr.owl.backend.playerdeck.PlayerCard;
import org.lohr.owl.backend.playerdeck.PlayerDeck;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataProvider {
    public static void main(String[] args) {
        getCharacterArrogantPlayerDeck();
    }

    public static PlayerDeck getBasicLightPlayerDeck() {
        DeckName deckname = DeckName.BASICLIGHT;
        PlayerDeck playerDeck = new PlayerDeck(deckname);
        playerDeck.addPlayerCards(Arrays.asList(
                new PlayerCard(deckname, new int[]{2, 0}, new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}),
                new PlayerCard(deckname, new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{2, 0}),
                new PlayerCard(deckname, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{2, 0}, new int[]{1, 0}),
                new PlayerCard(deckname, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{2, 0}, new int[]{1, 0}, new int[]{1, 0}),
                new PlayerCard(deckname, new int[]{1, 1}, new int[]{0, 1}, new int[]{2, 0}, new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1}),
                new PlayerCard(deckname, new int[]{0, 1}, new int[]{2, 0}, new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1})));
        return playerDeck;
    }

    public static PlayerDeck getBasicDarkPlayerDeck() {
        DeckName deckname = DeckName.BASICDARK;
        PlayerDeck playerDeck = new PlayerDeck(deckname);
        playerDeck.addPlayerCards(Arrays.asList(
                new PlayerCard(deckname, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}),
                new PlayerCard(deckname, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 0}),
                new PlayerCard(deckname, new int[]{1, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 0}, new int[]{1, 1}),
                new PlayerCard(deckname, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}),
                new PlayerCard(deckname, new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}),
                new PlayerCard(deckname, new int[]{0, 2}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{0, 2})));
        return playerDeck;
    }

    public static PlayerDeck getHumanRacePlayerDeck() {
        DeckName deckname = DeckName.RACEHUMAN;
        PlayerDeck playerDeck = new PlayerDeck(deckname);
        playerDeck.addPlayerCards(Arrays.asList(
                new PlayerCard(deckname, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}),
                new PlayerCard(deckname, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}),
                new PlayerCard(deckname, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1})));
        return playerDeck;
    }

    public static PlayerDeck getCharacterArrogantPlayerDeck() {
        DeckName deckname = DeckName.CHARACTERARROGANT;
        PlayerDeck playerDeck = new PlayerDeck(deckname);
        playerDeck.addPlayerCard(new PlayerCard(deckname, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1}));
        return playerDeck;
    }

    public static PlayerDeck getCharacterWeakPlayerDeck() {
        DeckName deckname = DeckName.CHARACTERWEAK;
        PlayerDeck playerDeck = new PlayerDeck(deckname);
        playerDeck.addPlayerCard(new PlayerCard(deckname, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 1}));
        return playerDeck;
    }

    public static PlayerDeck getSpecialisationPlayerDeck() {
        DeckName deckname = DeckName.SPECIALISATIONMONK;
        PlayerDeck playerDeck = new PlayerDeck(deckname);
        playerDeck.addPlayerCards(Arrays.asList(
                new PlayerCard(deckname, new int[]{1, 1}, new int[]{1, 1}, new int[]{3, 0}, new int[]{0, 2}, new int[]{2, 0}, new int[]{1, 1}),
                new PlayerCard(deckname, new int[]{1, 1}, new int[]{1, 1}, new int[]{3, 0}, new int[]{0, 2}, new int[]{2, 0}, new int[]{1, 1}),
                new PlayerCard(deckname, new int[]{1, 1}, new int[]{1, 1}, new int[]{3, 0}, new int[]{0, 2}, new int[]{2, 0}, new int[]{1, 1}),
                new PlayerCard(deckname, new int[]{1, 1}, new int[]{1, 1}, new int[]{3, 0}, new int[]{0, 2}, new int[]{2, 0}, new int[]{1, 1})));
        return playerDeck;
    }

    public static PlayerDeck getDeck(DeckName deckName) {
        switch (deckName) {
            case BASICLIGHT:
                return getBasicLightPlayerDeck();
            case BASICDARK:
                return getBasicDarkPlayerDeck();
            case RACEHUMAN:
                return getHumanRacePlayerDeck();
            case CHARACTERARROGANT:
                return getCharacterArrogantPlayerDeck();
            case CHARACTERWEAK:
                return getCharacterWeakPlayerDeck();
            case SPECIALISATIONMONK:
                return getSpecialisationPlayerDeck();
            default:
                return null;
        }
    }

    public static List<ChallengeCard> getChallengeCards() {
        ArrayList<ChallengeCard> challengeCards = new ArrayList<>();

        challengeCards.add(new ChallengeCard(Challenge.CRITICALSUCCESS, Challenge.CRITICALFAILURE));

        challengeCards.add(new ChallengeCard(Challenge.CRITICALSUCCESS, Challenge.FAILURE));

        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.FAILURE));

        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.DISADVANTAGE));

        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.DISADVANTAGE));

        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.ADVANTAGE, Challenge.FAILURE));

        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));
        challengeCards.add(new ChallengeCard(Challenge.RELIEF, Challenge.EFFORT));

        challengeCards.add(new ChallengeCard(Challenge.BADLUCKFAILURE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.BADLUCKFAILURE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.BADLUCKFAILURE, Challenge.FAILURE));
        challengeCards.add(new ChallengeCard(Challenge.BADLUCKFAILURE, Challenge.FAILURE));

        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.LUCK));
        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.LUCK));
        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.LUCK));
        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.LUCK));
        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.LUCK));
        challengeCards.add(new ChallengeCard(Challenge.SUCCESS, Challenge.LUCK));

        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(Challenge.NEUTRAL, Challenge.DISADVANTAGE));
        return challengeCards;
    }
}
