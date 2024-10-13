package design.creatation.singleton.type8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void singleton() {
        Singleton a = Singleton.INSTANCE;
        Singleton b = Singleton.INSTANCE;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        assertEquals(b, a);
    }
}
