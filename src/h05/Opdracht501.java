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
        //begin Lijn//
        g.drawLine(20,100,breedte,hoogte);
        //begin Rechthoek
        g.drawRect(20,200,breedte,hoogte);
        //begin gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(240,200,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawArc(240, 200, breedte, hoogte, 90, 360);
        //begin Taartpunt met ovaal eromheen
        g.drawArc(460, 200, breedte, hoogte, 90, 360);
        g.setColor(opvulkleur);
        g.fillArc(460,200,breedte,hoogte,0,45);
        //begin afgeronde rechthoek
        g.setColor(lijnkleur);
        g.drawRoundRect(20,340,breedte,hoogte,30,30);
        //begin gevulde ovaall
        g.setColor(opvulkleur);
        g.fillArc(240, 340, breedte, hoogte, 90, 360);
        //begin cirkel
        breedte = 100;
        g.setColor(lijnkleur);
        g.drawArc(510,340,breedte,hoogte,0,360);
    }


}
