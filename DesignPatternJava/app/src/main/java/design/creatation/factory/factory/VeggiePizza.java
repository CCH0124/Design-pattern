package design.creatation.factory.factory;

import design.creatation.factory.factory.ingredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;
 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
   
    @Override
    void prepare() {
        System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
    }
    
}
