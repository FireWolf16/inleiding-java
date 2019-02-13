package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht116 extends Applet {

    @Override
    public void init() {
        setSize(800,800);
    }

    @Override
    public void paint(Graphics g) {
        int i;
        int y = 0;
        int x = 0;
        int m = 0;
        int k = 0;
        for (i = 1; i < 5; i++){
            y = 50 * i;
            x = y / i;
            g.drawOval(x,x,y,y);
        }
    }


}
