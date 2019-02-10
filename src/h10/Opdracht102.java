package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht102 extends Applet {
    TextField start;
    String s,text,textklein;
    int getal1,getal2,klein;
    int startGetal = (int)(19*Math.random()) + 1;

    @Override
    public void init() {
        start = new TextField("",20);
        start.addActionListener(new startListener());
        getal1 = 0;
        klein = startGetal;
        add(start);
    }

    class startListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            s = start.getText();
            getal2 = Integer.parseInt(s);
            text = String.valueOf(getal1);
            repaint();
            if (getal1 < getal2) {
                text = String.valueOf(getal2);
                getal1 = getal2;
            } else {
                text = String.valueOf(getal1);
            }
            if (getal2 > klein) {
                textklein = String.valueOf(klein);
            } else {
                textklein = String.valueOf(getal2);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(text,20,20);
        g.drawString("" + textklein,20,40);
    }
}
