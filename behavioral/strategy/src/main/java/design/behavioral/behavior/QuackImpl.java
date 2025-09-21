package design.behavioral.behavior;

public class QuackImpl implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println("Quack");
        return "Quack";
    }
}
