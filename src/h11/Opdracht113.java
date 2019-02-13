package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht113 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int x=0,m=1,z,i,count=14,y = 0;
        for(i = 2; i < count; ++i) {
            z = x + m;
            x = m;
            m = z;
            y += 20;
            g.drawString(String.valueOf(x),y,20);
        }
    }
    }
