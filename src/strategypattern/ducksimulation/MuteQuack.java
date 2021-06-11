package strategypattern.ducksimulation;

import interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Cant strategypattern.ducksimulation.Quack");
    }
}
