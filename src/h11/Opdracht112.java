package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht112 extends Applet {



    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int i;
        int y = 0;
        for (i = 20; i > 10;i--){
            y += 20;
            g.drawString(String.valueOf(i),y,20);
        }
    }

}
