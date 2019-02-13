package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    Label uitleg;
    TextField text;
    Button knop;
    String s,tafel;
    int GetalTafel,y;
    @Override
    public void init() {
        uitleg = new Label("type hier een getal van 1 tot 10");
        text = new TextField("",15);
        knop = new Button("Ok");
        //----------------------------------
        add(uitleg);
        add(text);
        add(knop);
        //----------------------------------
        knop.addActionListener(new knopListener());
    }

    class knopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           s = text.getText();
            GetalTafel = Integer.parseInt( s );
            repaint();

        }
    }

    @Override
    public void paint(Graphics g) {
        for (int i =1; i <= 10; i++) {
            if (GetalTafel == 0){
                g.drawString("Geen getal ingevoerd",50,50);
            } else {
                g.drawString( i + " * " + String.valueOf(GetalTafel) + " = " + i * GetalTafel,50,y);
                y += 20;
            }
            if (i == 10){
                y = 50;
            }
        }
    }

}
