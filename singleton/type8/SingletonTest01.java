package singleton.type8;
public class SingletonTest01{
    public static void main(String[] args) {
        Singleton a = Singleton.INSTANCE;
        Singleton b = Singleton.INSTANCE;
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

enum Singleton {
    INSTANCE;
    public void method() {
        System.out.println("Method");
    }
}