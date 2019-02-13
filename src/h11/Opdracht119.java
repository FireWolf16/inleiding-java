package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht119 extends Applet {


    @Override
    public void init() {
        setBackground(Color.GRAY);
    }

    public void paint(Graphics g) {
//de x en y coordinaten
        int x = 50;
        int y = 50;
        for (int rij = 0; rij < 8; rij++) {
            if (rij == 0 || rij == 2 || rij == 4 || rij == 6) {
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 20, 20);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 20, 20);
                    }
                    x += 20;
                }
                y = y + 20;
                x = 50;
            } else {
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 20, 20);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 20, 20);
                    }
                    x += 20;
                }
                y = y + 20;
                x = 50;
            }
        }
    }
}
        //tweede rij
//        x = 50;
//        y += 20;
//
//        for (int kolom = 0; kolom < 8; kolom++) {
//            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
//                g.setColor(Color.white);
//                g.fillRect(x, y, 20, 20);
//            } else {
//                g.setColor(Color.black);
//                g.fillRect(x, y, 20, 20);
//
//            }
//            x += 20;
//        }



