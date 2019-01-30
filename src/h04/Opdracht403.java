package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht403 extends Applet {
    @Override
    public void init() {
        setSize(800,800);
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRoundRect(50,100,50,800,50,50);
        g.drawRect(100,200,500,100);
        g.setColor(Color.red);
        g.fillRect(100,200,500,100);
        g.setColor(Color.black);
        g.drawRect(100,300,500,100);
        g.setColor(Color.blue);
        g.fillRect(100,400,500,100);
    }
}

