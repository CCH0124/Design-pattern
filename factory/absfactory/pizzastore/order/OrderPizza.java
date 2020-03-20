package factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    private void setFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("Order fail");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = input.readLine();
            return str;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }
}