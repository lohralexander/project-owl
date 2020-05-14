package org.lohr.owl.backend.data;

import org.lohr.owl.backend.challengedeck.ChallengeCard;
import org.lohr.owl.backend.challengedeck.ChallengeEnum;
import org.lohr.owl.backend.playerdeck.PlayerCard;

import java.util.ArrayList;

public class DataProvider {

    public ArrayList<PlayerCard> getBasicPlayerCards() {
        String basicLight = "Basic Light";
        String basicDark = "Basic Dark";
        PlayerCard basicLight1 = new PlayerCard(basicLight, new int[]{2, 0}, new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1});
        PlayerCard basicLight2 = new PlayerCard(basicLight, new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{2, 0});
        PlayerCard basicLight3 = new PlayerCard(basicLight, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{2, 0}, new int[]{1, 0});
        PlayerCard basicLight4 = new PlayerCard(basicLight, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{2, 0}, new int[]{1, 0}, new int[]{1, 0});
        PlayerCard basicLight5 = new PlayerCard(basicLight, new int[]{1, 1}, new int[]{0, 1}, new int[]{2, 0}, new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1});
        PlayerCard basicLight6 = new PlayerCard(basicLight, new int[]{0, 1}, new int[]{2, 0}, new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1});
        PlayerCard basicDark1 = new PlayerCard(basicDark, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2});

        PlayerCard basicDark2 = new PlayerCard(basicDark, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 0});
        PlayerCard basicDark3 = new PlayerCard(basicDark, new int[]{1, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 0}, new int[]{1, 1});
        PlayerCard basicDark4 = new PlayerCard(basicDark, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1});
        PlayerCard basicDark5 = new PlayerCard(basicDark, new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1});
        PlayerCard basicDark6 = new PlayerCard(basicDark, new int[]{0, 2}, new int[]{1, 0}, new int[]{1, 1}, new int[]{1, 1}, new int[]{0, 1}, new int[]{0, 2});
        ArrayList<PlayerCard> basicPlayerDeck = new ArrayList<>();

        basicPlayerDeck.add(basicDark1);
        basicPlayerDeck.add(basicDark2);
        basicPlayerDeck.add(basicDark3);
        basicPlayerDeck.add(basicDark4);
        basicPlayerDeck.add(basicDark5);
        basicPlayerDeck.add(basicDark6);
        basicPlayerDeck.add(basicLight1);
        basicPlayerDeck.add(basicLight2);
        basicPlayerDeck.add(basicLight3);
        basicPlayerDeck.add(basicLight4);
        basicPlayerDeck.add(basicLight5);
        basicPlayerDeck.add(basicLight6);
        return basicPlayerDeck;
    }

    public static ArrayList<PlayerCard> getHumanRacePlayerCards() {
        PlayerCard basicHuman = new PlayerCard("Basic Human", new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1}, new int[]{2, 1});

        ArrayList<PlayerCard> humanRacePlayerDeck = new ArrayList<>();
        humanRacePlayerDeck.add(basicHuman);
        humanRacePlayerDeck.add(basicHuman);
        humanRacePlayerDeck.add(basicHuman);

        return humanRacePlayerDeck;
    }

    public static ArrayList<PlayerCard> getCharacterPlayerCards() {
        PlayerCard weak = new PlayerCard("Weak", new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 1});
        PlayerCard arrogant = new PlayerCard("Arrogant", new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1});

        ArrayList<PlayerCard> charakterPlayerDeck = new ArrayList<>();
        charakterPlayerDeck.add(weak);
        charakterPlayerDeck.add(arrogant);
        charakterPlayerDeck.add(arrogant);

        return charakterPlayerDeck;
    }

    public static ArrayList<PlayerCard> getSpecialisationPlayerCards() {
        PlayerCard monk = new PlayerCard("Monk", new int[]{1, 1}, new int[]{1, 1}, new int[]{3, 0}, new int[]{0, 2}, new int[]{2, 0}, new int[]{1, 1});

        ArrayList<PlayerCard> racePlayerDeck = new ArrayList<>();
        racePlayerDeck.add(monk);
        racePlayerDeck.add(monk);
        racePlayerDeck.add(monk);
        racePlayerDeck.add(monk);

        return racePlayerDeck;
    }

    public static ArrayList<ChallengeCard> getChallengeCards() {
        ArrayList<ChallengeCard> challengeCards = new ArrayList<ChallengeCard>();

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
