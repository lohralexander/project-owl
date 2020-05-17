package org.lohr.owl.backend.challengedeck;

import lombok.Getter;

@Getter
public class ChallengeCard {
    private final ChallengeEnum lightSide;
    private final ChallengeEnum darkSide;

    public ChallengeCard(ChallengeEnum lightSide, ChallengeEnum darkSide) {
        this.lightSide = lightSide;
        this.darkSide = darkSide;
    }
}
