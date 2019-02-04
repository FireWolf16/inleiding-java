package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht602 extends Applet {

    int seconde;
    int minuut;
    int uur;
    int dag;
    int jaar;

    @Override
    public void init() {
        seconde = 1;
        minuut = seconde * 60;
        uur = minuut * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("uitkomst is " + jaar + " seconde in een jaar",20,20);
    }
}
