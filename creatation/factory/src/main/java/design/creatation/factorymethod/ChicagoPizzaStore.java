package design.creatation.factorymethod;

import java.util.Optional;

public class ChicagoPizzaStore extends PizzaStore {
    
    @Override
    Optional<Pizza> createPizza(String item) {
        Pizza pizza = null;
        switch (item) {
            case "cheese" ->  pizza = new ChicagoStyleCheesePizza();
            case "veggie" ->  pizza = new ChicagoStyleVeggiePizza();
            case "clam"   ->  pizza = new ChicagoStyleClamPizza();
            default -> Optional.ofNullable(pizza);
        }

        return Optional.ofNullable(pizza);
    }
}
