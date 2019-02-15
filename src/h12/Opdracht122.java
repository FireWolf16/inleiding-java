package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;

public class Opdracht122 extends Applet {

    Button knop[] = new Button[25];

    @Override
    public void init() {
        for (int i = 0; i < 25; i++){
           knop[i] = new Button("knop " + String.valueOf(i+1));
           add(knop[i]);
        }
    }

    @Override
    public void paint(Graphics g) {

    }
}
