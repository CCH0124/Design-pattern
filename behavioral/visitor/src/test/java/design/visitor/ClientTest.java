package design.chainofresponsibility;

import design.visitor.*;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void clientTest() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
