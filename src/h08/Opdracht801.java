package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht801 extends Applet {

    TextField text;
    Label antwoord;
    Button OK;
    Button reset;
    String leeg;

    @Override
    public void init() {
        leeg = "";
        text = new TextField("",20);
        antwoord = new Label("type hier iets.");
        OK = new Button("OK");
        reset = new Button("Reset");
        add (antwoord);
        add (text);
        add (OK);
        add (reset);

        OkListener Print = new OkListener();
        OK.addActionListener(Print);

        resetListener Gone = new resetListener();
        reset.addActionListener(Gone);
    }

    class OkListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            leeg = text.getText();
            repaint();
        }
    }

    class resetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            leeg = "";
            text.setText("");
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(leeg, 50,50);
    }
}

//Wat is event-handling?: als een besturingssysteem een methode op roept die bij een bepaalde opdracht hoord.
//Wat is een gebruikersinterface?: De gebruikersinterface zorgt ervoor dat de gebruiker geleid wordt. Het zorgt ook voor meer aantrekkelijkheid voor het gebruik van een bepaald programma.
//Waarom moet er voor een knop wel en voor een tekst geen event-handling geprogrammeerd worden?: want een knop doet iets en text geeft allen informatie.
//Wat is een lege string?: een lege string is ""
//Wat is het verschil tussen een tekstvak en een label?: een label is allen text en een textvak is een vak waar in getypts kan worden door de gebruiker.
//Waarom moeten getallen uit een tekstvak altijd geconverteerd worden naar een double of een int? anders word het als een string gezien en an er niet mee gerekend worden.