package strategypattern.ducksimulation;

import interfaces.FlyBehavior;

public class FlyingWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly so high with my wings");
    }
}
