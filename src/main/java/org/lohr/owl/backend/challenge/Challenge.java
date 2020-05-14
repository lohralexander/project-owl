package org.lohr.owl.backend.challenge;

import org.lohr.owl.backend.challengedeck.ChallengeCard;
import org.lohr.owl.backend.challengedeck.ChallengeDeck;
import org.lohr.owl.backend.challengedeck.ChallengeEnum;
import org.lohr.owl.backend.playerdeck.Attribute;
import org.lohr.owl.backend.playerdeck.PlayerCard;
import org.lohr.owl.backend.playerdeck.PlayerDeck;

import java.util.ArrayList;
import java.util.Random;
import java.util.StringJoiner;

public class Challenge {

    private final ChallengeDeck challengeDeck;
    private final PlayerDeck playerDeck;
    private boolean systemOutPrint;

    public Challenge(ChallengeDeck challengeDeck, PlayerDeck playerDeck, boolean systemOutPrint) {
        this.challengeDeck = challengeDeck;
        this.playerDeck = playerDeck;
        this.systemOutPrint = systemOutPrint;
    }

    public boolean makeCheck(int amountCards, Attribute attribute) {
        ArrayList<PlayerCard> tempPlayerDeck = new ArrayList<PlayerCard>(playerDeck.getPlayerCards());
        ArrayList<ChallengeCard> tempChallengeDeck = new ArrayList<ChallengeCard>(challengeDeck.getChallengeCards());

        ArrayList<PlayerCard> drawnPlayerCards = drawPlayerCards(tempPlayerDeck, amountCards);
        ArrayList<ChallengeEnum> challengeEnums = evaluateChallengeCards(tempChallengeDeck, drawnPlayerCards, attribute);
        return evaluateResult(challengeEnums);
    }

    private ArrayList<PlayerCard> drawPlayerCards(ArrayList<PlayerCard> playerDeck, int amountCards) {
        Random rand = new Random();
        ArrayList<PlayerCard> drawnPlayerCards = new ArrayList<PlayerCard>();

        for (int i = 0; i < amountCards; i++) {
            int randomIndex = rand.nextInt(playerDeck.size());
            drawnPlayerCards.add(playerDeck.get(randomIndex));
            playerDeck.remove(randomIndex);
        }
        return drawnPlayerCards;
    }

    private ArrayList<ChallengeEnum> evaluateChallengeCards(ArrayList<ChallengeCard> challengeDeck, ArrayList<PlayerCard> drawnPlayerCards, Attribute attribute) {
        Random rand = new Random();
        ArrayList<ChallengeEnum> evaluatedChallengeOutcomes = new ArrayList<ChallengeEnum>();
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
                    .add(drawnPlayerCard.getCardType())
                    .add(Integer.toString(drawnPlayerCard.getAttribute(attribute)[0]))
                    .add(Integer.toString(drawnPlayerCard.getAttribute(attribute)[1])));
        }
        if(systemOutPrint){
            System.out.println(drawnPlayerCardsAttributesList.toString());
        }
        return evaluatedChallengeOutcomes;
    }

    private boolean evaluateResult(ArrayList<ChallengeEnum> challengeEnums) {
        int successCounter = 0;
        boolean result;
        ArrayList<ChallengeEnum> challengeEnumArrayList = new ArrayList<ChallengeEnum>();
        for (ChallengeEnum challengeEnum : challengeEnums) {
            challengeEnumArrayList.add(challengeEnum);
            switch (challengeEnum) {
                case CRITICALSUCCESS:
                    printChallengeEnum(challengeEnumArrayList, true);
                    return true;
                case SUCCESS:
                    successCounter++;
                    break;
                case CRITICALFAILURE:
                    printChallengeEnum(challengeEnumArrayList, false);
                    return false;
                case FAILURE:
                    successCounter--;
                    break;
                default:
                    break;
            }
        }
        result = successCounter>0;
        printChallengeEnum(challengeEnums, result);
        return result;
    }

    public void printChallengeEnum(ArrayList<ChallengeEnum> challengeEnums, boolean result){
        if(systemOutPrint){
            System.out.println("Challenge Result: " + challengeEnums.toString() + " Success: " + result);
        }
    }
}
