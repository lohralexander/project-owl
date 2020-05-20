package org.lohr.owl.backend.data;

import lombok.Getter;
import lombok.Setter;
import org.lohr.owl.backend.challengedeck.ChallengeCard;
import org.lohr.owl.backend.playerdeck.DeckNameEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component("DataComponents")
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DataComponent {
    private List<DeckNameEnum> deckNameEnums;
    private List<ChallengeCard> challengeCards;
    private DataProvider dataProvider;

    @Autowired
    public DataComponent(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
        deckNameEnums = new ArrayList<>();
        initializeBasicSet();
        initializeChallengeSet();
    }

    public void resetDeckNames() {
        deckNameEnums = new ArrayList<>();
        initializeBasicSet();
    }

    private void initializeBasicSet() {
        deckNameEnums.add(DeckNameEnum.BASICLIGHT);
        deckNameEnums.add(DeckNameEnum.BASICDARK);
    }

    public void resetChallengeSet() {
        initializeChallengeSet();
    }

    private void initializeChallengeSet() {
        this.challengeCards = DataProvider.getChallengeCards();
    }
}

