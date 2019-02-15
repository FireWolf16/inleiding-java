package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht133 extends Applet {

    Button muurRood, muurgrijs;
    Button clear;
    int wall = 0;

    @Override
    public void init() {
        muurRood = new Button("print red wall");
        muurgrijs = new Button("print grey wall");
        clear = new Button("maak scherm leeg");
        //-------------------------------------------
        add(muurRood);
        add(muurgrijs);
        add(clear);
        //-------------------------------------------
        muurRood.addActionListener(new muurRoodListener());
        muurgrijs.addActionListener(new muurgrijsListener());
        clear.addActionListener(new clears());
    }

    class muurRoodListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            wall = 1;
            repaint();
        }
    }

    class muurgrijsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            wall = 2;
            repaint();
        }
    }

    class clears implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wall = 0;
            repaint();
        }
    }


    void drawWall(Graphics g, int x, int y, int ww, int hw) {//ww = width wall, hw = height wall
//opdracht 133
        g.setColor(new Color(100, 100, 100));
        g.fillRect(x, y, ww, hw);
        //de stenen
        g.setColor(new Color(150, 50, 50));

        for (int a = 0; a <= ((hw - 3) / 18) - 1; a++) {

            if (a % 2 == 0) {
                for (int i = 0; i <= ((ww - 3) / 33) - 1; i++) {
                    g.fillRect((x + 3) + 33 * i, (y + 3) + 18 * a, 30, 15);
                }
            } else {
                for (int b = 0; b <= ((ww - 3) / 33) - 2; b++) {
                    g.fillRect((x + 21) + 33 * b, (y + 3) + 18 * a, 30, 15);
                    g.fillRect((x + 3), (y + 3) + 18 * a, 15, 15);//begin steentjes
                    g.fillRect(x + (((ww - 3) / 33) * 33 - 12), (y + 3) + 18 * a, 15, 15);//eind steentjes
                }
            }
        }
    }

    void betonMuur(Graphics g, int x, int y, int ww, int wh) {//ww wallwidth wh wall height
        g.setColor(new Color(50, 50, 50));
        g.fillRect(x, y, ww, wh);
        for (int i = 0; i <= ((wh - 5) / 50) - 1; i++) {
            if (i % 2 == 0) {
                for (int a = 0; a <= ((ww - 5) / 95) - 1; a++) {
                    g.fillRect((x + 5) + 95 * a, (y + 5) + 50 * i, 90, 45);
                }
            } else {
                for (int b = 0; b <= ((ww - 5) / 95) - 2; b++) {
                    g.fillRect((x + 55) + 95 * b, (y + 5) + 50 * i, 90, 45);
                    g.fillRect((x + 5), (y + 5) + 50 * i, 45, 45);//begin steentjes
                    g.fillRect(x + (((ww - 5) / 95) * 95 - 40), (y + 5) + 50 * i, 45, 45);//eind steentjes
                }
            }
        }
    }


    @Override
    public void paint(Graphics g) {
        switch (wall) {
            case 0:
                break;
            case 1:
                drawWall(g, 20, 20, 1160, 660);
                break;
            case 2:
                betonMuur(g, 20, 20, 1160, 660);
                break;
            default:
                break;
        }
    }
}
