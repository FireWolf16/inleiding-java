package h08;

import java.applet.Applet;
import java.awt.*;

public class Voorbeeld801 extends Applet {

    Button knop;

    @Override
    public void init() {
        knop = new Button();
        knop.setLabel( "Klik op mij" );
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?",50,60);
    }
}
