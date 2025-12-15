package design.behavioral.behavior;

public class FakeQuackImpl implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println("Fake Quack");
        return "Fake Quack";
    }
    
}
