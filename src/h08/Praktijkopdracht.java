package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField text1;
    TextField text2;
    Button keer;
    Button Gedeeltdoor;
    Button plus;
    Button min;
    double getal1;
    double getal2;
    double uitkomst;

    @Override
    public void init() {
        setSize(600,400);
        text1 = new TextField("",20);
        text2 = new TextField("",20);
        keer = new Button("*");
        Gedeeltdoor = new Button("/");
        plus = new Button("+");
        min = new Button("-");
//        String s = text1.getText();
//        getal1 = Double.parseDouble( s );
//        String z = text2.getText();
//        getal2 = Double.parseDouble( z );
        //------------------------------------
        add(text1);
        add(text2);
        add(keer);
        add(Gedeeltdoor);
        add(plus);
        add(min);
        //------------------------------------
        keerListener ke = new keerListener();
        keer.addActionListener((ActionListener) ke);
        //------------------------------------
        geListener ge = new geListener();
        Gedeeltdoor.addActionListener((ActionListener) ge);
        //------------------------------------
        plusListener pl = new plusListener();
        plus.addActionListener((ActionListener) pl);
        //------------------------------------
        minListener mi = new minListener();
        min.addActionListener((ActionListener) mi);
        //------------------------------------


    }

    class keerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String a = text1.getText();
            getal1 = Double.parseDouble(a);
            String b = text2.getText();
            getal2 = Double.parseDouble(b);
            uitkomst = getal1 * getal2;
            text1.setText(String.valueOf(uitkomst));
            text2.setText("");
        }
    }

    class geListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String a = text1.getText();
            getal1 = Double.parseDouble(a);
            String b = text2.getText();
            getal2 = Double.parseDouble(b);
            uitkomst = getal1 / getal2;
            text1.setText(String.valueOf(uitkomst));
            text2.setText("");
        }
    }

    class plusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String a = text1.getText();
            getal1 = Double.parseDouble(a);
            String b = text2.getText();
            getal2 = Double.parseDouble(b);
            uitkomst = getal1 + getal2;
            text1.setText(String.valueOf(uitkomst));
            text2.setText("");
        }
    }

    class minListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String a = text1.getText();
            getal1 = Double.parseDouble(a);
            String b = text2.getText();
            getal2 = Double.parseDouble(b);
            uitkomst = getal1 - getal2;
            text1.setText(String.valueOf(uitkomst));
            text2.setText("");
        }
    }
    
    @Override
    public void paint(Graphics g) {

    }
}
