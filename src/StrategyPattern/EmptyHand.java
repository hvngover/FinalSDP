package StrategyPattern;

public class EmptyHand implements WeaponBehavior {

    public void attack() {
        System.out.println("I have no weapon");
    }

}