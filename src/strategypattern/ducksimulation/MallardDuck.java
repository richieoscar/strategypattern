package strategypattern.ducksimulation;

public class MallardDuck  extends Duck {

    public MallardDuck(){
        mFlyBehavior = new FlyingWithWings();
        mQuackBehavior = new Quack();
    }
    @Override
    public void swim() {
        System.out.println("Mallard Swimming");
    }

    @Override
    public void display() {
        System.out.println("I am a mallard strategypattern.ducksimulation.Duck");
    }


}
