package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/24/17.
 */
public interface MarineFight {
    public String gunFight();
    public String fistFight();
    default String grenadeThrow(){
        return "boom boom boom";
    }
}
