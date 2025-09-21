package design.behavioral.duck;
import design.behavioral.behavior.FlyWithWingsImpl;
import design.behavioral.behavior.QuackImpl;
import design.behavioral.duck.Duck;
import design.behavioral.behavior.FlyNoWayImpl;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehavior(new FlyNoWayImpl());
        setQuackBehavior(new QuackImpl());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
    
}
