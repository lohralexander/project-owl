package org.lohr.owl.backend.challengedeck;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
public class ChallengeDeck implements Serializable {
    private ArrayList<ChallengeCard> challengeCards;
}
