package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.Pizza;
import factory.absfactory.pizzastore.pizza.LDChessesPizza;
import factory.absfactory.pizzastore.pizza.LDPepperPizza;

public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        // TODO Auto-generated method stub
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new LDChessesPizza();
                break;
            case "pepper":
                pizza = new LDPepperPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
    
}