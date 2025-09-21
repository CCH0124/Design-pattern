package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Cheese;

public class MozzarellaCheese implements Cheese {

    @Override
    public String something() {
        return "Mozzarella Cheese";
    }
    
}
