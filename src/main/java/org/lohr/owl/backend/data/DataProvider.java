package org.lohr.owl.backend.data;

import org.lohr.owl.backend.challengedeck.ChallengeCard;
import org.lohr.owl.backend.challengedeck.ChallengeEnum;
import org.lohr.owl.backend.playerdeck.DeckName;
import org.lohr.owl.backend.playerdeck.PlayerCard;
import org.lohr.owl.backend.playerdeck.PlayerDeck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<ChallengeCard> getChallengeCards() {
        ArrayList<ChallengeCard> challengeCards = new ArrayList<>();

        challengeCards.add(new ChallengeCard(ChallengeEnum.CRITICALSUCCESS, ChallengeEnum.CRITICALFAILURE));

        challengeCards.add(new ChallengeCard(ChallengeEnum.CRITICALSUCCESS, ChallengeEnum.FAILURE));

        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.FAILURE));

        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.DISADVANTAGE));

        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.DISADVANTAGE));

        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.ADVANTAGE, ChallengeEnum.FAILURE));

        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));
        challengeCards.add(new ChallengeCard(ChallengeEnum.RELIEF, ChallengeEnum.EFFORT));

        challengeCards.add(new ChallengeCard(ChallengeEnum.BADLUCKFAILURE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.BADLUCKFAILURE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.BADLUCKFAILURE, ChallengeEnum.FAILURE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.BADLUCKFAILURE, ChallengeEnum.FAILURE));

        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.LUCK));
        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.LUCK));
        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.LUCK));
        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.LUCK));
        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.LUCK));
        challengeCards.add(new ChallengeCard(ChallengeEnum.SUCCESS, ChallengeEnum.LUCK));

        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        challengeCards.add(new ChallengeCard(ChallengeEnum.NEUTRAL, ChallengeEnum.DISADVANTAGE));
        return challengeCards;
    }
}
