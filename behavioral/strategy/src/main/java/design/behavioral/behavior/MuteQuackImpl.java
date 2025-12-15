package design.behavioral.behavior;

public class MuteQuackImpl implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println("<< Silence >>");
        return "<< Silence >>";
    }
    
}
