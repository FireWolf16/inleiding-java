package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht103 extends Applet {

    TextField text;
    int getal1,getal2,getal3,getal4,getal5,getal6,getal7,getal8,getal9,getal10,getal11,getal12,ingevoerd;
    String s,maand;

    @Override
    public void init() {
        //-------------------------
        text = new TextField("");
        text.addActionListener(new textListener());
        add(text);
    }

    class textListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            s = text.getText();
            ingevoerd = Integer.parseInt(s);
            if (ingevoerd == 1) {
                maand = "january 31 dagen";
            } else if (ingevoerd == 2){
                maand = "febuary 28 dagen";
            } else if (ingevoerd == 3){
                maand = "march 31 dagen";
            } else if (ingevoerd == 4){
                maand = "april 30 dagen";
            } else if (ingevoerd == 5){
                maand = "may 31 dagen";
            } else if (ingevoerd == 6){
                maand = "june 30 dagen";
            } else if (ingevoerd == 7){
                maand = "july 31 dagen";
            } else if (ingevoerd == 8){
                maand = "august 31 dagen";
            } else if (ingevoerd == 9){
                maand = "september 30 dagen";
            } else if (ingevoerd == 10){
                maand = "october 31 dagen";
            } else if (ingevoerd == 11){
                maand = "november 30 dagen";
            } else if (ingevoerd == 12){
                maand = "december 31 dagen";
            } else {
                maand = "er is geen maand";
            }
            repaint();
            }
        }


    @Override
    public void paint(Graphics g) {
        g.drawString("" + maand,20,20);
    }
}
