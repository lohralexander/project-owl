package org.lohr.owl.backend.challengedeck;

import lombok.Getter;

@Getter
public class ChallengeCard {
    private ChallengeEnum lightSide;
    private ChallengeEnum darkSide;

    public ChallengeCard(ChallengeEnum lightSide, ChallengeEnum darkSide)
    {
        this.lightSide = lightSide;
        this.darkSide = darkSide;
    }
}
