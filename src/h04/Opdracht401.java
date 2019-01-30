package h04;

import java.applet.*;
import java.awt.*;

public class Opdracht401 extends Applet {

    @Override
    public void init() {
        setSize(1000,1000);
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawLine(500,250,250,750);
        g.drawLine(500,250,750,750);
        g.drawLine(250,750,750,750);
    }
}
