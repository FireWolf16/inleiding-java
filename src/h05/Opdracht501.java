package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht501 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    @Override
    public void init() {
        setSize(800,800);
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    @Override
    public void paint(Graphics g) {
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        // en zo voort...

    }


}
