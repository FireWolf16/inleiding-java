package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht406 extends Applet {

    @Override
    public void init() {
        setSize(800,800);
        setBackground(Color.gray);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRoundRect(200, 100, 400, 600, 400, 400);
        g.setColor(Color.black);
        g.fillRoundRect(220, 120, 360, 560, 400, 400);
        g.setColor(Color.red);
        g.fillOval(350, 180, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(350, 315, 100, 100);
        g.setColor(Color.green);
        g.fillOval(350, 450, 100, 100);
    }
}
