package org.lohr.owl.backend.challengedeck;

import lombok.Getter;

@Getter
public class ChallengeCard {
    private final Challenge lightSide;
    private final Challenge darkSide;

    public ChallengeCard(Challenge lightSide, Challenge darkSide) {
        this.lightSide = lightSide;
        this.darkSide = darkSide;
    }
}
