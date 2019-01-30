package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht404 extends Applet {

    @Override
    public void init() {
        setSize(800,800);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(50,100,50,700);
        g.drawLine(50,700,650,700);
        g.drawString("0",35,720);
        g.drawString("20",35,593);
        g.drawString("40",35,463);
        g.drawString("60",35,333);
        g.drawString("80",35,203);
        g.drawString("100",25,110);
        g.drawString("Valerie",80,720);
        g.setColor(Color.red);
        g.fillRect(50,463,100,237);
        g.setColor(Color.black);
        g.drawString("Jeroen",180,720);
        g.setColor(Color.green);
        g.fillRect(150,110,100,590);
        g.setColor(Color.black);
        g.drawString("Hans",280,720);
        g.setColor(Color.orange);
        g.fillRect(250,203,100,497);
    }
}
