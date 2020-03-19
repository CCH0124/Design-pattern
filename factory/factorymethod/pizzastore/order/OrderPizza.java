package factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
