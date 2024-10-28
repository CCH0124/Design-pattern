package design.creatation.factory.simple;
public class ClamPizza extends PizzaAbstract {
    public ClamPizza() {
        this.name = "clam";
    }
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        System.out.println("給 Clam 準備材料.... ");
    }
    
}