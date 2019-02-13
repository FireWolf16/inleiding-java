package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht114 extends Applet {



    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int i;
        int y = 0;
        int x;
        for (i = 0; i <= 10; i++) {
            y += 20;
            x = i * 3;
            g.drawString(String.valueOf(x),20,y);
        }
    }

}
