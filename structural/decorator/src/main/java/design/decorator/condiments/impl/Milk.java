package design.decorator.condiments.impl;

import design.decorator.beverages.Beverage;
import design.decorator.condiments.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
    
}
