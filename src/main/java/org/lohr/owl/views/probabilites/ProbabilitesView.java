package org.lohr.owl.views.probabilites;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.lohr.owl.views.main.MainView;

@Route(value = "probabilities", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Probabilites")
@CssImport("styles/views/probabilites/probabilites-view.css")
public class ProbabilitesView extends Div {

    public ProbabilitesView() {
        setId("probabilites-view");
        add(new Label("Content placeholder"));
    }

}
