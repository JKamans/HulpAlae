/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Aladin
 */
public abstract class MenuItem implements Serializable, Comparable<MenuItem> {

    private String naam;
    private double prijs;
    private int calorieen;

    public MenuItem(String naam, double prijs, int calorieen) {
        this.naam = naam;
        this.prijs = prijs;
        this.calorieen = calorieen;
    }

    @Override
    public String toString() {
        return "naam: " + naam + "\tprijs: \u20ac" + prijs + "\tcalorieen: " + calorieen;
    }

    public int getCalorieen() {
        return calorieen;
    }

    @Override
    public int compareTo(MenuItem o) {
        if (this.getCalorieen() > o.getCalorieen()) {
            return 1;
        } else if (this.getCalorieen() < o.getCalorieen()) {
            return -1;
        } else {
            return 0;
        }

    }
}
