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
public class Hoofdgerecht extends Gerecht {

    private String pasta;
    private String ingrediënten;

    public Hoofdgerecht(String pasta, String ingrediënten, int rating, boolean isVegetarisch, String naam, double prijs, int calorieen) {
        super(rating, isVegetarisch, naam, prijs, calorieen);
        this.pasta = pasta;
        this.ingrediënten = ingrediënten;
    }

    @Override
    public String toString() {
        return super.toString() + "Pasta: " + pasta + "\nBestaat uit: " + ingrediënten;
    }

}
