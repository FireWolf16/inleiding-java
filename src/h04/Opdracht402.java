package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht402 extends Applet {

    @Override
    public void init() {
        setSize(800,800);
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(50, 400, 700, 400);
        g.drawLine(400,10,50,400);
        g.drawLine(400,10,750,400);
        g.drawRect(100, 600, 100, 200);
        g.drawRect(300, 500, 350, 250);
    }
}
