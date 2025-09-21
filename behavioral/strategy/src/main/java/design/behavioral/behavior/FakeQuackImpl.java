package design.behavioral.behavior;

import design.behavioral.behavior.QuackBehavior;

public class FakeQuackImpl implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println("Fake Quack");
        return "Fake Quack";
    }
    
}
