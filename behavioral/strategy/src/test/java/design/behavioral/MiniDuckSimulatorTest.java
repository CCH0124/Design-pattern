package design.behavioral;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import design.behavioral.behavior.SqueakImpl;
import design.behavioral.duck.Duck;
import design.behavioral.duck.MallardDuck;
import design.behavioral.duck.ModelDuck;

public class MiniDuckSimulatorTest {
    
    @Test
    void miniDuckSimulator() {
        Duck mallard = new MallardDuck();
        assertEquals("Quack", mallard.performQuack());
        assertEquals("I'm flying with wings", mallard.performFly());
        assertInstanceOf(Duck.class, mallard);

        Duck model = new ModelDuck();
        model.setQuackBehavior(new SqueakImpl());
        assertEquals("Squeak", model.performQuack());
        assertEquals("I can't fly", model.performFly());
        assertInstanceOf(Duck.class, model);
    }
}
