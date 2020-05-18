package org.lohr.owl.views.playercards;

import com.google.common.collect.Sets;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.lohr.owl.backend.data.DataComponent;
import org.lohr.owl.backend.playerdeck.DeckName;
import org.lohr.owl.backend.playerdeck.DeckNameTransformer;
import org.lohr.owl.views.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Route(value = "playercards", layout = MainView.class)
@PageTitle("Player Cards")
@CssImport("styles/views/playercards/player-cards-view.css")
public class PlayerCardsView extends Div {

    private final DataComponent dataComponent;

    @Autowired
    public PlayerCardsView(DataComponent dataComponent) {
        this.dataComponent = dataComponent;
        this.createView();
    }

    private void createView() {
        add(new H1("Choose Player Decks"));

        CheckboxGroup<String> checkboxGroup = new CheckboxGroup<>();
        Button button = new Button();

        checkboxGroup.setLabel("Choose Player Cards");
        checkboxGroup.setItems("Basic Light", "Basic Dark", "Race Human", "Character Arrogant", "Character Weak", "Class Monk");
        if (dataComponent.getDeckNames().isEmpty()) {
            checkboxGroup.setValue(Sets.newHashSet("Basic Light", "Basic Dark"));
        } else {
            Set<String> set = new HashSet<>();
            for (DeckName deckName : dataComponent.getDeckNames()) {
                set.add(DeckNameTransformer.of(deckName));
            }
            checkboxGroup.setValue(set);
        }

        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);

        button.setText("Save Player Cards");
        button.addClickListener(event -> {
            dataComponent.resetDeckNames();
            for (String item : checkboxGroup.getSelectedItems()) {
                dataComponent.getDeckNames().add(DeckNameTransformer.of(item));
            }
            button.setText("Player Cards saved!");
        });
        add(checkboxGroup);
        add(button);
    }
}
