package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht101 extends Applet {

    TextField start;
    String s,text;
    int getal1,getal2;

    @Override
    public void init() {
        start = new TextField("",20);
        start.addActionListener(new startListener());
        getal1 = 0;
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
            }
        }

    @Override
    public void paint(Graphics g) {
        g.drawString(text,20,20);
    }

}
