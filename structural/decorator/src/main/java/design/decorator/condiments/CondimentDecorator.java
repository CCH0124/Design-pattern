package design.decorator.condiments;

import design.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    
    protected Beverage beverage;
    
    public abstract String getDescription();
    
}
