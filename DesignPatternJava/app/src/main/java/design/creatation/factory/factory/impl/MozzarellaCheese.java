package design.creatation.factory.factory.impl;

import design.creatation.factory.factory.ingredient.Cheese;

public class MozzarellaCheese implements Cheese {

    @Override
    public String something() {
        return "Mozzarella Cheese";
    }
    
}
