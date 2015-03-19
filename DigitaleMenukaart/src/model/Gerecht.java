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
public class Gerecht extends MenuItem {

    private int rating;
    private boolean vegetarisch;

    public Gerecht(int rating, boolean vegetarisch, String naam, double prijs, int calorieen) {
        super(naam, prijs, calorieen);
        this.rating = rating;
        this.vegetarisch = vegetarisch;
    }

    public boolean isVegetarisch() {
        return vegetarisch;
    }

    @Override
    public String toString() {
        String strVegetarisch = (vegetarisch) ? "Gerecht is vegetarisch\n" : "";
        return super.toString() + "\n" + rating + " sterren\n" + strVegetarisch;
    }

}
