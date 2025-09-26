package design.decorator.beverages.impl;

import design.decorator.beverages.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
    
}
