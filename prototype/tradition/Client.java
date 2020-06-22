package prototype;

public class Client {
    Sheep sheep = new Sheep("tom", 5, "black");
    Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    //...
}