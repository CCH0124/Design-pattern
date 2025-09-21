package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Dough;

public class ThinCrustDough implements Dough {

    @Override
    public String something() {
        return "Thin Crust Dough";
    }
    
}
