package com.theironyard.davisUhlig;

public class Main {

    public static void main(String[] args) {
        Marines marine = new Marines("Dave", "Private", 123);

        System.out.println("Marine Methods");
        System.out.println("---------------");
        System.out.println(marine.chew());
        System.out.println(marine.walk());
        System.out.println(marine.speak());
        System.out.println(marine.gunFight());
        System.out.println(marine.fistFight());
        System.out.println(marine.grenadeThrow());

        AirForce pilot = new AirForce("Ken", "General", 321);

        System.out.println("-----------------");
        System.out.println("Air Force Methods");
        System.out.println("------------------");
        System.out.println(pilot.walk());
        System.out.println(pilot.chew());
        System.out.println(pilot.speak());
        System.out.println(pilot.flyOver());
        System.out.println(pilot.dropBomb());

        System.out.println("-----------");
        System.out.println("Army Methods");
        System.out.println("-------------");

        Army army = new Army("Dan", "Private", 345);

        System.out.println(army.walk());
        System.out.println(army.chew());
        System.out.println(army.speak());
        System.out.println(army.callAirSupport());
    }
}
