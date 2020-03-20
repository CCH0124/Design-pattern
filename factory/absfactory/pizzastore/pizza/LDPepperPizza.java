package factory.absfactory.pizzastore.pizza;
public class LDPepperPizza extends Pizza{

	@Override
	public void prepare() {
        // TODO Auto-generated method stub
        setName("London Pepper Pizza");
		System.out.println("London Pepper Pizza Prepare");
	}
}