package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/24/17.
 */
public abstract class Soldier {
    String name;
    String rank;
    int serialNumber;

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

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
