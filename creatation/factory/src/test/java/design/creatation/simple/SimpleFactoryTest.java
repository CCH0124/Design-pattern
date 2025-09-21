package design.creatation.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {
    @Test
    public void createPizzaTest() {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        var pizza = pizzaStore.orderPizza("cheese");
        assertInstanceOf(CheesePizza.class, pizza);
        assertEquals(pizza.name, "Chess");
        pizza = pizzaStore.orderPizza("clam");
        assertInstanceOf(ClamPizza.class, pizza);
        assertEquals(pizza.name, "clam");
    }
}
