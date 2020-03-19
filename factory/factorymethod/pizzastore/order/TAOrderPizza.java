package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.TAChessesPizza;
import factory.factorymethod.pizzastore.pizza.TAPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;

public class TAOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
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