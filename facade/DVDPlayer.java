package facade;

public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" DVD On");
    }

    public void off() {
        System.out.println(" DVD Off");
    }

    public void pause() {
        System.out.println(" DVD Pause");
    }

    public void play() {
        System.out.println(" DVD Play");
    }
}