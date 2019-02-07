package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht803 extends Applet {

    TextField text;
    Label label;
    Button knop;
    double getal;
    double getal2;
    double BTW;

    @Override
    public void init() {
        text = new TextField("",20);
        label = new Label("");
        knop = new Button("OK");
        BTW = 0.21;
        //--------------------------------------
        knopListener OK = new knopListener();
        knop.addActionListener((ActionListener) OK);
        //--------------------------------------
        add (text);
        add (knop);
        add (label);

    }

    class knopListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = text.getText();
            getal = Double.parseDouble( s ) * BTW;
            getal2 = Double.parseDouble(text.getText()) + getal;
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("BTW is: " + getal, 50, 60 );
        g.drawString("inclusief BTW: " + getal2, 50, 80 );
    }
}
