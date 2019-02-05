package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends Applet {

    Button knop;
    String tekst;
    Button label;
    String tekst2;


    @Override
    public void init() {
        tekst = "";
        tekst2 ="ggg";
        knop = new Button("ok");
        add(knop);
        label = new Button("hoi ik ben test object");
        add(label);

        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        //---------------------------
        labelListener testt = new labelListener();
        label.addActionListener(testt);
    }

    @Override
    public void paint(Graphics g) {

        g.drawString(tekst, 50, 70);
    }


    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tekst = "Er is geklikt";
            repaint();
        }
    }

    class labelListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            tekst = "hallo";
            repaint();
        }
    }

}




