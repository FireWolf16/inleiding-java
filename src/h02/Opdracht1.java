package h02;
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Opdracht1 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.MAGENTA);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 50, 60 );
    }

}

//1.Wat is machinetaal?: Machinetaal is een taal waarin instructies geschreven zijn die de processor van een computer direct kan uitvoeren.//
//2.Welke drie hulpmiddelen heb je nodig om te programmeren?: een computer, een IDE en internet//
//3.Hoe herken je opdrachten in de broncode? : Een opdracht zit in een Methoden//
//4.Waartoe dienen de import-opdrachten? : import gebruik je om externe file optehalen//
//5.Wat is een methode? : Methode is een extentie van een class in metode zitten altijd opdrachten//
