package h14;

import java.awt.*;
import java.applet.*;
import java.net.URL;

public class Voorbeeld144 extends Applet {


    private URL pad;
    private AudioClip sound;

    public void init() {

//        pad = LoadAndPlay.class.getResource("/resources/");
//        sound = getAudioClip(pad, "scream.wav");

    }

    public void paint(Graphics g) {
        sound.play();
    }
}
