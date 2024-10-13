package design.creatation.singleton.type1;

public class Singleton {
    private Singleton() {}

    private final static  Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
