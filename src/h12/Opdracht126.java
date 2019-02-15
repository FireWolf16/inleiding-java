package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Opdracht126 extends Applet {

    int getallen[] = {1, 5, 4, 8, 5, 1, 8, 2, 8, 3, 4, 5, 3, 6, 9, 7, 1, 1, 10, 2, 5, 10, 10, 1, 5, 10, 3, 5, 2, 5, 2};

    Label txt = new Label("vul een getal in dat tussen de 1 en de 10 zit (zonder decimalen)");
    TextField input = new TextField("", 30);
    Button enter = new Button("enter");

    int num_in = 0;
    int voorkom = 0;

    public void init() {

        enter.addActionListener(new klik());

        add(txt);
        add(input);
        add(enter);
    }

    public void paint(Graphics g) {
        g.drawString("het ingevulde getal komt "+voorkom+" keer voor in het array",50,70);
    }


    class klik implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            voorkom = 0;
            num_in = Integer.parseInt(input.getText());
            for (int i = 0; i < getallen.length; i++) {
                if (num_in == getallen[i]) {
                    voorkom++;
                }
            }
            repaint();
        }
    }

}