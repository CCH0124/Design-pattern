package factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizzaStaticSimpleFactor {

    String orderType = "";
    Pizza pizza = null;

    public OrderPizzaStaticSimpleFactor() {
        do {
            orderType = getType();
            pizza = StaticSimpleFactory.createPizza(orderType);
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
