package org.lohr.owl.backend.playerdeck;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PlayerDeck {
    DeckName deckName;
    List<PlayerCard> playerCards;

    public PlayerDeck(DeckName deckName) {
        this.deckName = deckName;
        this.playerCards = new ArrayList<>();
    }

    public void addPlayerCard(PlayerCard playerCard) {
        this.playerCards.add(playerCard);
    }

    public void addPlayerCards(List<PlayerCard> playerCards) {
        this.playerCards.addAll(playerCards);
    }

    public void mergeDecks(PlayerDeck playerDeck) {
        this.playerCards.addAll(playerDeck.getPlayerCards());
        if (!this.deckName.equals(playerDeck.deckName)) {
            this.deckName = DeckName.MERGED;
        }
    }
}
