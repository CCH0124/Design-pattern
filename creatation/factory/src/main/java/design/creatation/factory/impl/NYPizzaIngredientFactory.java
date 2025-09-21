package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Cheese;
import design.creatation.factory.ingredient.Clams;
import design.creatation.factory.ingredient.Dough;
import design.creatation.factory.ingredient.Pepperoni;
import design.creatation.factory.ingredient.PizzaIngredientFactory;
import design.creatation.factory.ingredient.Sauce;
import design.creatation.factory.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
    
}
