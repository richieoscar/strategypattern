package strategypattern.ducksimulation;

import interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("strategypattern.ducksimulation.Quack strategypattern.ducksimulation.Quack!!!");
    }
}
