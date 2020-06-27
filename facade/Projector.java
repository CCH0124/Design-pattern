package facade;

public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector On");
    }

    public void off() {
        System.out.println(" Projector Off");
    }


    public void focus() {
        System.out.println(" Projector focus");
    }
}