package design.behavioral.duck;

import design.behavioral.behavior.FlyNoWayImpl;
import design.behavioral.behavior.SqueakImpl;
import design.behavioral.duck.Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWayImpl());
        setQuackBehavior(new SqueakImpl());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
    
}
