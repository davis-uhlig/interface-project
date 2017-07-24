package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/24/17.
 */
public class AirForce extends Soldier implements AirForceFight{
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
