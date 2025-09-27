package design.singleton.type3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void singleton() {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        assertEquals(b, a);
    }

    @Test
    public void multiThreadSingleton() throws Exception {
        // 創建執行緒池
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // 提交兩個同時調用 getInstance() 的任務
        Future<Singleton> future1 = executor.submit(Singleton::getInstance);
        Future<Singleton> future2 = executor.submit(Singleton::getInstance);

        // 獲取兩個執行結果
        Singleton instance1 = future1.get();
        Singleton instance2 = future2.get();

        // 驗證在多執行緒環境下是否會產生不同的實例
        if (instance1 != null && instance2 != null && instance1 != instance2) {
            System.out.println("UnsafeSingleton is not thread-safe.");
            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        }
        assertNotEquals(instance1, instance2, "Instances are the same in multi-thread environment, singleton is thread-safe.");
        
        // 關閉執行緒池
        executor.shutdown();
    }
}
