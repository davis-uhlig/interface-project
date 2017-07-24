package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/24/17.
 */
public class AirForce extends Soldier implements AirForceFight{

    public AirForce(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak(){
        return "Alpha to Charlie do you read?";
    }

    public String flyOver(){
        return "Vroom";
    }

    public String dropBomb(){
        return "BOOM!!!";
    }
}
