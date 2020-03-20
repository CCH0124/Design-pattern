package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.Pizza;
import factory.absfactory.pizzastore.pizza.TAChessesPizza;
import factory.absfactory.pizzastore.pizza.TAPepperPizza;

public class TAFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        // TODO Auto-generated method stub
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new TAChessesPizza();
                break;
            case "pepper":
                pizza = new TAPepperPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
    
}