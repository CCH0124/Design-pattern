package design.behavioral.behavior;

public class SqueakImpl implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println("Squeak");
        return "Squeak";
    }
    
}
