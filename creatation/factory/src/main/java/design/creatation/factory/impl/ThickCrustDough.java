package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Dough;

public class ThickCrustDough implements Dough {

    @Override
    public String something() {
        return "Thick Crust Dough";
    }
    
}
