package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht115 extends Applet {


    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int i = 0;
        int y = 0;
        while (i < 5){
            y += 30;
            g.drawRect(y,y,30,30);
            i++;
        }
    }
}
