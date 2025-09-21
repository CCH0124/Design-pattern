package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Clams;

public class FreshClams implements Clams {

    @Override
    public String something() {
        return "Fresh Clams";
    }
    
}
