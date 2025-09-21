package design.behavioral.behavior;

import design.behavioral.behavior.QuackBehavior;

public class MuteQuackImpl implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println("<< Silence >>");
        return "<< Silence >>";
    }
    
}
