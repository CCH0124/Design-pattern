package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Veggies;

public class Mushroom implements Veggies {

    @Override
    public String something() {
        return "Mushroom";
    }
    
}
