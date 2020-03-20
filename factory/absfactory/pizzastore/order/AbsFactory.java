package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String type);
}