package design.creatation.factory.factory.impl;

import design.creatation.factory.factory.ingredient.Cheese;
import design.creatation.factory.factory.ingredient.Clams;
import design.creatation.factory.factory.ingredient.Dough;
import design.creatation.factory.factory.ingredient.Pepperoni;
import design.creatation.factory.factory.ingredient.PizzaIngredientFactory;
import design.creatation.factory.factory.ingredient.Sauce;
import design.creatation.factory.factory.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), 
            new Spinach(), 
            new Eggplant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
    
}
