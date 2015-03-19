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
public class Drinken extends MenuItem {

    private boolean koudOfWarm;
    private boolean metPrik;

    public Drinken(boolean koudOfWarm, boolean metPrik, String naam, double prijs, int calorieen) {
        super(naam, prijs, calorieen);
        this.koudOfWarm = koudOfWarm;
        this.metPrik = metPrik;

    }

    public boolean isKoudOfWarm() {

        if (koudOfWarm = true) {
            System.out.println("warm");
        } else {
            System.out.println("koud");
        }
        return false;
    }

    public boolean isMetPrik() {
        return metPrik;
    }

    @Override
    public String toString() {
        return "Drinken{" + "koud/Warm: " + koudOfWarm + ", Prik: " + metPrik;
    }

}
