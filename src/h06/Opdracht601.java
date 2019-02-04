package h06;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.HierarchyBoundsListener;

public class Opdracht601 extends Applet {
    int Jan, Ali, Jeannette, Patrick;
    double winst;
    double bedragPP;

    @Override
    public void init() {
        Jan = 1;
        Ali = 1;
        Jeannette = 1;
        Patrick = 1;
        winst = 113;
        bedragPP = winst / (Jan + Ali + Jeannette + Patrick);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Jan: krijgt " + bedragPP + " euro", 20,20);
        g.drawString("Ali: krijgt " + bedragPP + " euro", 20,40);
        g.drawString("Jennette: krijgt " + bedragPP + " euro", 20,60);
        g.drawString("Patrick: krijgt " + bedragPP + " euro", 20,80);
    }
}
