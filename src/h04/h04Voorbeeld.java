package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class h04Voorbeeld extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 50);
        g.fillRect(20, 80, 100, 50);
//        g.drawRoundRect(20, 20, 100, 50, 10, 10);
//        g.drawOval(20, 20, 50, 100);
//        g.drawArc(20, 20, 100, 50, 90, 45);
//        g.fillArc(20, 20, 100, 50, 90, 45);
    }
    //1.Wat is een platform? : Een platform is een machine(processor) met een operating system
    //2.Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?: zo lang de cliant een JVM(Java Virtual Machine) heeft word de broncode omgezet in     //2.Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?: zo lang de cliant een JVM(Java Virtual Machine) heeft word de broncode omgezet in bytecode Vervolgens vertaalt de JVM tijdens de uitvoering de applicatie of de applet de bytecode in machinetaal.
    //3.Wat is bytecode?: bytecode is een tussentaal dat standaard is
    //4.Wat doet JVM?: JVM (Java Virtual Machine) zet de Bytecode om in machinetaal.
    //5.Met welke methode kun je een vierkant tekenen?: met de methode public void paint(Graphics g) {}
    //6.Noem drie methodes waarmee je een cirkel kunt tekenen:
    //7.Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?: omdat pain schilder/teken je op de scherm van daar de term paind
}


