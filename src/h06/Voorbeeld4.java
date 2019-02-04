package h06;
//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;

public class Voorbeeld4 extends Applet {

    int a, b, c;
    double uitkomst;



    public void init() {
        a = 8;
        b = 8;
        c = 3;
        uitkomst = a + b / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
    //1. Waarom is initialiseren van variabelen noodzakelijk?: omdat je de overzicht bedoud
    //2. Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?: omdat je je anders een voudmelding krijgt want je moet het afdwingen dat het een int word
    //3. Wat is de uitvoer van dit programma? Geef een verklaring.: de uitkomst is 5.0 want je doet 8 + 8 dat is vervolgens doe je 16 : 3 en dat is 5.333333 en omdat uitkomst double is word het dus met .33333 vertoond\
    //4. In de regel uitkomst = (a + b) / c; laat je de ronde haken weg. De regel ziet er dan als volgt uit:  uitkomst = a + b / c;
    //5. Wat is de uitvoer van dit programma? Geef een verklaring. de uitvoer is 10.0 want het antwoord word afgerond in een rond getal waar door je 10.0 krijgt inplaats van 10.6666666
}
