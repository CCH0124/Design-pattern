package design.creatation.simple;
public class CheesePizza extends PizzaAbstract {
    public CheesePizza() {
        this.name = "Chess";
    }
    @Override
    public void prepare() {
        System.out.println("給 Chesses 準備材料.... ");
    }
    
}