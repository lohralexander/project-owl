package org.lohr.owl.backend.challenge;


import org.apache.log4j.Logger;
import org.lohr.owl.backend.challengedeck.ChallengeCard;
import org.lohr.owl.backend.challengedeck.ChallengeDeck;
import org.lohr.owl.backend.playerdeck.Attribute;
import org.lohr.owl.backend.playerdeck.PlayerCard;
import org.lohr.owl.backend.playerdeck.PlayerDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class Challenge {

    private final ChallengeDeck challengeDeck;
    private final PlayerDeck playerDeck;
    private static final Logger logger = Logger.getLogger(Challenge.class);
    private final boolean logging;
    private final Random rand;

    public Challenge(ChallengeDeck challengeDeck, PlayerDeck playerDeck, boolean systemOutPrint) {
        this.challengeDeck = challengeDeck;
        this.playerDeck = playerDeck;
        this.logging = systemOutPrint;
        rand = new Random();
    }

    public boolean makeCheck(int amountCards, Attribute attribute) {
        ArrayList<PlayerCard> tempPlayerDeck = new ArrayList<>(playerDeck.getPlayerCards());
        ArrayList<ChallengeCard> tempChallengeDeck = new ArrayList<>(challengeDeck.getChallengeCards());

        ArrayList<PlayerCard> drawnPlayerCards = drawPlayerCards(tempPlayerDeck, amountCards);
        ArrayList<org.lohr.owl.backend.challengedeck.Challenge> challenges = evaluateChallengeCards(tempChallengeDeck, drawnPlayerCards, attribute);
        return evaluateResult(challenges);
    }

    private ArrayList<PlayerCard> drawPlayerCards(ArrayList<PlayerCard> playerDeck, int amountCards) {
        ArrayList<PlayerCard> drawnPlayerCards = new ArrayList<>();

        for (int i = 0; i < amountCards; i++) {
            int randomIndex = rand.nextInt(playerDeck.size());
            drawnPlayerCards.add(playerDeck.get(randomIndex));
            playerDeck.remove(randomIndex);
        }
        return drawnPlayerCards;
    }

    private ArrayList<org.lohr.owl.backend.challengedeck.Challenge> evaluateChallengeCards(ArrayList<ChallengeCard> challengeDeck, ArrayList<PlayerCard> drawnPlayerCards, Attribute attribute) {
        ArrayList<org.lohr.owl.backend.challengedeck.Challenge> evaluatedChallengeOutcomes = new ArrayList<>();
        StringJoiner drawnPlayerCardsAttributes;
        ArrayList<StringJoiner> drawnPlayerCardsAttributesList = new ArrayList<>();

        for (PlayerCard drawnPlayerCard : drawnPlayerCards) {
            for (int i = 0; i < drawnPlayerCard.getAttribute(attribute)[0]; i++) {
                int randomIndex = rand.nextInt(challengeDeck.size());
                evaluatedChallengeOutcomes.add(challengeDeck.get(randomIndex).getLightSide());
                challengeDeck.remove(randomIndex);
            }
            for (int i = 0; i < drawnPlayerCard.getAttribute(attribute)[1]; i++) {
                int randomIndex = rand.nextInt(challengeDeck.size());
                evaluatedChallengeOutcomes.add(challengeDeck.get(randomIndex).getDarkSide());
                challengeDeck.remove(randomIndex);
            }
            drawnPlayerCardsAttributes = new StringJoiner(",", "[", "]");
            drawnPlayerCardsAttributesList.add(drawnPlayerCardsAttributes
                    .add(drawnPlayerCard.getDeckName().toString())
                    .add(Integer.toString(drawnPlayerCard.getAttribute(attribute)[0]))
                    .add(Integer.toString(drawnPlayerCard.getAttribute(attribute)[1])));
        }
        if (logging) {
            logger.info(drawnPlayerCardsAttributesList.toString());
        }
        return evaluatedChallengeOutcomes;
    }

    private boolean evaluateResult(ArrayList<org.lohr.owl.backend.challengedeck.Challenge> challenges) {
        int successCounter = 0;
        boolean result;
        ArrayList<org.lohr.owl.backend.challengedeck.Challenge> challengeArrayList = new ArrayList<>();
        for (org.lohr.owl.backend.challengedeck.Challenge challenge : challenges) {
            challengeArrayList.add(challenge);
            switch (challenge) {
                case CRITICALSUCCESS:
                    printChallengeEnum(challengeArrayList, true);
                    return true;
                case SUCCESS:
                    successCounter++;
                    break;
                case CRITICALFAILURE:
                    printChallengeEnum(challengeArrayList, false);
                    return false;
                case FAILURE:
                    successCounter--;
                    break;
                default:
                    break;
            }
        }
        result = successCounter > 0;
        printChallengeEnum(challenges, result);
        return result;
    }

    public void printChallengeEnum(List<org.lohr.owl.backend.challengedeck.Challenge> challenges, boolean result) {
        if (logging) {
            logger.info("Challenge Result: " + challenges.toString() + " Success: " + result);
        }
    }
}
