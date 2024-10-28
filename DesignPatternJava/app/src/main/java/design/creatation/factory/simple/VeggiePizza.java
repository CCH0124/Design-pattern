package design.creatation.factory.simple;
public class VeggiePizza extends PizzaAbstract {
    public VeggiePizza() {
        this.name = "veggie";
    }

    @Override
    public void prepare() {
        System.out.println("給 Veggie 準備材料.... ");
    }
    
}