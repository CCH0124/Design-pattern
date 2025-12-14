package design.adapter.objectadapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import design.adapter.objectadapter.adaptee.Voltage220V;

public class ClientTest {
    @Test
    public void clientTest() {
        Phone phone = new Phone();
        assertEquals(phone.charging(new VoltageAdapter(new Voltage220V())), "Can use");
    }    
}
