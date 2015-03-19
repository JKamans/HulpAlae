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
        return rauwkost;
    }

    @Override
    public String toString() {
        String strRauwkost = (rauwkost) ? "met rauwkost" : "zonder rauwkost";
        return super.toString() +"Soort soep: " + soortSoep + "\t" + strRauwkost + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

}
