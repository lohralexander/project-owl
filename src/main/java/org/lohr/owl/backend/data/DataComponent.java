package org.lohr.owl.backend.data;

import lombok.Getter;
import lombok.Setter;
import org.lohr.owl.backend.playerdeck.DeckName;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component("DataComponents")
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DataComponent {
    List<DeckName> deckNames;

    public DataComponent() {
        deckNames = new ArrayList<>();
        initializeBasicSet();
    }

    public void resetDeckNames() {
        deckNames = new ArrayList<>();
        initializeBasicSet();
    }

    private void initializeBasicSet() {
        deckNames.add(DeckName.BASICLIGHT);
        deckNames.add(DeckName.BASICDARK);
    }
}

