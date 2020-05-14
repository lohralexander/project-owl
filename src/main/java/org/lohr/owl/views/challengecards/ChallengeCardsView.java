package org.lohr.owl.views.challengecards;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.lohr.owl.views.main.MainView;

@Route(value = "challengecards", layout = MainView.class)
@PageTitle("Challenge Cards")
@CssImport("styles/views/challengecards/challenge-cards-view.css")
public class ChallengeCardsView extends Div {

    public ChallengeCardsView() {
        setId("challenge-cards-view");
        add(new Label("Content placeholder"));
    }

}
