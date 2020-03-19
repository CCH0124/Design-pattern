package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.LDChessesPizza;
import factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
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