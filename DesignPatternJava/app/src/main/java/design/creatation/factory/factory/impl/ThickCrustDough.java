package design.creatation.factory.factory.impl;

import design.creatation.factory.factory.ingredient.Dough;

public class ThickCrustDough implements Dough {

    @Override
    public String something() {
        return "Thick Crust Dough";
    }
    
}
