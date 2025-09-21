package design.behavioral.behavior;

public class FlyWithWingsImpl implements FlyBehavior {
    @Override
    public String fly() {
        System.out.println("I'm flying with wings");
        return "I'm flying with wings";
    }
    
}
