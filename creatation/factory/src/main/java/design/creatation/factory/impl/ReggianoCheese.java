package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Cheese;

public class ReggianoCheese implements Cheese {

    @Override
    public String something() {
        return "Reggiano Cheese";
    }
    
}
