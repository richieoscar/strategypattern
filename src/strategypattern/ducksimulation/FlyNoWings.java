package strategypattern.ducksimulation;

import interfaces.FlyBehavior;

public class FlyNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cant Fly");
    }
}
