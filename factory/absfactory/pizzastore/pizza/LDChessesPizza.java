package factory.absfactory.pizzastore.pizza;
public class LDChessesPizza extends Pizza{

	@Override
	public void prepare() {
        // TODO Auto-generated method stub
        setName("London Chesses Pizza");
		System.out.println("London Chesses Pizza Prepare");
	}
}