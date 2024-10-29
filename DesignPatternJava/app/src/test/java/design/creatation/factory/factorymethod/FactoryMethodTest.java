package design.creatation.factory.factorymethod;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;



public class FactoryMethodTest {
    @Test
    public void fmTest() {
        var nyStore = new NYPizzaStore();
        var chicagoStore  = new ChicagoPizzaStore();
        var nyStoreChessPizza = nyStore.createPizza("cheese");
        var chicagoStoreChessPizza = chicagoStore.createPizza("cheese");
        assertInstanceOf(NYStyleCheesePizza.class, nyStoreChessPizza.get());
        assertInstanceOf(ChicagoStyleCheesePizza.class, chicagoStoreChessPizza.get());
        var nyStoreClamPizza = nyStore.createPizza("clam");
        var chicagoStoreClamPizza = chicagoStore.createPizza("clam");
        assertInstanceOf(NYStyleClamPizza.class, nyStoreClamPizza.get());
        assertInstanceOf(ChicagoStyleClamPizza.class, chicagoStoreClamPizza.get());
    }
}
