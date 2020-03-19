package factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
    /**
     * 當有好幾個分店可訂購時，新增一個口味要修改此代碼，違反 OCP 原則 將 Pizza 物件封裝到一個 class 中，當新增 Pizza
     * 時只需修改該類即可，有創見 Pizza 物件的代碼則不需修改
     */

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("Greek Pizza");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("Cheese Pizza");
            } else {
                break;
            }
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
