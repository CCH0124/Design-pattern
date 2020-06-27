package facade;

public class Popcorn {
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Popcorn On");
    }

    public void off() {
        System.out.println(" Popcorn Off");
    }


    public void pop() {
        System.out.println(" Popcorn pop");
    }
}