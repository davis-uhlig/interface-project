package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/24/17.
 */
public class Marines extends Soldier implements MarineFight {

    public Marines(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak(){
        return "oorah";
    }
    public String gunFight(){
        return "bang bang";
    }

    public String fistFight(){
        return "bam bam";
    }


    public String grenadeThrow(){
        return "boom boom boom";
    }

}
