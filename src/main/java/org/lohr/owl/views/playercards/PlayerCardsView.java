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
import org.lohr.owl.backend.playerdeck.DeckNameEnum;
import org.lohr.owl.backend.playerdeck.DeckNameEnumTransformer;
import org.lohr.owl.views.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Route(value = "playercards", layout = MainView.class)
@PageTitle("Player Cards")
@CssImport("styles/views/playercards/player-cards-view.css")
public class PlayerCardsView extends Div {

    private final transient DataComponent dataComponent;

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
        if (dataComponent.getDeckNameEnums().isEmpty()) {
            checkboxGroup.setValue(Sets.newHashSet("Basic Light", "Basic Dark"));
        } else {
            Set<String> set = new HashSet<>();
            for (DeckNameEnum deckNameEnum : dataComponent.getDeckNameEnums()) {
                set.add(DeckNameEnumTransformer.of(deckNameEnum));
            }
            checkboxGroup.setValue(set);
        }

        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);

        button.setText("Save Player Cards");
        button.addClickListener(event -> {
            dataComponent.resetDeckNames();
            for (String item : checkboxGroup.getSelectedItems()) {
                dataComponent.getDeckNameEnums().add(DeckNameEnumTransformer.of(item));
            }
            button.setText("Player Cards saved!");
        });
        add(checkboxGroup);
        add(button);
    }
}
