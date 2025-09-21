package design.behavioral.duck;

import design.behavioral.behavior.FlyNoWayImpl;
import design.behavioral.behavior.MuteQuackImpl;
import design.behavioral.duck.Duck;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWayImpl());
		setQuackBehavior(new MuteQuackImpl());
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
