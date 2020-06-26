package decarotar;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order =  new LongBlack();
        System.out.println(order.getPrice());
        System.out.println(order.getdes());
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getdes());
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getdes());
    }
}