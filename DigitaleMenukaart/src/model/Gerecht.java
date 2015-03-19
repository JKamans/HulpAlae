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
    private boolean isVegetarisch;

    public Gerecht(int rating, boolean isVegetarisch, String naam, double prijs, int calorieen) {
        super(naam, prijs, calorieen);
        this.rating = rating;
        this.isVegetarisch = isVegetarisch;
    }

    public boolean isIsVegetarisch() {

        if (isVegetarisch = true) {
            System.out.println("Gerecht is vegetarisch ");
        } else {
            System.out.println("");
        }
        return false;

    }

    @Override
    public String toString() {
        return super.toString() + rating + " steren\n" + isIsVegetarisch();
    }

}
