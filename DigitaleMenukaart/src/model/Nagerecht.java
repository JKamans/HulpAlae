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
public class Nagerecht extends Gerecht {

    private String taart;
    private String ingrediënten;

    public Nagerecht(String taart, String ingrediënten, int rating, boolean isVegetarisch, String naam, double prijs, int calorieen) {
        super(rating, isVegetarisch, naam, prijs, calorieen);
        this.taart = taart;
        this.ingrediënten = ingrediënten;
    }

    //public Nagerecht(String appeltaart, String string, boolean b, String omas_appeltaart, int i, int i0) {
    //
    @Override
    public String toString() {
        return super.toString() + "\nSoort taart: " + taart + "\tingrediënten: " + ingrediënten + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

}
