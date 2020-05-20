package org.lohr.owl.backend.playerdeck;

public class DeckNameEnumTransformer {
    private DeckNameEnumTransformer() {
    }

    public static DeckNameEnum of(String deckName) {
        switch (deckName) {
            case "Basic Light":
                return DeckNameEnum.BASICLIGHT;
            case "Basic Dark":
                return DeckNameEnum.BASICDARK;
            case "Race Human":
                return DeckNameEnum.RACEHUMAN;
            case "Character Arrogant":
                return DeckNameEnum.CHARACTERARROGANT;
            case "Character Weak":
                return DeckNameEnum.CHARACTERWEAK;
            case "Class Monk":
                return DeckNameEnum.SPECIALISATIONMONK;
            default:
                return null;
        }
    }

    public static String of(DeckNameEnum deckNameEnum) {
        switch (deckNameEnum) {
            case BASICLIGHT:
                return "Basic Light";
            case BASICDARK:
                return "Basic Dark";
            case RACEHUMAN:
                return "Race Human";
            case CHARACTERARROGANT:
                return "Character Arrogant";
            case CHARACTERWEAK:
                return "Character Weak";
            case SPECIALISATIONMONK:
                return "Class Monk";
            default:
                return null;
        }
    }
}
