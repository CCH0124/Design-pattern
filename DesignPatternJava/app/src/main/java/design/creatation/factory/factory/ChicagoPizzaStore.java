package design.creatation.factory.factory;

import design.creatation.factory.factory.impl.ChicagoPizzaIngredientFactory;
import design.creatation.factory.factory.ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.name = "Chicago Style Cheese Pizza";

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.name = "Chicago Style Veggie Pizza";

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.name = "Chicago Style Clam Pizza";

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.name = "Chicago Style Pepperoni Pizza";

        }
        return pizza;
    }

}
