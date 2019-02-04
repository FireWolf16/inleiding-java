package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht603 extends Applet {

    int int1;
    int int2;
    int negatieve;

    @Override
    public void init() {
        int1 = 5;
        int2 = 5;
        negatieve = int1 + int2;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("uitkomst is " + negatieve,20,20);
    }
}
