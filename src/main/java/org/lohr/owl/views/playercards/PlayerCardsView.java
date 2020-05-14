package org.lohr.owl.views.playercards;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.lohr.owl.views.main.MainView;

@Route(value = "playercards", layout = MainView.class)
@PageTitle("Player Cards")
@CssImport("styles/views/playercards/player-cards-view.css")
public class PlayerCardsView extends Div {

    public PlayerCardsView() {
        setId("player-cards-view");
        add(new Label("Content placeholder"));
    }

}
