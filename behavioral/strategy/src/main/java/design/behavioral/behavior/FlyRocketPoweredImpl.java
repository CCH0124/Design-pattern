package design.behavioral.behavior;

public class FlyRocketPoweredImpl implements FlyBehavior {
    @Override
    public String fly() {
        System.out.println("I'm flying with a rocket");
        return "I'm flying with a rocket";
    }
    
}
