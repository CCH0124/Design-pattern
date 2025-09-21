package design.behavioral.behavior;

import design.behavioral.behavior.FlyBehavior;

public class FlyNoWayImpl implements FlyBehavior {
    @Override
    public String fly() {
        System.out.println("I can't fly");
        return "I can't fly";
    }
    
}
