package design.behavioral.duck;

import design.behavioral.behavior.FlyWithWingsImpl;
import design.behavioral.behavior.QuackImpl;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWingsImpl());
		setQuackBehavior(new QuackImpl());

    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
    
}
