package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht407 extends Applet {

    @Override
    public void init() {
        setSize(800,800);

    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(200,200,200,200);
        g.fillOval(230,240,30,30);
        g.fillOval(335,240,30,30);
        g.fillOval(230,320,30,30);
        g.fillOval(335,320,30,30);
    }

}
