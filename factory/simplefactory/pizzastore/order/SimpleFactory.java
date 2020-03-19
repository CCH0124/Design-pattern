package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.PepperPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {
    /**
     * add Pizza 種類時只需修改此方法
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        System.out.println("Simple Factory");
        Pizza pizza = null;
        switch (type) {
            case "greek":
                pizza = new GreekPizza();
                pizza.setName("Greek Pizza");
                break;
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName("Cheese Pizza");
                break;
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName("Pepper Pizza");
                break;
            default:
                break;
        }
        return pizza;
    }
}