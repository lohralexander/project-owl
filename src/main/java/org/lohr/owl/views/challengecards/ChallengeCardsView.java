package org.lohr.owl.views.challengecards;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.lohr.owl.backend.challengedeck.Challenge;
import org.lohr.owl.backend.challengedeck.ChallengeCard;
import org.lohr.owl.backend.data.DataComponent;
import org.lohr.owl.views.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "challengecards", layout = MainView.class)
@PageTitle("Challenge Cards")
@CssImport("styles/views/challengecards/challenge-cards-view.css")
public class ChallengeCardsView extends Div {
    private final transient DataComponent dataComponent;
    String textFieldLength;

    @Autowired
    public ChallengeCardsView(DataComponent dataComponent) {
        this.dataComponent = dataComponent;
        setId("challenge-cards-view");
        add(new H1("Choose Challenge Cards"));
        textFieldLength = "100px";
        createView();
    }

    public void createView() {
        ComboBox<Challenge> valueComboBox1 = new ComboBox<>();
        valueComboBox1.setItems(Challenge.values());
        valueComboBox1.setValue(dataComponent.getChallengeCards().get(0).getLightSide());

        ComboBox<Challenge> valueComboBox2 = new ComboBox<>();
        valueComboBox2.setItems(Challenge.values());
        valueComboBox2.setValue(dataComponent.getChallengeCards().get(1).getLightSide());

        ComboBox<Challenge> valueComboBox3 = new ComboBox<>();
        valueComboBox3.setItems(Challenge.values());
        valueComboBox3.setValue(dataComponent.getChallengeCards().get(2).getLightSide());

        ComboBox<Challenge> valueComboBox4 = new ComboBox<>();
        valueComboBox4.setItems(Challenge.values());
        valueComboBox4.setValue(dataComponent.getChallengeCards().get(3).getLightSide());

        ComboBox<Challenge> valueComboBox5 = new ComboBox<>();
        valueComboBox5.setItems(Challenge.values());
        valueComboBox5.setValue(dataComponent.getChallengeCards().get(4).getLightSide());

        ComboBox<Challenge> valueComboBox6 = new ComboBox<>();
        valueComboBox6.setItems(Challenge.values());
        valueComboBox6.setValue(dataComponent.getChallengeCards().get(5).getLightSide());

        ComboBox<Challenge> valueComboBox7 = new ComboBox<>();
        valueComboBox7.setItems(Challenge.values());
        valueComboBox7.setValue(dataComponent.getChallengeCards().get(6).getLightSide());

        ComboBox<Challenge> valueComboBox8 = new ComboBox<>();
        valueComboBox8.setItems(Challenge.values());
        valueComboBox8.setValue(dataComponent.getChallengeCards().get(7).getLightSide());

        ComboBox<Challenge> valueComboBox9 = new ComboBox<>();
        valueComboBox9.setItems(Challenge.values());
        valueComboBox9.setValue(dataComponent.getChallengeCards().get(8).getLightSide());

        ComboBox<Challenge> valueComboBox10 = new ComboBox<>();
        valueComboBox10.setItems(Challenge.values());
        valueComboBox10.setValue(dataComponent.getChallengeCards().get(9).getLightSide());

        ComboBox<Challenge> valueComboBox11 = new ComboBox<>();
        valueComboBox11.setItems(Challenge.values());
        valueComboBox11.setValue(dataComponent.getChallengeCards().get(10).getLightSide());

        ComboBox<Challenge> valueComboBox12 = new ComboBox<>();
        valueComboBox12.setItems(Challenge.values());
        valueComboBox12.setValue(dataComponent.getChallengeCards().get(11).getLightSide());

        ComboBox<Challenge> valueComboBox13 = new ComboBox<>();
        valueComboBox13.setItems(Challenge.values());
        valueComboBox13.setValue(dataComponent.getChallengeCards().get(12).getLightSide());

        ComboBox<Challenge> valueComboBox14 = new ComboBox<>();
        valueComboBox14.setItems(Challenge.values());
        valueComboBox14.setValue(dataComponent.getChallengeCards().get(13).getLightSide());

        ComboBox<Challenge> valueComboBox15 = new ComboBox<>();
        valueComboBox15.setItems(Challenge.values());
        valueComboBox15.setValue(dataComponent.getChallengeCards().get(14).getLightSide());

        ComboBox<Challenge> valueComboBox16 = new ComboBox<>();
        valueComboBox16.setItems(Challenge.values());
        valueComboBox16.setValue(dataComponent.getChallengeCards().get(15).getLightSide());

        ComboBox<Challenge> valueComboBox17 = new ComboBox<>();
        valueComboBox17.setItems(Challenge.values());
        valueComboBox17.setValue(dataComponent.getChallengeCards().get(16).getLightSide());

        ComboBox<Challenge> valueComboBox18 = new ComboBox<>();
        valueComboBox18.setItems(Challenge.values());
        valueComboBox18.setValue(dataComponent.getChallengeCards().get(17).getLightSide());

        ComboBox<Challenge> valueComboBox19 = new ComboBox<>();
        valueComboBox19.setItems(Challenge.values());
        valueComboBox19.setValue(dataComponent.getChallengeCards().get(18).getLightSide());

        ComboBox<Challenge> valueComboBox20 = new ComboBox<>();
        valueComboBox20.setItems(Challenge.values());
        valueComboBox20.setValue(dataComponent.getChallengeCards().get(19).getLightSide());

        ComboBox<Challenge> valueComboBox21 = new ComboBox<>();
        valueComboBox21.setItems(Challenge.values());
        valueComboBox21.setValue(dataComponent.getChallengeCards().get(20).getLightSide());

        ComboBox<Challenge> valueComboBox22 = new ComboBox<>();
        valueComboBox22.setItems(Challenge.values());
        valueComboBox22.setValue(dataComponent.getChallengeCards().get(21).getLightSide());

        ComboBox<Challenge> valueComboBox23 = new ComboBox<>();
        valueComboBox23.setItems(Challenge.values());
        valueComboBox23.setValue(dataComponent.getChallengeCards().get(22).getLightSide());

        ComboBox<Challenge> valueComboBox24 = new ComboBox<>();
        valueComboBox24.setItems(Challenge.values());
        valueComboBox24.setValue(dataComponent.getChallengeCards().get(23).getLightSide());

        ComboBox<Challenge> valueComboBox25 = new ComboBox<>();
        valueComboBox25.setItems(Challenge.values());
        valueComboBox25.setValue(dataComponent.getChallengeCards().get(24).getLightSide());

        ComboBox<Challenge> valueComboBox26 = new ComboBox<>();
        valueComboBox26.setItems(Challenge.values());
        valueComboBox26.setValue(dataComponent.getChallengeCards().get(25).getLightSide());

        ComboBox<Challenge> valueComboBox27 = new ComboBox<>();
        valueComboBox27.setItems(Challenge.values());
        valueComboBox27.setValue(dataComponent.getChallengeCards().get(26).getLightSide());

        ComboBox<Challenge> valueComboBox28 = new ComboBox<>();
        valueComboBox28.setItems(Challenge.values());
        valueComboBox28.setValue(dataComponent.getChallengeCards().get(27).getLightSide());

        ComboBox<Challenge> valueComboBox29 = new ComboBox<>();
        valueComboBox29.setItems(Challenge.values());
        valueComboBox29.setValue(dataComponent.getChallengeCards().get(28).getLightSide());

        ComboBox<Challenge> valueComboBox30 = new ComboBox<>();
        valueComboBox30.setItems(Challenge.values());
        valueComboBox30.setValue(dataComponent.getChallengeCards().get(29).getLightSide());

        ComboBox<Challenge> valueComboBox31 = new ComboBox<>();
        valueComboBox31.setItems(Challenge.values());
        valueComboBox31.setValue(dataComponent.getChallengeCards().get(30).getLightSide());

        ComboBox<Challenge> valueComboBox32 = new ComboBox<>();
        valueComboBox32.setItems(Challenge.values());
        valueComboBox32.setValue(dataComponent.getChallengeCards().get(31).getLightSide());

        ComboBox<Challenge> valueComboBox33 = new ComboBox<>();
        valueComboBox33.setItems(Challenge.values());
        valueComboBox33.setValue(dataComponent.getChallengeCards().get(32).getLightSide());

        ComboBox<Challenge> valueComboBox34 = new ComboBox<>();
        valueComboBox34.setItems(Challenge.values());
        valueComboBox34.setValue(dataComponent.getChallengeCards().get(33).getLightSide());

        ComboBox<Challenge> valueComboBox35 = new ComboBox<>();
        valueComboBox35.setItems(Challenge.values());
        valueComboBox35.setValue(dataComponent.getChallengeCards().get(34).getLightSide());

        ComboBox<Challenge> valueComboBox36 = new ComboBox<>();
        valueComboBox36.setItems(Challenge.values());
        valueComboBox36.setValue(dataComponent.getChallengeCards().get(35).getLightSide());

        ComboBox<Challenge> valueComboBox37 = new ComboBox<>();
        valueComboBox37.setItems(Challenge.values());
        valueComboBox37.setValue(dataComponent.getChallengeCards().get(36).getLightSide());

        ComboBox<Challenge> valueComboBox38 = new ComboBox<>();
        valueComboBox38.setItems(Challenge.values());
        valueComboBox38.setValue(dataComponent.getChallengeCards().get(37).getLightSide());

        ComboBox<Challenge> valueComboBox39 = new ComboBox<>();
        valueComboBox39.setItems(Challenge.values());
        valueComboBox39.setValue(dataComponent.getChallengeCards().get(38).getLightSide());

        ComboBox<Challenge> valueComboBox40 = new ComboBox<>();
        valueComboBox40.setItems(Challenge.values());
        valueComboBox40.setValue(dataComponent.getChallengeCards().get(39).getLightSide());

        ComboBox<Challenge> valueComboBox41 = new ComboBox<>();
        valueComboBox41.setItems(Challenge.values());
        valueComboBox41.setValue(dataComponent.getChallengeCards().get(40).getLightSide());

        ComboBox<Challenge> valueComboBox42 = new ComboBox<>();
        valueComboBox42.setItems(Challenge.values());
        valueComboBox42.setValue(dataComponent.getChallengeCards().get(41).getLightSide());

        ComboBox<Challenge> valueComboBox43 = new ComboBox<>();
        valueComboBox43.setItems(Challenge.values());
        valueComboBox43.setValue(dataComponent.getChallengeCards().get(42).getLightSide());

        ComboBox<Challenge> valueComboBox44 = new ComboBox<>();
        valueComboBox44.setItems(Challenge.values());
        valueComboBox44.setValue(dataComponent.getChallengeCards().get(43).getLightSide());

        ComboBox<Challenge> valueComboBox45 = new ComboBox<>();
        valueComboBox45.setItems(Challenge.values());
        valueComboBox45.setValue(dataComponent.getChallengeCards().get(44).getLightSide());

        ComboBox<Challenge> valueComboBox46 = new ComboBox<>();
        valueComboBox46.setItems(Challenge.values());
        valueComboBox46.setValue(dataComponent.getChallengeCards().get(45).getLightSide());

        ComboBox<Challenge> valueComboBox47 = new ComboBox<>();
        valueComboBox47.setItems(Challenge.values());
        valueComboBox47.setValue(dataComponent.getChallengeCards().get(46).getLightSide());

        ComboBox<Challenge> valueComboBox48 = new ComboBox<>();
        valueComboBox48.setItems(Challenge.values());
        valueComboBox48.setValue(dataComponent.getChallengeCards().get(47).getLightSide());

        ComboBox<Challenge> valueComboBox49 = new ComboBox<>();
        valueComboBox49.setItems(Challenge.values());
        valueComboBox49.setValue(dataComponent.getChallengeCards().get(48).getLightSide());

        ComboBox<Challenge> valueComboBox50 = new ComboBox<>();
        valueComboBox50.setItems(Challenge.values());
        valueComboBox50.setValue(dataComponent.getChallengeCards().get(49).getLightSide());

        ComboBox<Challenge> valueComboBox51 = new ComboBox<>();
        valueComboBox51.setItems(Challenge.values());
        valueComboBox51.setValue(dataComponent.getChallengeCards().get(50).getLightSide());

        ComboBox<Challenge> valueComboBox52 = new ComboBox<>();
        valueComboBox52.setItems(Challenge.values());
        valueComboBox52.setValue(dataComponent.getChallengeCards().get(51).getLightSide());

        ComboBox<Challenge> valueComboBox1b = new ComboBox<>();
        valueComboBox1b.setItems(Challenge.values());
        valueComboBox1b.setValue(dataComponent.getChallengeCards().get(0).getDarkSide());

        ComboBox<Challenge> valueComboBox2b = new ComboBox<>();
        valueComboBox2b.setItems(Challenge.values());
        valueComboBox2b.setValue(dataComponent.getChallengeCards().get(1).getDarkSide());

        ComboBox<Challenge> valueComboBox3b = new ComboBox<>();
        valueComboBox3b.setItems(Challenge.values());
        valueComboBox3b.setValue(dataComponent.getChallengeCards().get(2).getDarkSide());

        ComboBox<Challenge> valueComboBox4b = new ComboBox<>();
        valueComboBox4b.setItems(Challenge.values());
        valueComboBox4b.setValue(dataComponent.getChallengeCards().get(3).getDarkSide());

        ComboBox<Challenge> valueComboBox5b = new ComboBox<>();
        valueComboBox5b.setItems(Challenge.values());
        valueComboBox5b.setValue(dataComponent.getChallengeCards().get(4).getDarkSide());

        ComboBox<Challenge> valueComboBox6b = new ComboBox<>();
        valueComboBox6b.setItems(Challenge.values());
        valueComboBox6b.setValue(dataComponent.getChallengeCards().get(5).getDarkSide());

        ComboBox<Challenge> valueComboBox7b = new ComboBox<>();
        valueComboBox7b.setItems(Challenge.values());
        valueComboBox7b.setValue(dataComponent.getChallengeCards().get(6).getDarkSide());

        ComboBox<Challenge> valueComboBox8b = new ComboBox<>();
        valueComboBox8b.setItems(Challenge.values());
        valueComboBox8b.setValue(dataComponent.getChallengeCards().get(7).getDarkSide());

        ComboBox<Challenge> valueComboBox9b = new ComboBox<>();
        valueComboBox9b.setItems(Challenge.values());
        valueComboBox9b.setValue(dataComponent.getChallengeCards().get(8).getDarkSide());

        ComboBox<Challenge> valueComboBox10b = new ComboBox<>();
        valueComboBox10b.setItems(Challenge.values());
        valueComboBox10b.setValue(dataComponent.getChallengeCards().get(9).getDarkSide());

        ComboBox<Challenge> valueComboBox11b = new ComboBox<>();
        valueComboBox11b.setItems(Challenge.values());
        valueComboBox11b.setValue(dataComponent.getChallengeCards().get(10).getDarkSide());

        ComboBox<Challenge> valueComboBox12b = new ComboBox<>();
        valueComboBox12b.setItems(Challenge.values());
        valueComboBox12b.setValue(dataComponent.getChallengeCards().get(11).getDarkSide());

        ComboBox<Challenge> valueComboBox13b = new ComboBox<>();
        valueComboBox13b.setItems(Challenge.values());
        valueComboBox13b.setValue(dataComponent.getChallengeCards().get(12).getDarkSide());

        ComboBox<Challenge> valueComboBox14b = new ComboBox<>();
        valueComboBox14b.setItems(Challenge.values());
        valueComboBox14b.setValue(dataComponent.getChallengeCards().get(13).getDarkSide());

        ComboBox<Challenge> valueComboBox15b = new ComboBox<>();
        valueComboBox15b.setItems(Challenge.values());
        valueComboBox15b.setValue(dataComponent.getChallengeCards().get(14).getDarkSide());

        ComboBox<Challenge> valueComboBox16b = new ComboBox<>();
        valueComboBox16b.setItems(Challenge.values());
        valueComboBox16b.setValue(dataComponent.getChallengeCards().get(15).getDarkSide());

        ComboBox<Challenge> valueComboBox17b = new ComboBox<>();
        valueComboBox17b.setItems(Challenge.values());
        valueComboBox17b.setValue(dataComponent.getChallengeCards().get(16).getDarkSide());

        ComboBox<Challenge> valueComboBox18b = new ComboBox<>();
        valueComboBox18b.setItems(Challenge.values());
        valueComboBox18b.setValue(dataComponent.getChallengeCards().get(17).getDarkSide());

        ComboBox<Challenge> valueComboBox19b = new ComboBox<>();
        valueComboBox19b.setItems(Challenge.values());
        valueComboBox19b.setValue(dataComponent.getChallengeCards().get(18).getDarkSide());

        ComboBox<Challenge> valueComboBox20b = new ComboBox<>();
        valueComboBox20b.setItems(Challenge.values());
        valueComboBox20b.setValue(dataComponent.getChallengeCards().get(19).getDarkSide());

        ComboBox<Challenge> valueComboBox21b = new ComboBox<>();
        valueComboBox21b.setItems(Challenge.values());
        valueComboBox21b.setValue(dataComponent.getChallengeCards().get(20).getDarkSide());

        ComboBox<Challenge> valueComboBox22b = new ComboBox<>();
        valueComboBox22b.setItems(Challenge.values());
        valueComboBox22b.setValue(dataComponent.getChallengeCards().get(21).getDarkSide());

        ComboBox<Challenge> valueComboBox23b = new ComboBox<>();
        valueComboBox23b.setItems(Challenge.values());
        valueComboBox23b.setValue(dataComponent.getChallengeCards().get(22).getDarkSide());

        ComboBox<Challenge> valueComboBox24b = new ComboBox<>();
        valueComboBox24b.setItems(Challenge.values());
        valueComboBox24b.setValue(dataComponent.getChallengeCards().get(23).getDarkSide());

        ComboBox<Challenge> valueComboBox25b = new ComboBox<>();
        valueComboBox25b.setItems(Challenge.values());
        valueComboBox25b.setValue(dataComponent.getChallengeCards().get(24).getDarkSide());

        ComboBox<Challenge> valueComboBox26b = new ComboBox<>();
        valueComboBox26b.setItems(Challenge.values());
        valueComboBox26b.setValue(dataComponent.getChallengeCards().get(25).getDarkSide());

        ComboBox<Challenge> valueComboBox27b = new ComboBox<>();
        valueComboBox27b.setItems(Challenge.values());
        valueComboBox27b.setValue(dataComponent.getChallengeCards().get(26).getDarkSide());

        ComboBox<Challenge> valueComboBox28b = new ComboBox<>();
        valueComboBox28b.setItems(Challenge.values());
        valueComboBox28b.setValue(dataComponent.getChallengeCards().get(27).getDarkSide());

        ComboBox<Challenge> valueComboBox29b = new ComboBox<>();
        valueComboBox29b.setItems(Challenge.values());
        valueComboBox29b.setValue(dataComponent.getChallengeCards().get(28).getDarkSide());

        ComboBox<Challenge> valueComboBox30b = new ComboBox<>();
        valueComboBox30b.setItems(Challenge.values());
        valueComboBox30b.setValue(dataComponent.getChallengeCards().get(29).getDarkSide());

        ComboBox<Challenge> valueComboBox31b = new ComboBox<>();
        valueComboBox31b.setItems(Challenge.values());
        valueComboBox31b.setValue(dataComponent.getChallengeCards().get(30).getDarkSide());

        ComboBox<Challenge> valueComboBox32b = new ComboBox<>();
        valueComboBox32b.setItems(Challenge.values());
        valueComboBox32b.setValue(dataComponent.getChallengeCards().get(31).getDarkSide());

        ComboBox<Challenge> valueComboBox33b = new ComboBox<>();
        valueComboBox33b.setItems(Challenge.values());
        valueComboBox33b.setValue(dataComponent.getChallengeCards().get(32).getDarkSide());

        ComboBox<Challenge> valueComboBox34b = new ComboBox<>();
        valueComboBox34b.setItems(Challenge.values());
        valueComboBox34b.setValue(dataComponent.getChallengeCards().get(33).getDarkSide());

        ComboBox<Challenge> valueComboBox35b = new ComboBox<>();
        valueComboBox35b.setItems(Challenge.values());
        valueComboBox35b.setValue(dataComponent.getChallengeCards().get(34).getDarkSide());

        ComboBox<Challenge> valueComboBox36b = new ComboBox<>();
        valueComboBox36b.setItems(Challenge.values());
        valueComboBox36b.setValue(dataComponent.getChallengeCards().get(35).getDarkSide());

        ComboBox<Challenge> valueComboBox37b = new ComboBox<>();
        valueComboBox37b.setItems(Challenge.values());
        valueComboBox37b.setValue(dataComponent.getChallengeCards().get(36).getDarkSide());

        ComboBox<Challenge> valueComboBox38b = new ComboBox<>();
        valueComboBox38b.setItems(Challenge.values());
        valueComboBox38b.setValue(dataComponent.getChallengeCards().get(37).getDarkSide());

        ComboBox<Challenge> valueComboBox39b = new ComboBox<>();
        valueComboBox39b.setItems(Challenge.values());
        valueComboBox39b.setValue(dataComponent.getChallengeCards().get(38).getDarkSide());

        ComboBox<Challenge> valueComboBox40b = new ComboBox<>();
        valueComboBox40b.setItems(Challenge.values());
        valueComboBox40b.setValue(dataComponent.getChallengeCards().get(39).getDarkSide());

        ComboBox<Challenge> valueComboBox41b = new ComboBox<>();
        valueComboBox41b.setItems(Challenge.values());
        valueComboBox41b.setValue(dataComponent.getChallengeCards().get(40).getDarkSide());

        ComboBox<Challenge> valueComboBox42b = new ComboBox<>();
        valueComboBox42b.setItems(Challenge.values());
        valueComboBox42b.setValue(dataComponent.getChallengeCards().get(41).getDarkSide());

        ComboBox<Challenge> valueComboBox43b = new ComboBox<>();
        valueComboBox43b.setItems(Challenge.values());
        valueComboBox43b.setValue(dataComponent.getChallengeCards().get(42).getDarkSide());

        ComboBox<Challenge> valueComboBox44b = new ComboBox<>();
        valueComboBox44b.setItems(Challenge.values());
        valueComboBox44b.setValue(dataComponent.getChallengeCards().get(43).getDarkSide());

        ComboBox<Challenge> valueComboBox45b = new ComboBox<>();
        valueComboBox45b.setItems(Challenge.values());
        valueComboBox45b.setValue(dataComponent.getChallengeCards().get(44).getDarkSide());

        ComboBox<Challenge> valueComboBox46b = new ComboBox<>();
        valueComboBox46b.setItems(Challenge.values());
        valueComboBox46b.setValue(dataComponent.getChallengeCards().get(45).getDarkSide());

        ComboBox<Challenge> valueComboBox47b = new ComboBox<>();
        valueComboBox47b.setItems(Challenge.values());
        valueComboBox47b.setValue(dataComponent.getChallengeCards().get(46).getDarkSide());

        ComboBox<Challenge> valueComboBox48b = new ComboBox<>();
        valueComboBox48b.setItems(Challenge.values());
        valueComboBox48b.setValue(dataComponent.getChallengeCards().get(47).getDarkSide());

        ComboBox<Challenge> valueComboBox49b = new ComboBox<>();
        valueComboBox49b.setItems(Challenge.values());
        valueComboBox49b.setValue(dataComponent.getChallengeCards().get(48).getDarkSide());

        ComboBox<Challenge> valueComboBox50b = new ComboBox<>();
        valueComboBox50b.setItems(Challenge.values());
        valueComboBox50b.setValue(dataComponent.getChallengeCards().get(49).getDarkSide());

        ComboBox<Challenge> valueComboBox51b = new ComboBox<>();
        valueComboBox51b.setItems(Challenge.values());
        valueComboBox51b.setValue(dataComponent.getChallengeCards().get(50).getDarkSide());

        ComboBox<Challenge> valueComboBox52b = new ComboBox<>();
        valueComboBox52b.setItems(Challenge.values());
        valueComboBox52b.setValue(dataComponent.getChallengeCards().get(51).getDarkSide());

        TextField card1 = new TextField();
        card1.setValue("Card 1");
        card1.setMaxWidth(textFieldLength);
        card1.setReadOnly(true);

        TextField card2 = new TextField();
        card2.setValue("Card 2");
        card2.setMaxWidth(textFieldLength);
        card2.setReadOnly(true);

        TextField card3 = new TextField();
        card3.setValue("Card 3");
        card3.setMaxWidth(textFieldLength);
        card3.setReadOnly(true);

        TextField card4 = new TextField();
        card4.setValue("Card 4");
        card4.setMaxWidth(textFieldLength);
        card4.setReadOnly(true);

        TextField card5 = new TextField();
        card5.setValue("Card 5");
        card5.setMaxWidth(textFieldLength);
        card5.setReadOnly(true);

        TextField card6 = new TextField();
        card6.setValue("Card 6");
        card6.setMaxWidth(textFieldLength);
        card6.setReadOnly(true);

        TextField card7 = new TextField();
        card7.setValue("Card 7");
        card7.setMaxWidth(textFieldLength);
        card7.setReadOnly(true);

        TextField card8 = new TextField();
        card8.setValue("Card 8");
        card8.setMaxWidth(textFieldLength);
        card8.setReadOnly(true);

        TextField card9 = new TextField();
        card9.setValue("Card 9");
        card9.setMaxWidth(textFieldLength);
        card9.setReadOnly(true);

        TextField card10 = new TextField();
        card10.setValue("Card 10");
        card10.setMaxWidth(textFieldLength);
        card10.setReadOnly(true);

        TextField card11 = new TextField();
        card11.setValue("Card 11");
        card11.setMaxWidth(textFieldLength);
        card11.setReadOnly(true);

        TextField card12 = new TextField();
        card12.setValue("Card 12");
        card12.setMaxWidth(textFieldLength);
        card12.setReadOnly(true);

        TextField card13 = new TextField();
        card13.setValue("Card 13");
        card13.setMaxWidth(textFieldLength);
        card13.setReadOnly(true);

        TextField card14 = new TextField();
        card14.setValue("Card 14");
        card14.setMaxWidth(textFieldLength);
        card14.setReadOnly(true);

        TextField card15 = new TextField();
        card15.setValue("Card 15");
        card15.setMaxWidth(textFieldLength);
        card15.setReadOnly(true);

        TextField card16 = new TextField();
        card16.setValue("Card 16");
        card16.setMaxWidth(textFieldLength);
        card16.setReadOnly(true);

        TextField card17 = new TextField();
        card17.setValue("Card 17");
        card17.setMaxWidth(textFieldLength);
        card17.setReadOnly(true);

        TextField card18 = new TextField();
        card18.setValue("Card 18");
        card18.setMaxWidth(textFieldLength);
        card18.setReadOnly(true);

        TextField card19 = new TextField();
        card19.setValue("Card 19");
        card19.setMaxWidth(textFieldLength);
        card19.setReadOnly(true);

        TextField card20 = new TextField();
        card20.setValue("Card 20");
        card20.setMaxWidth(textFieldLength);
        card20.setReadOnly(true);

        TextField card21 = new TextField();
        card21.setValue("Card 21");
        card21.setMaxWidth(textFieldLength);
        card21.setReadOnly(true);

        TextField card22 = new TextField();
        card22.setValue("Card 22");
        card22.setMaxWidth(textFieldLength);
        card22.setReadOnly(true);

        TextField card23 = new TextField();
        card23.setValue("Card 23");
        card23.setMaxWidth(textFieldLength);
        card23.setReadOnly(true);

        TextField card24 = new TextField();
        card24.setValue("Card 24");
        card24.setMaxWidth(textFieldLength);
        card24.setReadOnly(true);

        TextField card25 = new TextField();
        card25.setValue("Card 25");
        card25.setMaxWidth(textFieldLength);
        card25.setReadOnly(true);

        TextField card26 = new TextField();
        card26.setValue("Card 26");
        card26.setMaxWidth(textFieldLength);
        card26.setReadOnly(true);

        TextField card27 = new TextField();
        card27.setValue("Card 27");
        card27.setMaxWidth(textFieldLength);
        card27.setReadOnly(true);

        TextField card28 = new TextField();
        card28.setValue("Card 28");
        card28.setMaxWidth(textFieldLength);
        card28.setReadOnly(true);

        TextField card29 = new TextField();
        card29.setValue("Card 29");
        card29.setMaxWidth(textFieldLength);
        card29.setReadOnly(true);

        TextField card30 = new TextField();
        card30.setValue("Card 30");
        card30.setMaxWidth(textFieldLength);
        card30.setReadOnly(true);

        TextField card31 = new TextField();
        card31.setValue("Card 31");
        card31.setMaxWidth(textFieldLength);
        card31.setReadOnly(true);

        TextField card32 = new TextField();
        card32.setValue("Card 32");
        card32.setMaxWidth(textFieldLength);
        card32.setReadOnly(true);

        TextField card33 = new TextField();
        card33.setValue("Card 33");
        card33.setMaxWidth(textFieldLength);
        card33.setReadOnly(true);

        TextField card34 = new TextField();
        card34.setValue("Card 34");
        card34.setMaxWidth(textFieldLength);
        card34.setReadOnly(true);

        TextField card35 = new TextField();
        card35.setValue("Card 35");
        card35.setMaxWidth(textFieldLength);
        card35.setReadOnly(true);

        TextField card36 = new TextField();
        card36.setValue("Card 36");
        card36.setMaxWidth(textFieldLength);
        card36.setReadOnly(true);

        TextField card37 = new TextField();
        card37.setValue("Card 37");
        card37.setMaxWidth(textFieldLength);
        card37.setReadOnly(true);

        TextField card38 = new TextField();
        card38.setValue("Card 38");
        card38.setMaxWidth(textFieldLength);
        card38.setReadOnly(true);

        TextField card39 = new TextField();
        card39.setValue("Card 39");
        card39.setMaxWidth(textFieldLength);
        card39.setReadOnly(true);

        TextField card40 = new TextField();
        card40.setValue("Card 40");
        card40.setMaxWidth(textFieldLength);
        card40.setReadOnly(true);

        TextField card41 = new TextField();
        card41.setValue("Card 41");
        card41.setMaxWidth(textFieldLength);
        card41.setReadOnly(true);

        TextField card42 = new TextField();
        card42.setValue("Card 42");
        card42.setMaxWidth(textFieldLength);
        card42.setReadOnly(true);

        TextField card43 = new TextField();
        card43.setValue("Card 43");
        card43.setMaxWidth(textFieldLength);
        card43.setReadOnly(true);

        TextField card44 = new TextField();
        card44.setValue("Card 44");
        card44.setMaxWidth(textFieldLength);
        card44.setReadOnly(true);

        TextField card45 = new TextField();
        card45.setValue("Card 45");
        card45.setMaxWidth(textFieldLength);
        card45.setReadOnly(true);

        TextField card46 = new TextField();
        card46.setValue("Card 46");
        card46.setMaxWidth(textFieldLength);
        card46.setReadOnly(true);

        TextField card47 = new TextField();
        card47.setValue("Card 47");
        card47.setMaxWidth(textFieldLength);
        card47.setReadOnly(true);

        TextField card48 = new TextField();
        card48.setValue("Card 48");
        card48.setMaxWidth(textFieldLength);
        card48.setReadOnly(true);

        TextField card49 = new TextField();
        card49.setValue("Card 49");
        card49.setMaxWidth(textFieldLength);
        card49.setReadOnly(true);

        TextField card50 = new TextField();
        card50.setValue("Card 50");
        card50.setMaxWidth(textFieldLength);
        card50.setReadOnly(true);

        TextField card51 = new TextField();
        card51.setValue("Card 51");
        card51.setMaxWidth(textFieldLength);
        card51.setReadOnly(true);

        TextField card52 = new TextField();
        card52.setValue("Card 52");
        card52.setMaxWidth(textFieldLength);
        card52.setReadOnly(true);

        HorizontalLayout layout1 = new HorizontalLayout();
        HorizontalLayout layout2 = new HorizontalLayout();
        HorizontalLayout layout3 = new HorizontalLayout();
        HorizontalLayout layout4 = new HorizontalLayout();
        HorizontalLayout layout5 = new HorizontalLayout();
        HorizontalLayout layout6 = new HorizontalLayout();
        HorizontalLayout layout7 = new HorizontalLayout();
        HorizontalLayout layout8 = new HorizontalLayout();
        HorizontalLayout layout9 = new HorizontalLayout();
        HorizontalLayout layout10 = new HorizontalLayout();
        HorizontalLayout layout11 = new HorizontalLayout();
        HorizontalLayout layout12 = new HorizontalLayout();
        HorizontalLayout layout13 = new HorizontalLayout();
        HorizontalLayout layout14 = new HorizontalLayout();
        HorizontalLayout layout15 = new HorizontalLayout();
        HorizontalLayout layout16 = new HorizontalLayout();
        HorizontalLayout layout17 = new HorizontalLayout();
        HorizontalLayout layout18 = new HorizontalLayout();
        HorizontalLayout layout19 = new HorizontalLayout();
        HorizontalLayout layout20 = new HorizontalLayout();
        HorizontalLayout layout21 = new HorizontalLayout();
        HorizontalLayout layout22 = new HorizontalLayout();
        HorizontalLayout layout23 = new HorizontalLayout();
        HorizontalLayout layout24 = new HorizontalLayout();
        HorizontalLayout layout25 = new HorizontalLayout();
        HorizontalLayout layout26 = new HorizontalLayout();
        HorizontalLayout layout27 = new HorizontalLayout();
        HorizontalLayout layout28 = new HorizontalLayout();
        HorizontalLayout layout29 = new HorizontalLayout();
        HorizontalLayout layout30 = new HorizontalLayout();
        HorizontalLayout layout31 = new HorizontalLayout();
        HorizontalLayout layout32 = new HorizontalLayout();
        HorizontalLayout layout33 = new HorizontalLayout();
        HorizontalLayout layout34 = new HorizontalLayout();
        HorizontalLayout layout35 = new HorizontalLayout();
        HorizontalLayout layout36 = new HorizontalLayout();
        HorizontalLayout layout37 = new HorizontalLayout();
        HorizontalLayout layout38 = new HorizontalLayout();
        HorizontalLayout layout39 = new HorizontalLayout();
        HorizontalLayout layout40 = new HorizontalLayout();
        HorizontalLayout layout41 = new HorizontalLayout();
        HorizontalLayout layout42 = new HorizontalLayout();
        HorizontalLayout layout43 = new HorizontalLayout();
        HorizontalLayout layout44 = new HorizontalLayout();
        HorizontalLayout layout45 = new HorizontalLayout();
        HorizontalLayout layout46 = new HorizontalLayout();
        HorizontalLayout layout47 = new HorizontalLayout();
        HorizontalLayout layout48 = new HorizontalLayout();
        HorizontalLayout layout49 = new HorizontalLayout();
        HorizontalLayout layout50 = new HorizontalLayout();
        HorizontalLayout layout51 = new HorizontalLayout();
        HorizontalLayout layout52 = new HorizontalLayout();

        add(layout1,
                layout2,
                layout3,
                layout5,
                layout6,
                layout7,
                layout8,
                layout9,
                layout10,
                layout11,
                layout12,
                layout13,
                layout14,
                layout15,
                layout16,
                layout17,
                layout18,
                layout19,
                layout20,
                layout21,
                layout22,
                layout23,
                layout24,
                layout25,
                layout26,
                layout27,
                layout28,
                layout29,
                layout30,
                layout31,
                layout32,
                layout33,
                layout34,
                layout35,
                layout36,
                layout37,
                layout38,
                layout39,
                layout40,
                layout41,
                layout42,
                layout43,
                layout44,
                layout45,
                layout46,
                layout47,
                layout48,
                layout49,
                layout50,
                layout51,
                layout52
        );

        layout1.add(card1, valueComboBox1, valueComboBox1b);
        layout2.add(card2, valueComboBox2, valueComboBox2b);
        layout3.add(card3, valueComboBox3, valueComboBox3b);
        layout4.add(card4, valueComboBox4, valueComboBox4b);
        layout5.add(card5, valueComboBox5, valueComboBox5b);
        layout6.add(card6, valueComboBox6, valueComboBox6b);
        layout7.add(card7, valueComboBox7, valueComboBox7b);
        layout8.add(card8, valueComboBox8, valueComboBox8b);
        layout9.add(card9, valueComboBox9, valueComboBox9b);
        layout10.add(card10, valueComboBox10, valueComboBox10b);
        layout11.add(card11, valueComboBox11, valueComboBox11b);
        layout12.add(card12, valueComboBox12, valueComboBox12b);
        layout13.add(card13, valueComboBox13, valueComboBox13b);
        layout14.add(card14, valueComboBox14, valueComboBox14b);
        layout15.add(card15, valueComboBox15, valueComboBox15b);
        layout16.add(card16, valueComboBox16, valueComboBox16b);
        layout17.add(card17, valueComboBox17, valueComboBox17b);
        layout18.add(card18, valueComboBox18, valueComboBox18b);
        layout19.add(card19, valueComboBox19, valueComboBox19b);
        layout20.add(card20, valueComboBox20, valueComboBox20b);
        layout21.add(card21, valueComboBox21, valueComboBox21b);
        layout22.add(card22, valueComboBox22, valueComboBox22b);
        layout23.add(card23, valueComboBox23, valueComboBox23b);
        layout24.add(card24, valueComboBox24, valueComboBox24b);
        layout25.add(card25, valueComboBox25, valueComboBox25b);
        layout26.add(card26, valueComboBox26, valueComboBox26b);
        layout27.add(card27, valueComboBox27, valueComboBox27b);
        layout28.add(card28, valueComboBox28, valueComboBox28b);
        layout29.add(card29, valueComboBox29, valueComboBox29b);
        layout30.add(card30, valueComboBox30, valueComboBox30b);
        layout31.add(card31, valueComboBox31, valueComboBox31b);
        layout32.add(card32, valueComboBox32, valueComboBox32b);
        layout33.add(card33, valueComboBox33, valueComboBox33b);
        layout34.add(card34, valueComboBox34, valueComboBox34b);
        layout35.add(card35, valueComboBox35, valueComboBox35b);
        layout36.add(card36, valueComboBox36, valueComboBox36b);
        layout37.add(card37, valueComboBox37, valueComboBox37b);
        layout38.add(card38, valueComboBox38, valueComboBox38b);
        layout39.add(card39, valueComboBox39, valueComboBox39b);
        layout40.add(card40, valueComboBox40, valueComboBox40b);
        layout41.add(card41, valueComboBox41, valueComboBox41b);
        layout42.add(card42, valueComboBox42, valueComboBox42b);
        layout43.add(card43, valueComboBox43, valueComboBox43b);
        layout44.add(card44, valueComboBox44, valueComboBox44b);
        layout45.add(card45, valueComboBox45, valueComboBox45b);
        layout46.add(card46, valueComboBox46, valueComboBox46b);
        layout47.add(card47, valueComboBox47, valueComboBox47b);
        layout48.add(card48, valueComboBox48, valueComboBox48b);
        layout49.add(card49, valueComboBox49, valueComboBox49b);
        layout50.add(card50, valueComboBox50, valueComboBox50b);
        layout51.add(card51, valueComboBox51, valueComboBox51b);
        layout52.add(card52, valueComboBox52, valueComboBox52b);

        Button saveCards = new Button();
        saveCards.setText("Save Challenge Cards");
        saveCards.addClickListener(event -> {
            dataComponent.getChallengeCards().add(0, new ChallengeCard(valueComboBox1.getValue(), valueComboBox1b.getValue()));
            dataComponent.getChallengeCards().add(1, new ChallengeCard(valueComboBox2.getValue(), valueComboBox2b.getValue()));
            dataComponent.getChallengeCards().add(2, new ChallengeCard(valueComboBox3.getValue(), valueComboBox3b.getValue()));
            dataComponent.getChallengeCards().add(3, new ChallengeCard(valueComboBox4.getValue(), valueComboBox4b.getValue()));
            dataComponent.getChallengeCards().add(4, new ChallengeCard(valueComboBox5.getValue(), valueComboBox5b.getValue()));
            dataComponent.getChallengeCards().add(5, new ChallengeCard(valueComboBox6.getValue(), valueComboBox6b.getValue()));
            dataComponent.getChallengeCards().add(6, new ChallengeCard(valueComboBox7.getValue(), valueComboBox7b.getValue()));
            dataComponent.getChallengeCards().add(7, new ChallengeCard(valueComboBox8.getValue(), valueComboBox8b.getValue()));
            dataComponent.getChallengeCards().add(8, new ChallengeCard(valueComboBox9.getValue(), valueComboBox9b.getValue()));
            dataComponent.getChallengeCards().add(9, new ChallengeCard(valueComboBox10.getValue(), valueComboBox10b.getValue()));
            dataComponent.getChallengeCards().add(10, new ChallengeCard(valueComboBox11.getValue(), valueComboBox11b.getValue()));
            dataComponent.getChallengeCards().add(11, new ChallengeCard(valueComboBox12.getValue(), valueComboBox12b.getValue()));
            dataComponent.getChallengeCards().add(12, new ChallengeCard(valueComboBox13.getValue(), valueComboBox13b.getValue()));
            dataComponent.getChallengeCards().add(13, new ChallengeCard(valueComboBox14.getValue(), valueComboBox14b.getValue()));
            dataComponent.getChallengeCards().add(14, new ChallengeCard(valueComboBox15.getValue(), valueComboBox15b.getValue()));
            dataComponent.getChallengeCards().add(15, new ChallengeCard(valueComboBox16.getValue(), valueComboBox16b.getValue()));
            dataComponent.getChallengeCards().add(16, new ChallengeCard(valueComboBox17.getValue(), valueComboBox17b.getValue()));
            dataComponent.getChallengeCards().add(17, new ChallengeCard(valueComboBox18.getValue(), valueComboBox18b.getValue()));
            dataComponent.getChallengeCards().add(18, new ChallengeCard(valueComboBox19.getValue(), valueComboBox19b.getValue()));
            dataComponent.getChallengeCards().add(19, new ChallengeCard(valueComboBox20.getValue(), valueComboBox20b.getValue()));
            dataComponent.getChallengeCards().add(20, new ChallengeCard(valueComboBox21.getValue(), valueComboBox21b.getValue()));
            dataComponent.getChallengeCards().add(21, new ChallengeCard(valueComboBox22.getValue(), valueComboBox22b.getValue()));
            dataComponent.getChallengeCards().add(22, new ChallengeCard(valueComboBox23.getValue(), valueComboBox23b.getValue()));
            dataComponent.getChallengeCards().add(23, new ChallengeCard(valueComboBox24.getValue(), valueComboBox24b.getValue()));
            dataComponent.getChallengeCards().add(24, new ChallengeCard(valueComboBox25.getValue(), valueComboBox25b.getValue()));
            dataComponent.getChallengeCards().add(25, new ChallengeCard(valueComboBox26.getValue(), valueComboBox26b.getValue()));
            dataComponent.getChallengeCards().add(26, new ChallengeCard(valueComboBox27.getValue(), valueComboBox27b.getValue()));
            dataComponent.getChallengeCards().add(27, new ChallengeCard(valueComboBox28.getValue(), valueComboBox28b.getValue()));
            dataComponent.getChallengeCards().add(28, new ChallengeCard(valueComboBox29.getValue(), valueComboBox29b.getValue()));
            dataComponent.getChallengeCards().add(29, new ChallengeCard(valueComboBox30.getValue(), valueComboBox30b.getValue()));
            dataComponent.getChallengeCards().add(30, new ChallengeCard(valueComboBox31.getValue(), valueComboBox31b.getValue()));
            dataComponent.getChallengeCards().add(31, new ChallengeCard(valueComboBox32.getValue(), valueComboBox32b.getValue()));
            dataComponent.getChallengeCards().add(32, new ChallengeCard(valueComboBox33.getValue(), valueComboBox33b.getValue()));
            dataComponent.getChallengeCards().add(33, new ChallengeCard(valueComboBox34.getValue(), valueComboBox34b.getValue()));
            dataComponent.getChallengeCards().add(34, new ChallengeCard(valueComboBox35.getValue(), valueComboBox35b.getValue()));
            dataComponent.getChallengeCards().add(35, new ChallengeCard(valueComboBox36.getValue(), valueComboBox36b.getValue()));
            dataComponent.getChallengeCards().add(36, new ChallengeCard(valueComboBox37.getValue(), valueComboBox37b.getValue()));
            dataComponent.getChallengeCards().add(37, new ChallengeCard(valueComboBox38.getValue(), valueComboBox38b.getValue()));
            dataComponent.getChallengeCards().add(38, new ChallengeCard(valueComboBox39.getValue(), valueComboBox39b.getValue()));
            dataComponent.getChallengeCards().add(39, new ChallengeCard(valueComboBox40.getValue(), valueComboBox40b.getValue()));
            dataComponent.getChallengeCards().add(40, new ChallengeCard(valueComboBox41.getValue(), valueComboBox41b.getValue()));
            dataComponent.getChallengeCards().add(41, new ChallengeCard(valueComboBox42.getValue(), valueComboBox42b.getValue()));
            dataComponent.getChallengeCards().add(42, new ChallengeCard(valueComboBox43.getValue(), valueComboBox43b.getValue()));
            dataComponent.getChallengeCards().add(43, new ChallengeCard(valueComboBox44.getValue(), valueComboBox44b.getValue()));
            dataComponent.getChallengeCards().add(44, new ChallengeCard(valueComboBox45.getValue(), valueComboBox45b.getValue()));
            dataComponent.getChallengeCards().add(45, new ChallengeCard(valueComboBox46.getValue(), valueComboBox46b.getValue()));
            dataComponent.getChallengeCards().add(46, new ChallengeCard(valueComboBox47.getValue(), valueComboBox47b.getValue()));
            dataComponent.getChallengeCards().add(47, new ChallengeCard(valueComboBox48.getValue(), valueComboBox48b.getValue()));
            dataComponent.getChallengeCards().add(48, new ChallengeCard(valueComboBox49.getValue(), valueComboBox49b.getValue()));
            dataComponent.getChallengeCards().add(49, new ChallengeCard(valueComboBox50.getValue(), valueComboBox50b.getValue()));
            dataComponent.getChallengeCards().add(50, new ChallengeCard(valueComboBox51.getValue(), valueComboBox51b.getValue()));
            dataComponent.getChallengeCards().add(51, new ChallengeCard(valueComboBox52.getValue(), valueComboBox52b.getValue()));

            saveCards.setText("Challenge Cards saved!");
        });
        Button resetCards = new Button();
        resetCards.setText("Reset Challenge Cards");
        resetCards.addClickListener(event -> {
            dataComponent.resetChallengeSet();
            UI.getCurrent().getPage().reload();
        });
        add(saveCards, resetCards);
    }
}
