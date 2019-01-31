package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    @Override
    public void init() {
        setSize(800,800);

    }

    @Override
    public void paint(Graphics g) {
        //begin Lijn//
        g.drawLine(20,20,200,20);
        g.drawString("Lijn",90,40);
        //einde Lijn//

        //begin Rechthoek//
        g.drawRect(20,80,200,80);
        g.drawString("Rechthoek",90,180);
        //einde rechthoek//

        //begin gevulde rechthoek met ovaal//
        g.setColor(Color.magenta);
        g.fillRect(240,80,200,80);
        g.setColor(Color.black);
        g.drawArc(240, 80, 200, 80, 90, 360);
        g.drawString("gevulde rechthoek met ovaal",260,180);
        //einde gevulde rechthoek met ovaal//

        //begin Taartpunt met ovaal eromheen//
        g.drawArc(460, 80, 200, 80, 90, 360);
        g.setColor(Color.magenta);
        g.fillArc(460,80,200,80,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",480,180);
        //einde Taartpunt met ovaal eromheen//

        //begin afgeronde rechthoek//
        g.drawRoundRect(20,200,200,80,30,30);
        g.drawString("afgeronde rechthoek",60,300);
        //einde afgeronde rechthoek//

        //begin gevulde ovaall//
        g.setColor(Color.magenta);
        g.fillArc(240, 200, 200, 80, 90, 360);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",300,300);
        //einde gevulde ovaal//

        //begin cirkel//
        g.drawArc(510,190,100,100,0,360);
        g.drawString("cirkel",550,310);
    }
}
