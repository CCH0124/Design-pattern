package design.adapter.classadapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void clientTest() {
        Phone phone = new Phone();
        assertEquals(phone.charging(new VoltageAdapter()), "Can use");
    }    
}
