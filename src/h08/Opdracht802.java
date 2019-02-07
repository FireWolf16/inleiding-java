package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht802 extends Applet {

    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    int startM;
    int startV;

    @Override
    public void init() {
        knop1 = new Button("+ 1 male");
        knop2 = new Button("- 1 male");
        knop3 = new Button("+ 1 women");
        knop4 = new Button("- 1 women");
        add (knop1);
        add (knop2);
        add (knop3);
        add (knop4);
        //----------------------------------------------
        knop1Listener eenMeer = new knop1Listener();
        knop1.addActionListener(eenMeer);
        //----------------------------------------------
        knop2Listener eenMinder = new knop2Listener();
        knop2.addActionListener(eenMinder);
        //----------------------------------------------
        knop3Listener eenMeerV = new knop3Listener();
        knop3.addActionListener(eenMeerV);
        //----------------------------------------------
        knop4Listener eenMinderV = new knop4Listener();
        knop4.addActionListener(eenMinderV);
        //----------------------------------------------
        startM = 0;
        startV = 0;

    }

    class knop1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            startM ++;
            repaint();
        }
    }

    class knop2Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (startM == 0) {
                startM = 0; } else {
                startM --;
            }
            repaint();
        }
    }

    class knop3Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            startV ++;
            repaint();
        }
    }

    class knop4Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (startV == 0) {
                startV = 0; } else {
                startV --;
            }
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Aantal mannen " + startM,50,50);
        g.drawString("Aantal vrouwen " + startV,50,70);
    }
}
