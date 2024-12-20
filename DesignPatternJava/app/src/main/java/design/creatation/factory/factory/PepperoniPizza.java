package design.creatation.factory.factory;

import design.creatation.factory.factory.ingredient.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;
 
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
    }
    
}
