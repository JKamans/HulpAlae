/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aladin
 */
public class Voorgerecht extends Gerecht {

    private boolean rauwkost;
    private String soortSoep;

    public Voorgerecht(boolean rauwkost, String soortSoep, int rating, boolean isVegetarisch, String naam, double prijs, int calorieen) {
        super(rating, isVegetarisch, naam, prijs, calorieen);
        this.rauwkost = rauwkost;
        this.soortSoep = soortSoep;
    }

    public boolean isRauwkost() {
        rauwkost = true;
        if (rauwkost = true) {
            System.out.println("met rauwkost ");
        } else {
            System.out.println("zonder rauwkost ");
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nSoort soep: " + soortSoep + "\t" + isRauwkost() + isVegetarisch(); //To change body of generated methods, choose Tools | Templates.
    }

}
