package strategypattern.ducksimulation;

public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.swim();
        duck.performFly();
        //we have dynamic ability from strategy patter we can set fly behaviour at run time
        duck.setFlyBehavior(new FlyNoWings());
        duck.performFly();
    }
}
