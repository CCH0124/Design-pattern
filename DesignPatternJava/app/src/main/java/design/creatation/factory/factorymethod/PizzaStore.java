package design.creatation.factory.factorymethod;

import java.util.Optional;

public abstract class PizzaStore {
    abstract Optional<Pizza> createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type).orElse(null);
        System.out.printf("Making a %s", pizza.name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
