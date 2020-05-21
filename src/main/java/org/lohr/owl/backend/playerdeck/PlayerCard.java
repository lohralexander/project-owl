package org.lohr.owl.backend.playerdeck;

import lombok.Getter;

public class PlayerCard {
    private final int[] strength;
    private final int[] constitution;
    private final int[] dexterity;
    private final int[] charisma;
    private final int[] wisdom;
    private final int[] intelligence;

    @Getter
    private final DeckName deckName;
    @Getter
    private String ruleText;
    @Getter
    private String flavourText;

    public PlayerCard(DeckName deckName, int[] strength, int[] constitution, int[] dexterity, int[] charisma, int[] wisdom, int[] intelligence) {
        this.deckName = deckName;
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
    }

    public int[] getAttribute(Attribute attribute) {
        switch (attribute) {
            case STRENGTH:
                return strength;
            case CONSTITUTION:
                return constitution;
            case DEXTERITY:
                return dexterity;
            case CHARISMA:
                return charisma;
            case WISDOM:
                return wisdom;
            case INTELLIGENCE:
                return intelligence;
            default:
                return new int[]{};
        }
    }
}
