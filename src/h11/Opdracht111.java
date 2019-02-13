package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht111 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int i;
        int x = 0;

        for(i = 0; i < 10; i++) {
            x += 20;
            g.drawLine(x , 20, x, 200 );
            g.drawString("" + i, x, 215 );
        }
    }
}

//Wat is het verschil tussen een while- en een for-lus?: Een For loop herhaalt het aantal keer dat je opgeeft. Bij een While loop stopt de herhaling pas als aan een bepaalde conditie wordt voldaan.
//Wat is het nesten van lussen?: het nesten van lussen is niets anders dan een for of while loop in een for of while loop.
//Bekijk de volgende broncode: De lus word uitgevoert maar er gebeurt allen niks
// int eind = 5;
//for(int i = 10;  i < eind;  i++) {
//     ....
//     ....
//}
