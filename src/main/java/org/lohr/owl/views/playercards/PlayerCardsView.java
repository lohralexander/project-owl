package org.lohr.owl.views.playercards;

import com.google.common.collect.Sets;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.lohr.owl.views.main.MainView;

@Route(value = "playercards", layout = MainView.class)
@PageTitle("Player Cards")
@CssImport("styles/views/playercards/player-cards-view.css")
public class PlayerCardsView extends Div {

    public PlayerCardsView() {
        this.createView();
    }

    private void createView() {
        CheckboxGroup<String> checkboxGroup = new CheckboxGroup<>();
        checkboxGroup.setLabel("Choose Player Cards");
        checkboxGroup.setItems("Basic Light", "Basic Dark", "Race Human", "Character Drawbacks", "Class Monk");
        checkboxGroup.setValue(Sets.newHashSet("Basic Light", "Basic Dark"));
        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        add(checkboxGroup);
    }

}
