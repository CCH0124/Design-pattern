package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Pepperoni;

public class SlicedPepperoni implements Pepperoni {

    @Override
    public String something() {
        return "Sliced Pepperoni";
    }
    
}
