package design.singleton.type7;

public class Singleton {
    private Singleton() {

    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
    /**
     * 防止被反序化破壞
     * @return
     */
    public Object readResolve() {
        return SingletonInstance.INSTANCE;
    }
}