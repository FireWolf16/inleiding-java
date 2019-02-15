package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht121 extends Applet {

    int[] getallen = {1,2,3,4,5,6,7,8,9,10};
    double gemmidelde;
    @Override
    public void init() {
        gemmidelde = (getallen[1] + getallen[2] + getallen[3] + getallen[4] + getallen[5] + getallen[6] + getallen[7] + getallen[8] + getallen[9] + getallen[10]) / getallen.length;
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < getallen.length; i ++) {
            g.drawString("" + getallen[i], 50, 20 * i + 20);
        }
        g.drawString("" + gemmidelde,60,50);
    }

}
