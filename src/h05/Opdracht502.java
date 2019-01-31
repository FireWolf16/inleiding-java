package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht502 extends Applet {

    int kg0;
    int kg20;
    int kg40;
    int kg60;
    int kg80;
    int kg100;
    //------------------------
    int h0;
    int h20;
    int h40;
    int h60;
    int h80;
    int h100;

    @Override
    public void init() {
        setSize(800,800);
        kg0 = 720;
        kg20 = 593;
        kg40 = 463;
        kg60 = 333;
        kg80 = 203;
        kg100 = 110;
        //-------------------
        h0 = 0;
        h20 = 108;
        h40 = 238;
        h60 = 368;
        h80 = 498;
        h100 = 590;
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
        //---------------------------------
        g.fillRect(50,kg60,100,h60);
        g.setColor(Color.black);
        g.drawString("Jeroen",180,720);
        g.setColor(Color.green);
        //----------------------------------
        g.fillRect(150,kg20,100,h20);
        g.setColor(Color.black);
        g.drawString("Hans",280,720);
        g.setColor(Color.orange);
        //------------------------------------
        g.fillRect(250,kg80,100,h80);
    }
}
