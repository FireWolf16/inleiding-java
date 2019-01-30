package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht405 extends Applet {

    @Override
    public void init() {
        setSize(800,800);
        setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(100,100,600,600,90,360);
    }
}
