package factory.simplefactory.pizzastore.order;
public class PizzaStore {
    public static void main(String[] args) {
        // new OrderPizza();
        /**
         * simple factory
         */
        // new OrderPizza(new SimpleFactory());
        // System.out.println("exit");
        /**
         * static simple factory
         */
        new OrderPizzaStaticSimpleFactor();
    }
}