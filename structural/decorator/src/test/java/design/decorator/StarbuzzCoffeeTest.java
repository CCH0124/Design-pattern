package design.decorator;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import design.decorator.beverages.Beverage;
import design.decorator.beverages.impl.*;
import design.decorator.condiments.impl.Mocha;
import design.decorator.condiments.impl.Soy;
import design.decorator.condiments.impl.Whip;

public class StarbuzzCoffeeTest {

    @Test
    public void EspressoCoffeeTest() {
        Beverage beverage = new Espresso();
        assertEquals("Espresso Coffee", beverage.getDescription());
        assertEquals(1.99, beverage.cost(), 0.01);
    }

    @Test
    public void DarkRoastCoffeeTest() {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
        assertEquals("Dark Roast Coffee, Mocha, Mocha, Whip", beverage.getDescription());
        assertEquals(1.99 + 0.20 + 0.20 + 0.10, beverage.cost(), 0.01);
    }

    @Test
    public void HouseBlendCoffeeTest() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        assertEquals("House Blend Coffee, Soy, Mocha, Whip", beverage.getDescription());
        assertEquals(1.34,  beverage.cost());
    }
}
