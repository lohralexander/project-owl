package org.lohr.owl.views.probabilites;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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
    int iAmountCards;
    String textFieldLength;

    @Autowired
    public ProbabilitesView(DataComponent dataComponent) {
        this.dataComponent = dataComponent;
        textFieldLength = "100px";
        createView();
    }

    public void createView() {
        HorizontalLayout layout = new HorizontalLayout();
        setId("probabilites-view");

        add(new H1("Calculate Probabilites"));

        TextField amountCards = new TextField();
        amountCards.setValue("3");
        amountCards.setLabel("Amount of Cards to draw");
        add(amountCards);

        Button startCalculation = new Button();
        startCalculation.setText("Start Calculation");
        add(startCalculation);


        TextField strengthResult = new TextField();
        strengthResult.setValue("0");
        strengthResult.setLabel("Strength");
        strengthResult.setMaxWidth(textFieldLength);
        strengthResult.setReadOnly(true);

        TextField constitutionResult = new TextField();
        constitutionResult.setValue("0");
        constitutionResult.setLabel("Constitution");
        constitutionResult.setMaxWidth(textFieldLength);
        constitutionResult.setReadOnly(true);

        TextField dexterityResult = new TextField();
        dexterityResult.setValue("0");
        dexterityResult.setLabel("Dexterity");
        dexterityResult.setMaxWidth(textFieldLength);
        dexterityResult.setReadOnly(true);

        TextField charismaResult = new TextField();
        charismaResult.setValue("0");
        charismaResult.setLabel("Charisma");
        charismaResult.setMaxWidth(textFieldLength);
        charismaResult.setReadOnly(true);

        TextField wisdomResult = new TextField();
        wisdomResult.setValue("0");
        wisdomResult.setLabel("Wisdom");
        wisdomResult.setMaxWidth(textFieldLength);
        wisdomResult.setReadOnly(true);

        TextField intelligenceResult = new TextField();
        intelligenceResult.setValue("0");
        intelligenceResult.setLabel("Intelligence");
        intelligenceResult.setMaxWidth(textFieldLength);
        intelligenceResult.setReadOnly(true);

        startCalculation.addClickListener(event -> {
            iAmountCards = Integer.parseInt(amountCards.getValue());
            strengthResult.setValue(startCalculation().get(Attribute.STRENGTH).toString() + "%");
            constitutionResult.setValue(startCalculation().get(Attribute.CONSTITUTION).toString() + "%");
            dexterityResult.setValue(startCalculation().get(Attribute.DEXTERITY).toString() + "%");
            charismaResult.setValue(startCalculation().get(Attribute.CHARISMA).toString() + "%");
            wisdomResult.setValue(startCalculation().get(Attribute.WISDOM).toString() + "%");
            intelligenceResult.setValue(startCalculation().get(Attribute.INTELLIGENCE).toString() + "%");
            startCalculation.setText("Start new Calculation!");
        });
        add(new H2("Results:"), layout);
        layout.add(strengthResult,
                constitutionResult,
                dexterityResult,
                wisdomResult,
                charismaResult,
                intelligenceResult);
    }

    private Map<Attribute, Double> startCalculation() {
        return Runner.run(dataComponent, iAmountCards);
    }

}
