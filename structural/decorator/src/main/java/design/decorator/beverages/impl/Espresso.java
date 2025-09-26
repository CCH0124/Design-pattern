package design.decorator.beverages.impl;

import design.decorator.beverages.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
    
}
