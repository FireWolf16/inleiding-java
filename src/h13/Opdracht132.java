package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht132 extends Applet {


    @Override
    public void init() {
        setSize(1000,1000);
    }

    @Override
    public void paint(Graphics g) {
        maakMuur(g,0,0,500,500);
    }

    void maakMuur (Graphics g, int x, int y, int ww, int hw){
        g.setColor(new Color(100, 100, 100));
        g.fillRect(x, y, ww, hw);
        g.setColor(new Color(150, 50, 50));
        for (int a = 0; a <= ((hw - 3) / 18) - 1; a++){
            if (a % 2 == 0) {
                for (int i = 0; i <= ((ww - 3) / 33) - 1; i++) {
                    g.fillRect((x + 3) + 33 * i, (y + 3) + 18 * a, 30, 15);
                }
            } else {
                for (int b = 0; b <= ((ww - 3) / 33) - 2; b++) {
                    g.fillRect((x + 21) + 33 * b, (y + 3) + 18 * a, 30, 15);
                    g.fillRect((x + 3), (y + 3) + 18 * a, 15, 15);//begin steentjes
                    g.fillRect(x + (((ww - 3) / 33) * 33 - 12), (y + 3) + 18 * a, 15, 15);
                }
            }
        }
    }
}
