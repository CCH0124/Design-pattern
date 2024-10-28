package design.creatation.factory.simple;

public class SimplePizzaFactory {
    public PizzaAbstract createPizza(String type) {
        PizzaAbstract pizza = null;

        return switch (type) {
            case "cheese" -> pizza = new CheesePizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> pizza = new VeggiePizza();
            // case "cheese" -> pizza = new CheesePizza();
            default -> pizza;
        };
    }
}
