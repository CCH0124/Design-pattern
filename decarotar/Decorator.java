package decarotar;

public class Decorator extends Drink {
    private Drink obj;

    @Override
    public float cost() {
        // TODO Auto-generated method stub
        return super.getPrice() + obj.cost();
    }

    public Decorator(Drink obj) { // 組合
        this.obj = obj;
    }

    @Override
    public String getdes() {
        // TODO Auto-generated method stub
        return super.getdes() + " " + super.getPrice() + "&&" + obj.cost();
    }
    
    
}