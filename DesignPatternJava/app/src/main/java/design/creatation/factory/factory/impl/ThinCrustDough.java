package design.creatation.factory.factory.impl;

import design.creatation.factory.factory.ingredient.Dough;

public class ThinCrustDough implements Dough {

    @Override
    public String something() {
        return "Thin Crust Dough";
    }
    
}
