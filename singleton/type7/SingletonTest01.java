package singleton.type7;
public class SingletonTest01{
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

/**
 * static variable method
 */
class Singleton {
    private Singleton() {

    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}