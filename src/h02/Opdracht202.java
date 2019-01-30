package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht202 extends Applet {

    public void init(){
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Patrick", 50,50);
        g.setColor(Color.red);
        g.drawString("Laranjo", 50,70);
    }

}
