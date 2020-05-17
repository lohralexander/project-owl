package org.lohr.owl.views.probabilites;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.lohr.owl.backend.Runner;
import org.lohr.owl.backend.data.DataComponent;
import org.lohr.owl.backend.playerdeck.Attribute;
import org.lohr.owl.views.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Route(value = "probabilities", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Probabilites")
@CssImport("styles/views/probabilites/probabilites-view.css")
public class ProbabilitesView extends Div {

    DataComponent dataComponent;

    @Autowired
    public ProbabilitesView(DataComponent dataComponent) {
        this.dataComponent = dataComponent;
        VerticalLayout layout = new VerticalLayout();
        layout.getStyle().set("border", "1px solid #9E9E9E");

        setId("probabilites-view");
        Button button = new Button();
        button.setText("Start Calculation");

        TextField strengthResult = new TextField();
        strengthResult.setValue("0");
        strengthResult.setLabel("Strength");
        strengthResult.setReadOnly(true);

        TextField constitutionResult = new TextField();
        constitutionResult.setValue("0");
        constitutionResult.setLabel("Constitution");
        constitutionResult.setReadOnly(true);

        TextField dexterityResult = new TextField();
        dexterityResult.setValue("0");
        dexterityResult.setLabel("Dexterity");
        dexterityResult.setReadOnly(true);

        TextField charismaResult = new TextField();
        charismaResult.setValue("0");
        charismaResult.setLabel("Charisma");
        charismaResult.setReadOnly(true);

        TextField wisdomResult = new TextField();
        wisdomResult.setValue("0");
        wisdomResult.setLabel("Wisdom");
        wisdomResult.setReadOnly(true);

        TextField intelligenceResult = new TextField();
        intelligenceResult.setValue("0");
        intelligenceResult.setLabel("Intelligence");
        intelligenceResult.setReadOnly(true);

        button.addClickListener(event ->
                button.setText("Calculation started!"));
        button.addClickListener(event -> {
            strengthResult.setValue(startCalculation().get(Attribute.STRENGTH).toString());
            constitutionResult.setValue(startCalculation().get(Attribute.CONSTITUTION).toString());
            dexterityResult.setValue(startCalculation().get(Attribute.DEXTERITY).toString());
            charismaResult.setValue(startCalculation().get(Attribute.CHARISMA).toString());
            wisdomResult.setValue(startCalculation().get(Attribute.WISDOM).toString());
            intelligenceResult.setValue(startCalculation().get(Attribute.INTELLIGENCE).toString());
        });
        add(layout);
        layout.add(new H1("Probabilities"),
                button,
                strengthResult,
                constitutionResult,
                dexterityResult,
                wisdomResult,
                charismaResult,
                intelligenceResult);
    }

    private Map startCalculation() {
        return Runner.run(dataComponent);
    }

}
