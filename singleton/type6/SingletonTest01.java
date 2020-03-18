package singleton.type6;
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
    private static volatile Singleton instance;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }   
        }
        return instance;
    }
}