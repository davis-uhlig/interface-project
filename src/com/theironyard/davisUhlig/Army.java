package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/24/17.
 */
class Army extends Soldier implements DroppingBombs{

    public Army(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak(){
        return "Hooah";
    }

    public String gunFight(){
        return "bang bang";
    }

    public String fistFight(){
        return "bam bam";
    }

    public Bomb callAirSupport(){
        return new Bomb();
    }

}
