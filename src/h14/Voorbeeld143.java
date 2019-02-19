package h14;

import java.awt.*;
import java.applet.*;
import java.awt.image.ImageObserver;
import java.net.URL;

public class Voorbeeld143 {

    private Image afbeelding;
    private URL pad;

    public void init() {
//        pad = Afbeelding.class.getResource("/resources/");
//        afbeelding = getImage(pad, "octopusgeisha_by_remiismeltingdots_d96475r-pre.jpg");
    }

    public void paint(Graphics g) {
        g.drawString(pad.toString(), 20, 10 );
        g.drawImage(afbeelding, 20, 20, 400, 300, (ImageObserver) this);
    }
}
