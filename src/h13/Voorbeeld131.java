package h13;

import java.awt.*;
import java.applet.*;

public class Voorbeeld131 extends Applet {

    double gem;

    public void init() {
        berekenGemiddelde();
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gem, 50, 60 );
    }

    void berekenGemiddelde() {
        double som;
        double a = 5, b = 6;

        som = a + b;
        gem = som / 2;
    }
}