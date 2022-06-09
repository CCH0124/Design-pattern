package strategy;

import strategy.impl.FlyNoWay;
import strategy.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
