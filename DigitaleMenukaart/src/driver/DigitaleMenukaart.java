/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Drinken;
import model.Gerecht;
import model.Hoofdgerecht;
import model.MenuItem;
import model.Nagerecht;
import model.Voorgerecht;

/**
 *
 * @author Aladin
 */
public class DigitaleMenukaart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Alae's corner\n----MENU-----");

        List<MenuItem> menuitems = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Gerecht gerecht = new Gerecht(5, true, "Pasta" + i, i / 10.0, (int) (Math.random() * 500));
            menuitems.add(gerecht);

        }

        //System.out.println("\nVoorgerecht\n");
        Voorgerecht voorgerecht = new Voorgerecht(true, "tomatensoep", 4, true, "chinese tomatensoep", 5.20, 100);

        //System.out.println("\nHoofdgerecht\n");
        Hoofdgerecht hoofdgerecht = new Hoofdgerecht("Pasta carbonara", "paprika,champignons, uien, rookworst", 5, true, "pasta carbonara", 6.0, 150);
        //System.out.println("\nNagerecht\n");
        Nagerecht nagerecht = new Nagerecht("Appeltaart", " gezoete appels, honing , abrikozengelei", 4, true, "oma's appeltaart", 5, 200);

        for (int i = 0; i < menuitems.size(); i++) {
            System.out.println(menuitems.get(i));

        }

        try {
            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream("Test.dat"));
            for (int i = 0; i < menuitems.size(); i++) {
                output.writeObject(menuitems.get(i));// binair wegschrijven
            }
        } catch (IOException ex) {
            Logger.getLogger(DigitaleMenukaart.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("Test.dat"));
            while (true) {
                System.out.println(input.readObject());// binair ophalen
            }
        } catch (EOFException ex) {
            System.out.println("End of file reached.");
        } catch (IOException ex) {
            Logger.getLogger(DigitaleMenukaart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DigitaleMenukaart.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.util.Collections.sort(menuitems);
        for (int i = 0; i < menuitems.size(); i++) {
            System.out.println(menuitems.get(i));

        }
    }

}
