package factory.absfactory.pizzastore.pizza;
public class TAChessesPizza extends Pizza{

	@Override
	public void prepare() {
        // TODO Auto-generated method stub
        setName("Taiwan Chesses Pizza");
		System.out.println("Taiwan Chesses Pizza Prepare");
	}
}