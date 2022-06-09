package strategy;

import strategy.impl.FlyWithWings;
import strategy.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck () {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    void display() {
        System.out.println("I am a real Mallard duck.");
    }
}
