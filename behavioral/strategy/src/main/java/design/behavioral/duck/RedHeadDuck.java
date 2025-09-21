package design.behavioral.duck;

import design.behavioral.behavior.FlyWithWingsImpl;
import design.behavioral.behavior.QuackImpl;
import design.behavioral.duck.Duck;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWingsImpl());
        setQuackBehavior(new QuackImpl());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
    
}
