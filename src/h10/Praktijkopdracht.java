package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField text;
    Label antwoord;
    String s;
    double cijfer;
    Button reset;

    @Override
    public void init() {
        text = new TextField("",20);
        antwoord = new Label("");
        reset = new Button("reset");
        //----------------------------
        add(text);
        add(reset);
        add(antwoord);
        //----------------------------
        text.addActionListener(new textListener());
        reset.addActionListener(new resetListener());
    }

    class textListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            s = text.getText();
            cijfer = Double.parseDouble(s);
            switch((int) cijfer) {
                case 1:
                    antwoord.setText("slecht");
                    break;
                case 2:
                    antwoord.setText("slecht");
                    break;
                case 3:
                    antwoord.setText("slecht");
                    break;
                case 4:
                    antwoord.setText("onvoldoende");
                    break;
                case 5:
                    antwoord.setText("matig");
                    break;
                case 6:
                    antwoord.setText("voldoende");
                    break;
                case 7:
                    antwoord.setText("voldoende");
                    break;
                case 8:
                    antwoord.setText("goed");
                    break;
                case 9:
                    antwoord.setText("goed");
                    break;
                case 10:
                    antwoord.setText("goed");
                    break;
                default:
                    antwoord.setText("U heeft een ongeldig cijfer ingevoerd");
                    break;
            }
            repaint();
        }
    }

    class resetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cijfer = 0;
            antwoord.setText("");
            text.setText("");
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {

    }
}
