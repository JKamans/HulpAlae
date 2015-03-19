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

    private boolean koud;
    private boolean metPrik;

    public Drinken(boolean koud, boolean metPrik, String naam, double prijs, int calorieen) {
        super(naam, prijs, calorieen);
        this.koud = koud;
        this.metPrik = metPrik;
    }

    public boolean isKoud() {
        return koud;
    }

    public boolean isMetPrik() {
        return metPrik;
    }

    @Override
    public String toString() {
        String strKoud = (koud) ? "koud" : "warm";
        return "Drinken" + "\tKoud/warm: " + strKoud + ", Prik: " + metPrik + "\n";
    }

}
