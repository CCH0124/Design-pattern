package design.creatation.factory.factorymethod;

import java.util.Optional;

public class NYPizzaStore extends PizzaStore {

    @Override
    Optional<Pizza> createPizza(String item) {
        Pizza pizza = null;
        switch (item) {
            case "cheese" ->  pizza = new NYStyleCheesePizza();
            case "veggie" ->  pizza = new NYStyleVeggiePizza();
            case "clam"   ->  pizza = new NYStyleClamPizza();
            default -> Optional.ofNullable(pizza);
        }

        return Optional.ofNullable(pizza);
    }

	
}
