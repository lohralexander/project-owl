package org.lohr.owl.backend.playerdeck;

import lombok.Getter;

public class PlayerCard
{
    private int[] strength;
    private int[] constitution;
    private int[] dexterity;
    private int[] charisma;
    private int[] wisdom;
    private int[] intelligence;

    @Getter
    private String cardType;
    @Getter
    private String ruleText;
    @Getter
    private String flavourText;

    public PlayerCard(String cardType, int strength[], int constitution[], int dexterity[], int charisma[], int wisdom[], int intelligence[])
    {
        this.cardType = cardType;
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
    }

    public int[] getAttribute(Attribute attribute){
        switch(attribute){
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
                return null;
        }
    }
}
