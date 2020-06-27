package facade;

public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight On");
    }

    public void off() {
        System.out.println(" TheaterLight Off");
    }

    public void dim() {
        System.out.println(" TheaterLight Dim");
    }

    public void bright() {
        System.out.println(" TheaterLight Bright");
    }
    
}