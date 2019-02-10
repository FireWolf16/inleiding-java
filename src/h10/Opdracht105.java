package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;

public class Opdracht105 extends Applet {

    TextField text;
    Button add;
    Label OnVo;
    Label gem;
    double cijfer, totaalcijfer,gemmidelde;
    int i;
    String s;
    @Override
    public void init() {
        setSize(800,200);
        text = new TextField("",20);
        add = new Button("bereken");
        OnVo = new Label("");
        gem = new Label("");
        //-----------------------------------------
        add(text);
        add(add);
        add(OnVo);
        add(gem);
        //-----------------------------------------
        add.addActionListener(new addListener());
    }

    public class addListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            s = text.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer >= 5.5) {
                OnVo.setText("voldoende");
                repaint();
            } else {
                OnVo.setText("onvoldoende");
                repaint();
            }
            totaalcijfer += cijfer;
            gemmidelde = totaalcijfer / i;
            gem.setText(String.valueOf(gemmidelde));
            repaint();
        }
    }



    @Override
    public void paint(Graphics g) {

    }
}
