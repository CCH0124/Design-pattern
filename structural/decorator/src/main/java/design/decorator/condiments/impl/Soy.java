package design.decorator.condiments.impl;

import design.decorator.beverages.Beverage;
import design.decorator.condiments.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
    
}
