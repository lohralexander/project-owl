package org.lohr.owl.backend.data;

import lombok.Getter;
import lombok.Setter;
import org.lohr.owl.backend.challengedeck.ChallengeCard;
import org.lohr.owl.backend.playerdeck.DeckName;
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
    private List<DeckName> deckNames;
    private List<ChallengeCard> challengeCards;
    private DataProvider dataProvider;

    @Autowired
    public DataComponent(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
        deckNames = new ArrayList<>();
        initializeBasicSet();
        initializeChallengeSet();
    }

    public void resetDeckNames() {
        deckNames = new ArrayList<>();
        initializeBasicSet();
    }

    private void initializeBasicSet() {
        deckNames.add(DeckName.BASICLIGHT);
        deckNames.add(DeckName.BASICDARK);
    }

    public void resetChallengeSet() {
        initializeChallengeSet();
    }

    private void initializeChallengeSet() {
        this.challengeCards = DataProvider.getChallengeCards();
    }
}

