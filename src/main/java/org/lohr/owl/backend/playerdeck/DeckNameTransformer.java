package org.lohr.owl.backend.playerdeck;

public class DeckNameTransformer {
    private DeckNameTransformer() {
    }

    public static DeckName of(String deckName) {
        switch (deckName) {
            case "Basic Light":
                return DeckName.BASICLIGHT;
            case "Basic Dark":
                return DeckName.BASICDARK;
            case "Race Human":
                return DeckName.RACEHUMAN;
            case "Character Arrogant":
                return DeckName.CHARACTERARROGANT;
            case "Character Weak":
                return DeckName.CHARACTERWEAK;
            case "Class Monk":
                return DeckName.SPECIALISATIONMONK;
            default:
                return null;
        }
    }

    public static String of(DeckName deckName) {
        switch (deckName) {
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
