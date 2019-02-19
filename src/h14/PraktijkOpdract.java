package h14;

import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdract extends Applet {

    Image stick;
    URL path;
    Button speel;
    Button reset;
    TextField input;
    int sticks = 23;
    boolean userturn = true;
    boolean game_over = false;
    boolean user_lost = false;
    String stext = "";
    String stext_1 = "voer een 1, 2 of 3 in en klik op speel.";


    public void init() {
        setSize(400, 500);
        //---------------------------------------
        stext = stext_1;
        path = PraktijkOpdract.class.getResource("/h14/resources/");
        stick = getImage(path, "download (2).jpg");
        speel = new Button("speel");
        reset = new Button("reset");
        input = new TextField("", 10);
        //-----------------------------------------------------
        speel.addActionListener(new play());
        reset.addActionListener(new reset());
        //-------------------------------------------------
        add(input);
        add(speel);
        add(reset);
    }

    public void paint(Graphics g) {

        g.drawString(stext, 70, 50);
        for (int i = 0; i < sticks; i++) {
            g.drawImage(stick, 100 + 50 * (i % 4), 100 + 50 * (i / 4), 50, 50, this);
        }
    }

    int botPlays(int apples) {
        int botplays = 0;
        double random = Math.random() * 3 + 1;
        int r = (int) random;
        if ((sticks - 1) % 4 == 0) {
            botplays = r;
        } else {
            botplays = (sticks - 1) % 4;
        }
        System.out.println(" bot " + botplays);
        if (botplays < 0) {
            botplays = 0;
        }
        return botplays;
    }


    class play implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int userplay = 0;
            int bot = 0;
            if (Integer.parseInt(input.getText()) == 1 || Integer.parseInt(input.getText()) == 2 || Integer.parseInt(input.getText()) == 3) {
                userplay = Integer.parseInt(input.getText());
                userturn = true;
                sticks -= userplay;
                System.out.println(sticks);
                repaint();
                if (sticks <= 0 && game_over == false) {
                    if (userturn == true) {
                        user_lost = true;
                        game_over = true;
                    }
                }
                bot = botPlays(sticks);
                userturn = false;
                sticks -= bot;
                repaint();
                System.out.println(sticks);
                if (sticks <= 0 && game_over == false) {
                    if (userturn == false) {
                        user_lost = false;
                        game_over = true;
                    }
                }
                stext = "de bot koos " + bot + " appels om weg te halen.";
            } else {
                stext = "error: voer een geldig getal in!";
                repaint();
            }
            System.out.println(sticks);
            if (game_over == true) {
                if (user_lost == true) {
                    stext = "je hebt verloren!";
                } else {
                    stext = "je hebt gewonnen!";
                }
            }
            input.setText("");
            repaint();
            System.out.println(sticks);
            System.out.println("---");
        }
    }

    class reset implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input.setText("");
            stext = stext_1;
            sticks = 23;
            user_lost = false;
            game_over = false;
            userturn = true;
            repaint();
        }
    }
}
