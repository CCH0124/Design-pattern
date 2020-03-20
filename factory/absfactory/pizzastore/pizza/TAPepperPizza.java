package factory.absfactory.pizzastore.pizza;
public class TAPepperPizza extends Pizza{

	@Override
	public void prepare() {
        // TODO Auto-generated method stub
        setName("Taiwan Pepper Pizza");
		System.out.println("Taiwan Pepper Pizza Prepare");
	}
}