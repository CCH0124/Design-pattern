package factory.absfactory.pizzastore.order;
public class PizzaStore{
    public static void main(String[] args) {
        // new OrderPizza(new TAFactory());
        new OrderPizza(new LDFactory());
    }
}