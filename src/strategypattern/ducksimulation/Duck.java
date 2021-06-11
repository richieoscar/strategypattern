package strategypattern.ducksimulation;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

class Duck {
    /*
    STRATEGY PATTERN FOR A DUCK SIMULATION PROGRAM

    Delegating the fly and quack behaviors to interface
    This gives flexibility
     */
    public FlyBehavior mFlyBehavior;
    public QuackBehavior mQuackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("I can swim");
    }
    public void display(){
        System.out.println("I am a duck");
    }

    public void performFly(){
        mFlyBehavior.fly();
    }

    public void performQuack(){
        mQuackBehavior.quack();
    }
}
