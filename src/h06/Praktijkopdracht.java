package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    double getal1;
    double getal2;
    double getal3;
    double uitkomst;
    int test;
    double test2;


    @Override
    public void init() {
        getal1 = 5.9;
        getal2 = 6.3;
        getal3 = 6.9;
        uitkomst =(getal1 + getal2 + getal3) / 3;
        test = (int) uitkomst * 10;
        test2 = (double) test / 10;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("uitkomst " + test,20,20);
    }
}
