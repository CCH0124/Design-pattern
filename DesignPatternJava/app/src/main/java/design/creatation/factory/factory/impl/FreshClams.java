package design.creatation.factory.factory.impl;

import design.creatation.factory.factory.ingredient.Clams;

public class FreshClams implements Clams {

    @Override
    public String something() {
        return "Fresh Clams";
    }
    
}
