package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/24/17.
 */
public abstract class Soldier {
    String name;
    String rank;
    int serialNumber;

    public String sleep(){
        return "zzzzz";
    }

    public String chew(){
        return "nom nom nom";
    }

    public String walk(){
        return "trudge";
    }

    public abstract String speak();
}
