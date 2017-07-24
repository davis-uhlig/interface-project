package com.theironyard.davisUhlig;

public class Main {

    public static void main(String[] args) {
        Marines marine = new Marines();

        System.out.println(marine.speak());
        System.out.println(marine.gunFight());
        System.out.println(marine.fistFight());
        System.out.println(marine.grenadeThrow());

        AirForce pilot = new AirForce();

        System.out.println(pilot.speak());
        System.out.println(pilot.flyOver());
        System.out.println(pilot.dropBomb());

        class Army extends Soldier implements DroppingBombs{
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
        Army army = new Army();

        System.out.println(army.callAirSupport());
    }
}
