package design.creatation.factory.impl;

import design.creatation.factory.ingredient.Veggies;

public class RedPepper implements Veggies {

    @Override
    public String something() {
        return "Red Pepper";
    }

}
