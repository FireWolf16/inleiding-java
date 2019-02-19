package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht141 extends Applet {

    double rand;
    double rand_;
    String kleur[] = {"harten", "schoppen", "klaver", "ruiten"};
    String symbool[] = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};

    String picked = "";

    Button picCard;

    public void init() {
        picCard = new Button("kies een kaart");
        picCard.addActionListener(new card());
        add(picCard);
    }

    public void paint(Graphics g) {
        g.drawString(picked,50,60);
    }

    class card implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rand = Math.random()*13;
            int r1 = (int) rand;
            rand_ = Math.random() * 4;
            int r2 = (int) rand_;

            picked = kleur[r2]+" "+symbool[r1];

            repaint();
        }
    }
}