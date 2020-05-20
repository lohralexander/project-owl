package org.lohr.owl.backend.playerdeck;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PlayerDeck {
    DeckNameEnum deckNameEnum;
    List<PlayerCard> playerCards;

    public PlayerDeck(DeckNameEnum deckNameEnum) {
        this.deckNameEnum = deckNameEnum;
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
        if (!this.deckNameEnum.equals(playerDeck.deckNameEnum)) {
            this.deckNameEnum = DeckNameEnum.MERGED;
        }
    }
}
